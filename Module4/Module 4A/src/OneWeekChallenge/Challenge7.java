package OneWeekChallenge;
//Reverse "TestifyAutomation" using recursion in Java
public class Challenge7 {

    public static void main(String[] args) {
        // Input string to reverse
        String input = "TestifyAutomation";
        Challenge7 object = new Challenge7();  // Create an instance of the Challenge7 class
        String reversed = object.reverse(input);  // Call the reverse method to reverse the string
        System.out.println(reversed);  // Print the reversed string

    }

    // Method to reverse a string using recursion
    public String reverse(String input) {
        if (input.isEmpty()) {   //If the input is empty, return it as it is
            return input;
        }
        return reverse(input.substring(1)) + input.charAt(0); //        // Recursively reverse the remaining part of the string and concatenate with the first character


    }
}
