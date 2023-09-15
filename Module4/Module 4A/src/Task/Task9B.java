package Task;
//Write a logic that takes in input from the user. It keeps printing "try again "until the user enters "testify"
import java.util.Scanner;

public class Task9B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (true) {
            System.out.print("Enter something: ");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("testify")) {
                break;
            }

            System.out.println("Try again.");
        }

    }
}
