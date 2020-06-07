package com.solution.leetcode;

public class LeetCode1108 {

//    Given a valid (IPv4) IP address, return a defanged version of that IP address.
//
//    A defanged IP address replaces every period "." with "[.]".
//
//
//
//    Example 1:
//
//    Input: address = "1.1.1.1"
//    Output: "1[.]1[.]1[.]1"
//    Example 2:
//
//    Input: address = "255.100.50.0"
//    Output: "255[.]100[.]50[.]0"

    public static void main(String[] args) {
        LeetCode1108 leetCode1108 = new LeetCode1108();
        System.out.println(leetCode1108.defangIPaddr("1.1.1.1"));
    }


    public String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }
}
