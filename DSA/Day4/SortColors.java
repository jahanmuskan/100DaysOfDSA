package DSA.Day4;

import java.util.Arrays;

class SortColors {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int countZero = 0, countOne = 0, countTwo = 0;

        // Count occurrences of 0, 1, and 2
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                countZero++;
            } else if (nums[i] == 1) {
                countOne++;
            } else {
                countTwo++;
            }
        }

        // Overwrite array with sorted values
        int index = 0;

        for (int i = 0; i < countZero; i++) {
            nums[index++] = 0;
        }
        for (int i = 0; i < countOne; i++) {
            nums[index++] = 1;
        }
        for (int i = 0; i < countTwo; i++) {
            nums[index++] = 2;
        }
    }

    public static void main(String[] args) {
        SortColors sorter = new SortColors();

        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.println("Before Sorting: " + Arrays.toString(nums));

        sorter.sortColors(nums);

        System.out.println("After Sorting: " + Arrays.toString(nums));
    }
}

