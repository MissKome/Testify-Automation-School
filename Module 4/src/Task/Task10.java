package Task;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Task10 methodVar = new Task10();
        methodVar.verifyVisitors();
    }

    public void verifyVisitors() {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("Testify")) {
            System.out.println("Welcome to the Testify Trainings channel!");
        } else {
            System.out.println("Sorry, you are not authorized.");
        }
    }
}
