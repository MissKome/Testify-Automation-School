package OneWeekChallenge;
//Write  a  Javacode  to  check  for  the Prime  numbers between 1-100
public class Challenge4 {
    public static void main(String[] args) {
        int number = 100;

        // Loop through numbers from 1 to 100 to find prime numbers.
        for (int j = 1; j <= number; j++) {
            int count = 0; // Initialize the count of divisors for each number.

            // Check for divisors by iterating from 1 to the current number (j).
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++; // Increment count for each divisor.
                }
            }

            // If count is 2, it means the number is prime (divisible by 1 and itself).
            if (count == 2) {

                System.out.print(j + " "); // Print the prime number.
            }
        }
    }
}
