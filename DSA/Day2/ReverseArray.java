package DSA.Day2;
// Write a code to reverse the array

import java.util.Arrays;
public class ReverseArray {
    static void reverse(int arr[]){
        int n = arr.length;
            int start = 0;
            int end = n-1;
            while(start < end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
