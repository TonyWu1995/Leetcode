package com.solution.bridgewell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution2 {

    public static void closestNumbers(List<Integer> numbers) {
        if (numbers.size() <= 1)
            return;
        Collections.sort(numbers);
        int minDiff = numbers.get(1) - numbers.get(0);
        for (int i = 2; i < numbers.size(); i++) {
            minDiff = Math.min(minDiff, numbers.get(i) - numbers.get(i - 1));
        }
        System.out.println(minDiff);
        for (int i = 1; i < numbers.size(); i++) {
            if ((numbers.get(i) - numbers.get(i - 1)) == minDiff) {
                System.out.println(numbers.get(i - 1) + " " + numbers.get(i));
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(2);
        numbers.add(4);
        numbers.add(10);
        closestNumbers(numbers);
    }

}
