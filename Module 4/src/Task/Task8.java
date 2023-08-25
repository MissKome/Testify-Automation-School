package Task;

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
