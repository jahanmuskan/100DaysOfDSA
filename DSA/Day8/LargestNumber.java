package DSA.Day8;

import java.util.Arrays;

public class LargestNumber {
    public static String largestNumber(int[] nums) {
        // Convert the numbers to strings
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Custom comparator to sort based on concatenation order
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        // If the largest number is "0", return "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Join sorted numbers to form the largest number
        StringBuilder result = new StringBuilder();
        for (String num : strNums) {
            result.append(num);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 2};
        int[] nums2 = {3, 30, 34, 5, 9};
        int[] nums3 = {0, 0};

        System.out.println(largestNumber(nums1)); // Output: "210"
        System.out.println(largestNumber(nums2)); // Output: "9534330"
        System.out.println(largestNumber(nums3)); // Output: "0"
    }
}
