package com.solution.leetcode;

import java.util.Stack;

public class LeetCode1342 {

    public static void main(String[] args) {
        LeetCode1342 leetCode1342 = new LeetCode1342();
        leetCode1342.numberOfSteps(14);
    }

    public int numberOfSteps(int num) {
        final Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            stack.push(num);
        }
        return stack.size();
    }


}
