package com.solution.bridgewell;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public static List<String> matchingBraces(List<String> braces) {
        List<String> resultList = new ArrayList<>();
        if (braces.isEmpty()) {
            resultList.add("NO");
            return resultList;
        }
        for (String s : braces) {
            char[] chars = s.toCharArray();
            List<Character> tempCharList = new ArrayList<>();
            boolean isCorrect = true;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '{' || chars[i] == '[' || chars[i] == '(') {
                    tempCharList.add(chars[i]);
                }
                if (tempCharList.isEmpty()) {
                    isCorrect = false;
                    break;
                }
                if (chars[i] == '}' || chars[i] == ']' || chars[i] == ')') {
                    char character = tempCharList.get(tempCharList.size() - 1);
                    if ((character == '{' && chars[i] == '}') ||
                            (character == '[' && chars[i] == ']') ||
                            (character == '(' && chars[i] == ')')) {
                        tempCharList.remove(tempCharList.size() - 1);
                    } else {
                        isCorrect = false;
                        break;
                    }
                }
            }
            if (!tempCharList.isEmpty()) {
                isCorrect = false;
            }
            if (isCorrect) {
                resultList.add("YES");
            } else {
                resultList.add("NO");
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<String> braces = new ArrayList<>();
        braces.add("}][}}(}][))]");// NO
        braces.add("{}[]()"); //YES
        braces.add("{[}]}"); //NO
        braces.add("{[}] "); //NO
        braces.add("{{"); //NO
        braces.add("{{()"); //NO
//        braces.add("(({{{()}}}))[][][]{");
//                "((((((()[])){}))[]{{{({({({{{{{{}}}}}})})})}}}))[][][]{"); //NO
        braces.add("[{()()}({[]})]({}[({})])((((((()[])){}))[]{{{({({({{{{{{}}}}}})})})}}}))[][][]{"); //NO
//        {[()}]
//[{()()}({[]})]({}[({})])((((((()[])){}))[]{{{({({({{{{{{}}}}}})})})}}}))[][][]{
        List<String> list = matchingBraces(braces);
        System.out.println(list);

    }

}
