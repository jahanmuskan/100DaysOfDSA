package DSA.Day2;
// Write a code to check whether an element is present in the array or not
public class SortedArraySearch {
    static boolean sortLinearArray(int arr[], int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == k){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        System.out.println(sortLinearArray(arr, 6));
    }
}
