package OneWeekChallenge;
//Given a collection of 1 million integers, all ranging between1 to 9, sort them in Big O(n) timeJAVA CODING CHALLENGE

public class Challenge8 {

    public static void main(String[] args) {
        int[] array = {4, 2, 2, 8, 3, 3, 1, 9, 5, 7, 6, 1, 8, 5, 6, 4, 2, 3, 7, 9};
        int min = 1;
        int max = 9;

        int[] sortedArray = countingSort(array, min, max);

        // Print the sorted array
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] countingSort(int[] array, int min, int max) {
        int range = max - min + 1;
        int[] result = new int[array.length];
        int[] counts = new int[range];

        // Count occurrences of each value in the input array
        for (int num : array) {
            counts[num - min]++;
        }

        int index = 0;
        // Reconstruct the sorted array using counts
        for (int i = 0; i < range; i++) {
            while (counts[i] > 0) {
                result[index] = i + min; // Add min to get the original value
                counts[i]--;
                index++;
            }
        }

        return result;
    }

   }


