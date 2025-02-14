package DSA.Day3;

class SingleNumber {  // Renamed class from Solution to SingleNumber
    public int singleNumber(int[] nums) {
        int unique = 0;
        for (int num : nums) {
            unique ^= num;  // XOR all numbers
        }
        return unique;
    }
    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();  // Updated class name

        int[] nums1 = {2, 2, 1};
        System.out.println("Single Number: " + solution.singleNumber(nums1));  // Output: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Single Number: " + solution.singleNumber(nums2));  // Output: 4

        int[] nums3 = {1};
        System.out.println("Single Number: " + solution.singleNumber(nums3));  // Output: 1
    }


}


