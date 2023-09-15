package OneWeekChallenge;
//Write  Java  code  to  check  if  racecar  and  10801  is  apalindromes
public class Challenge1 {
    public static void main(String[] args) {
        // Check if "Racecar" is a palindrome string
        String check = "Racecar";

        // Reverse the string using StringBuilder
        String reverseS = new StringBuilder(check).reverse().toString();

        // Check if the reversed string is equal to the original
        if (reverseS.equalsIgnoreCase(check)){
            System.out.println(check + " is a palindrome string");

        }else {
            System.out.println(check + " is not a palindrome string");


        }
        // Check if the integer 10801 is a palindrome number
        int num = 10801;
        int number = num;
        int reversedNum = 0;

        // Reverse the number
        while ( num > 0){
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num = num / 10;
        }
        // Check if the reversed number is equal to the original
        if (number == reversedNum) {
            System.out.println(number+ " is a palindrome number");
        } else {
            System.out.println(number + " is not a palindrome number");
        }
    }

}
