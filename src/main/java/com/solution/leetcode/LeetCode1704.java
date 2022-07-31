package com.solution.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode1704 {

    public boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int count = 0;
        int mid = s.length() / 2;
        for (int i = 0; i < s.length() / 2; i++) {
            if (set.contains(s.charAt(i))) {
                count++;
            }
            if (set.contains(s.charAt(mid + i))) {
                count--;
            }
        }
        return count == 0;
    }


    public static void main(String[] args) {
        LeetCode1704 leetCode1704 = new LeetCode1704();
        System.out.println(leetCode1704.halvesAreAlike("book"));
        System.out.println(leetCode1704.halvesAreAlike("textbook"));
        System.out.println(leetCode1704.halvesAreAlike("teetbook"));
        System.out.println(leetCode1704.halvesAreAlike("teatbook"));
    }

}
