package OneWeekChallenge;
// Using  Java  Code,  check  for  Anagrams  in  these  strings:"Despite commuting at the peek hour, she was able to keep to time

import java.util.*;

public class Challenge6 {
    public static void main(String[] args) {
        // Input string to find anagrams in
        String inputString = "Despite commuting at the peek hour, she was able to keep totime";

        // Call the method to find anagrams
        List<String> anagrams = findAnagrams(inputString);

        // Check if any anagrams were found
        if (anagrams.isEmpty()) {
            System.out.println("No anagrams found.");
        } else {
            // Print the list of anagrams
            System.out.println("Anagrams found: " + anagrams);
        }
    }

    // Method to find anagrams in the input string
    public static List<String> findAnagrams(String inputString) {
        List<String> anagrams = new ArrayList<>();

        // Split the input string into words using whitespace as the delimiter
        String[] words = inputString.split("\\s+");

        // Create a map to store anagram buckets
        Map<String, List<String>> anagramMap = new HashMap<>();

        // Loop through each word in the input
        for (String word : words) {
            // Remove punctuation and convert to lowercase for consistent comparison
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Sort the characters of the word to create an anagram signature
            char[] charArray = cleanedWord.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Add the word to the corresponding anagram bucket
            if (!anagramMap.containsKey(sortedWord)) {
                anagramMap.put(sortedWord, new ArrayList<>());
            }

            anagramMap.get(sortedWord).add(word);
        }

        // Collect words that have anagrams (bucket size > 1)
        for (List<String> anagramBucket : anagramMap.values()) {
            if (anagramBucket.size() > 1) {
                anagrams.addAll(anagramBucket);
            }
        }

        return anagrams;
    }


    }

