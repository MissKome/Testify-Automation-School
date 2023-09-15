package OneWeekChallenge;
//Reverse the position of words in "I am the best AutomationTester" using recursion:
public class Challenge2 {
    public static void main(String[] args) {

        // Input string to reverse the position of words
        String input = "I am the best AutomationTester";

        // Call the method to reverse the words
        String reversed = reverseWords(input);

        // Print the reversed string
        System.out.println("Reversed word: " + reversed);
    }

    // Method to reverse the position of words in a string using recursion
    public static String reverseWords(String input) {
        if (input.isEmpty()) {    //if the input is empty return it as it is
            return input;
        }
        int space = input.indexOf(" ");

        if (space == -1) {  //if there are no more spaces, return the input
            return input;

        } else {
            // Split the input into the current word and the remaining part.
            String currentWord = input.substring(0, space);
            String remainingWords = input.substring(space + 1);

            // Recursively reverse the remaining words and concatenate them with the current word.
            return reverseWords(remainingWords) + " " + currentWord;
        }

    }
}