package Task;

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
