package com.solution.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.
//
//It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.
//
//
//
//Example 1:
//
//Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
//Output: "Sao Paulo"
//Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
public class LeetCode1436 {
    public static void main(String[] args) {
        LeetCode1436 leetCode1436 = new LeetCode1436();
        String result = leetCode1436.destCity(List.of(List.of("B", "C"), List.of("D", "B"), List.of("C", "A"))); //A
        System.out.println(result);
    }

    public String destCity(List<List<String>> paths) {
        final Set<String> stringSet = new HashSet<>();
        for (List<String> pathList : paths) {
            stringSet.add(pathList.get(1));
        }
        for (List<String> l : paths) {
            stringSet.remove(l.get(0));
        }
        return stringSet.iterator().next();
    }

}
