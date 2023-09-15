package Task;
//I have a list of numbers, 1-10, write a loop that prints odd if it is an odd number and a loop that prints even if it is an even number.
public class Task9A { //a loop that prints odd if it is an odd number and a loop that prints even if it is an even number.

    public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        }
    }

