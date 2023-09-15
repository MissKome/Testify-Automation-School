package Task;
//Build a Simple interest calculator. Write a program to ask the user for the necessary field you need in calculating the simple interest and then communicate the simple interest back to the user is a good sentence
import java.util.Scanner;

public class Task8 { //a simple interest calculator
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the Principal:"); //input for principal
        short principal = userInput.nextShort();

        System.out.println("Enter the Rate:"); //input for rate
        short rate = userInput.nextShort();

        System.out.println("Enter the Time in Years:"); //input for time in years
        short time = userInput.nextShort();

        int simpleInterest = (principal * time * rate ) / 100;  //simple interest formula

        System.out.println("Simple interest = " + simpleInterest);


    }
}
