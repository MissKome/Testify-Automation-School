package Task;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        String [] [] doubleDimension = new String[4][3];
        //filling the first column with fruits
        doubleDimension[0] [0] = "Apple";
        doubleDimension[1] [0] = "Banana";
        doubleDimension[2] [0] = "Mango";
        doubleDimension[3] [0] = "Orange";

        System.out.println(Arrays.deepToString(doubleDimension));

    }
}
