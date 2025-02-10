package DSA;

// sort the array elements
import java.util.*;
class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 7};
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
