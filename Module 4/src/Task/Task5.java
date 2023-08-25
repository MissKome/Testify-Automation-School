package Task;

public class Task5 {
    public static void main(String[] args) {
        int number = 19;

        if (number % 3 == 0 && number % 5 == 0) {   //If the number is divisible by 3 and 5 both
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {          //If the number is divisible by 3
            System.out.println("Fizz");
        } else if (number % 5 == 0) {           //If the number is divisible by 5
            System.out.println("Buzz");
        } else {
            System.out.println("Not a part of my number.");
        }
    }
}
