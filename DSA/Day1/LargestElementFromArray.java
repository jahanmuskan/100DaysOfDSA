package DSA.Day1;
// Write a program to find first and second largest element from am array

public class LargestElementFromArray {
    // Method to find the first largest number
    static int findFirstLargest(int[] arr) {
        int fmax = arr[0];  // Initialize with first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > fmax) {
                fmax = arr[i];
            }
        }
        return fmax;
    }

    // Method to find the second largest number
    static int findSecondLargest(int[] arr, int firstLargest) {
        int smax = arr[0];  // Initialize with first element

        for (int i = 1; i < arr.length; i++) {
            if (smax < arr[i] && firstLargest > arr[i]) {
                smax = arr[i];
            }
        }
        return (smax == firstLargest) ? -1 : smax; // Handle case where no second largest exists
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 15, -100};

        int firstLargest = findFirstLargest(arr);
        int secondLargest = findSecondLargest(arr, firstLargest);

        System.out.println("First Largest: " + firstLargest);
        if (secondLargest == -1) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }
    }

}
