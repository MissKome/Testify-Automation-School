package Task;

public class Task3 {
    public static void main(String[] args) {
        int age = 22;
        String myAge = "I am ";
        String newString = myAge + age + " years old.";

        System.out.println(newString);

        System.out.println(myAge.concat(age + " years old."));
    }
}
