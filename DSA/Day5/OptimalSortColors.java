package DSA.Day5;

import java.util.Arrays;

public class OptimalSortColors {
    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        OptimalSortColors obj = new OptimalSortColors();
        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println("Before sorting: " + Arrays.toString(nums));
        obj.sortColors(nums);
        System.out.println("After sorting: " + Arrays.toString(nums));
    }
}

