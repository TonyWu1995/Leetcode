package com.solution.protto;

public class Task1 {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.solution(new int[]{4, 2, 5, 8, 7, 3, 7})); //2
        System.out.println(task1.solution(new int[]{14, 21, 16, 35, 22}));//1
        System.out.println(task1.solution(new int[]{5, 5, 5, 5, 5, 5})); //3
        System.out.println(task1.solution(new int[]{1, 1})); //1
        System.out.println(task1.solution(new int[]{1, 1, 2})); //1
        System.out.println(task1.solution(new int[]{1, 1, 2, 1})); //1
//        System.out.println(task1.solution(new int[]{4, 2, 5, 8, 7, 3, 7}));
    }


    public int solution(int[] A) {
        int count = 0;
        int index = 1;
        boolean flag = false;
        for (int i = 0; i < A.length; i++) {
            if (i == index) {
                continue;
            }
            int nextI = (i + 1) % A.length;
            int sum = A[i] + A[nextI];
            if (sum % 2 == 0) {
                count++;
                index = nextI;
                if(flag && nextI == 0){
                    count--;
                }
                if (i == 0 || nextI == 0) {
                    flag = true;
                }
            }
        }
        return count;
    }

}
