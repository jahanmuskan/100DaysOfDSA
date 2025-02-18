package DSA.Day7;

import java.util.Arrays;

class RearrangeArrayElements {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; // Extra space for correct order

        int posIndex = 0, negIndex = 1;

        // Iterate through nums and place elements alternatively
        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2; // Move to next alternate position
            } else {
                result[negIndex] = num;
                negIndex += 2; // Move to next alternate position
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RearrangeArrayElements sol = new RearrangeArrayElements();

        int[] nums = {28, -41, 22, -8, -37, 46, 35, -9, 18, -6, 19, -26, -37, -10, -9, 15, 14, 31};

        int[] result = sol.rearrangeArray(nums);

        System.out.println("Rearranged Array: " + Arrays.toString(result));
    }
}
