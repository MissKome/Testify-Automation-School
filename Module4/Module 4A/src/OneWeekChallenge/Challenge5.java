package OneWeekChallenge;
//Create anagram buckets from a given input array of words:input is {"akka", "akak", "baab", "baba", "bbaa"
import java.util.*;

public class Challenge5 {
        public static void main(String[] args) {
            String[] input = {"akka", "akak", "baab", "baba", "bbaa"};
            Map<String, List<String>> anagramsMap = anagramBuckets(input);

            // Iterate through the map and print each bucket
            for (Map.Entry<String, List<String>> entry : anagramsMap.entrySet()) {
                String key = entry.getKey();
                List<String> anagramBucket = entry.getValue();
                System.out.println("Anagrams with signature " + key + ": " + anagramBucket);
            }
        }

        // Function to create anagram buckets from an array of words
        private static Map<String, List<String>> anagramBuckets(String[] input) {
            // Initialize a HashMap to store anagram buckets
            Map<String, List<String>> anagramsMap = new HashMap<>(100);

            // Iterate through each word in the input array
            for (String s : input) {
                // Convert the word to a character array
                char[] word = s.toCharArray();

                // Sort the characters to create an anagram signature
                Arrays.sort(word);
                String key = String.valueOf(word);

                // Check if the anagram signature is already a key in the HashMap
                if (!anagramsMap.containsKey(key)) {
                    // If not, create a new entry with an empty list as the value
                    anagramsMap.put(key, new ArrayList<>());
                }

                // Add the word to the list associated with its anagram signature key
                anagramsMap.get(key).add(s);
            }

            // Return the map containing anagram buckets
            return anagramsMap;
        }

    }



