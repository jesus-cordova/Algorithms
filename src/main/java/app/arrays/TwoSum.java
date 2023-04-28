package app.arrays;

import java.util.Arrays;

class TwoSum {
    public static void main(String[] args) {

        //test comment
        int[] array = { 15, 7, 2, 11 };
        int target = 9;
        System.out.print(Arrays.toString(solveTwoSum(array, target)));
    }

    public static int[] solveTwoSum(int[] array, int target) {
        int leftPointer = 0;
        int rightPointer = array.length - 1;
        Arrays.sort(array);
        while (leftPointer != rightPointer) {
            int currentSum = array[leftPointer] + array[rightPointer];
            if (currentSum < target)
                leftPointer++;
            else if (currentSum > target)
                rightPointer--;
            else
                return new int[] { leftPointer, rightPointer };
        }
        return new int[] {};
    }
}
