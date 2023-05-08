package com.solution.protto;

public class Task3 {

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        int a[] = new int[]{0, 4, -1, 0, 3};
        int b[] = new int[]{0, -2, 5, 0, 3};
        System.out.println(task3.solution(a, b)); //2
        int c[] = new int[]{2, -2, -3, 3};
        int d[] = new int[]{0, 0, 4, -4};
        System.out.println(task3.solution(c, d)); //1

        int e[] = new int[]{3, 2, 6};
        int f[] = new int[]{4, 1, 6};
        System.out.println(task3.solution(e, f)); //0

        int e1[] = new int[]{4, -1, 0, 3};
        int f1[] = new int[]{-2, 6, 0, 4};
        System.out.println(task3.solution(e1, f1)); //0
    }


    public int solution(int[] A, int[] B) {
        int count = 0;
        for (int i = 0; i < A.length - 1; i++) {

            int sumALeftArray = sumLeftArray(A, i);
            int sumARightArray = sumRightArray(A, i);
            int sumBLeftArray = sumLeftArray(B, i);
            int sumBRightArray = sumRightArray(B, i);
//            System.out.println(i + " " + sumALeftArray + " " + sumARightArray);
//            System.out.println(i + " " + sumBLeftArray + " " + sumBRightArray);
            boolean isEqual1 = sumALeftArray == sumARightArray;
            boolean isEqual2 = sumBLeftArray == sumBRightArray;
            boolean isEqual3 = sumALeftArray == sumBLeftArray;
            if (isEqual1 && isEqual2 && isEqual3) {
                count++;
            }
        }
        return count;
    }

    int sumLeftArray(int[] array, int k) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i <= k) {
                sum += array[i];
            }
        }
        return sum;
    }

    int sumRightArray(int[] array, int k) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i <= k) {
            } else {
                sum += array[i];
            }
        }
        return sum;
    }
}
