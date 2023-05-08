package com.solution.protto;

public class Task2 {

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        System.out.println(task2.solution(3, 2, new int[]{2, 1, 1, 0, 1}));
        System.out.println(task2.solution(2, 3, new int[]{0, 0, 1, 1, 2}));
        System.out.println(task2.solution(2, 2, new int[]{2, 0, 2, 0}));
    }

    public String solution(int U, int L, int[] C) {
        int len = C.length;
        int[] row1 = new int[len];
        int[] row2 = new int[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (C[i] == 2) {
                row1[i] = 1;
                row2[i] = 1;
                U--;
                L--;
            } else if (C[i] == 1) {
                count++;
            }
        }
        if (U < 0 || L < 0 || count != U + L) {
            return "IMPOSSIBLE";
        }
        int index = 0;
        while (U + L > 0) {
            while (U > 0) {
                if (C[index] == 1) {
                    row1[index] = 1;
                    U--;
                }
                index++;
            }
            while (L > 0) {
                if (C[index] == 1) {
                    row2[index] = 1;
                    L--;
                }
                index++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : row1) {
            stringBuilder.append(i);
        }
        stringBuilder.append(",");
        for (int i : row2) {
            stringBuilder.append(i);
        }
        return stringBuilder.toString();
    }

//    public String solution(int U, int L, int[] C) {
//        //IMPOSSIBLE if not match
//
//        return null;
//    }

}
