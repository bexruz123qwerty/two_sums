package com.example;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.twoSums(new int[]{1, 2, 3, 10, 5, 6, 8}, 100);
    }

    public void twoSums(int[] nums, int target) {
        boolean isFound = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(nums[i] + " + " + nums[j] + " = " + target);
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("Нет пары чисел дающих эту сумму");
        }
    }
}
