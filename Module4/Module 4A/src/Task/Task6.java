package Task;
//Write a code to reverse the string DEMOCRACY and get the word COME out of it.
public class Task6 {
    public static void main(String[] args) {
        String organise = "Democracy";  // Declare and initialize the original string

        String reverse = new StringBuilder(organise).reverse().toString();  // Reverse the original string using StringBuilder


        System.out.println("Reversed word: " + reverse);  // Print the reversed string

        System.out.println("Extracted word: " + reverse.substring(4, 8));  // Print the extracted word


    }
}
