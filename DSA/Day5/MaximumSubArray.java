package DSA.Day5;

import java.util.Scanner;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        int n = nums.length;
        int max = nums[0];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        MaximumSubArray obj = new MaximumSubArray();
        int maxSum = obj.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + maxSum);
        scanner.close();
    }
}
