package Task;
//Create a variable and store your age in it. concatenate your age with a string and print it out on the console using the two methods of conacatenation youwere taught
public class Task3 {
    public static void main(String[] args) {
        int age = 22;
        String myAge = "I am ";

        // Concatenate the string 'myAge', the 'age' variable, and " years old." into 'newString'
        String newString = myAge + age + " years old.";

        // Print the concatenated string using the 'newString' variable
        System.out.println(newString);

        System.out.println(myAge.concat(age + " years old."));
    }
}
