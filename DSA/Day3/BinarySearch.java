package DSA.Day3;

public class BinarySearch {
    static int search(int arr[], int k){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==k){
                return mid;
            }else if (arr[mid] < k) {
                start = mid + 1;  // Ignore the left half
            }
            else {
                end = mid - 1;  // Ignore the right half
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(search(arr, 6));
    }
}
