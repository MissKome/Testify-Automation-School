package Task;

public class Task6 {
    public static void main(String[] args) {
        String organise = "Democracy";

        String reverse = new StringBuilder(organise).reverse().toString();

        System.out.println(reverse);
        System.out.println(reverse.substring(4, 8));

    }
}
