package com.bootcoding.arrayAssignment;

public class OddNumOfDigits {
    //     Input: nums[555,901,483,1771]
//Output: 3
    public static void main(String[] args) {
        int array[] = {555,901,483,1771};
        System.out.println(countOddDigits(array));
    }

    public static int countOddDigits(int[] nums) {
        int count = 0;
        int digitCount = 0;
        for (int num : nums) {
            int temp = num;
            while (temp != 0) {
                digitCount++;
                temp = temp / 10;
            }
            if (digitCount % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
