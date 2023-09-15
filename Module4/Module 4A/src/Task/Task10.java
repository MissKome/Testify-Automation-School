package Task;
//Create a method that verify that visitors on the slack channel are coming fot testify Trainings. If they write" Testify" then print out a  welcome messsage if not , theuser should be shown rejection message. after creating this method,then invoke the created method in your main method
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
