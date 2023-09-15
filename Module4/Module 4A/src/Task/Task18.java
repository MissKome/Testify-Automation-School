package Task;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner userInput = null;
        try {
            userInput = new Scanner(System.in);

            System.out.println("Enter your age:"); //input for age
            int age = userInput.nextInt();

        } catch (Exception mismatchException) {   //error handling
            System.out.println("Error! only accepts numbers.");

        }

    }

    }
