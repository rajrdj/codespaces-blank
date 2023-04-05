package Grouptest1set1;

import java.util.*;
public class AmazingStrings{
public static String amazingStrings(String first, String second, String third) {
    int[] freq = new int[26]; // frequency array for characters

    // Count frequency of characters in the first string
    for (int i = 0; i < first.length(); i++) {
        freq[first.charAt(i) - 'A']++;
    }

    // Count frequency of characters in the second string
    for (int i = 0; i < second.length(); i++) {
        freq[second.charAt(i) - 'A']++;
    }

    // Check if all characters of third string are present in the first two strings
    for (int i = 0; i < third.length(); i++) {
        char ch = third.charAt(i);
        if (freq[ch - 'A'] == 0) {
            return "NO";
        } else {
            freq[ch - 'A']--;
        }
    }

    // Check if the frequency of all characters is zero
    for (int i = 0; i < 26; i++) {
        if (freq[i] != 0) {
            return "NO";
        }
    }

    return "YES";
}



}
