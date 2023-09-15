package OneWeekChallenge;
//find two numbers of which the product is maximum in anarray
import java.util.Arrays;

public class Challenge3 {
    public static void main(String[] args) {
        int[] array = {10, 5, 2, 3, 7, 8, 9};

        // Sort the array in ascending order
        Arrays.sort(array);

        // Get the two largest numbers
        int firstNumber = array[array.length - 1]; // Largest number
        int secondNumber = array[array.length - 2]; // Second largest number

        // Calculate and print the maximum product
        int maxProduct = firstNumber * secondNumber;

        System.out.println("First largest number = " + firstNumber + ", Second largest number = " + secondNumber);

        System.out.println("Maximum product = " + maxProduct);

    }

}
