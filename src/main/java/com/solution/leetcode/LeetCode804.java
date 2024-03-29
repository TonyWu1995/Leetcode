package com.solution.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode804 {

//    International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
//
//    For convenience, the full table for the 26 letters of the English alphabet is given below:
//
//            [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
//    Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.
//
//    Return the number of different transformations among all words we have.
//
//            Example:
//    Input: words = ["gin", "zen", "gig", "msg"]
//    Output: 2
//    Explanation:
//    The transformation of each word is:
//            "gin" -> "--...-."
//            "zen" -> "--...-."
//            "gig" -> "--...--."
//            "msg" -> "--...--."
//
//    There are 2 different transformations, "--...-." and "--...--.".

    public static void main(String[] args) {
        LeetCode804 leetCode804 = new LeetCode804();
        String words[] = new String[]{"gin", "zen", "gig", "msg"};
        int result = leetCode804.uniqueMorseRepresentations(words);
        System.out.println(result);

    }


    public int uniqueMorseRepresentations(String[] words) {
        String morse[] = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "src/test", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> morseSet = new HashSet<>();

        for (String str : words) {
            StringBuilder builder = new StringBuilder();
            for (char c : str.toCharArray()) {
                builder.append(morse[c - 'a']);
            }
            morseSet.add(builder.toString());
        }

        return morseSet.size();
    }

}
