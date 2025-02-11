package DSA.Day2;
// Write a code to check whether array is sorted or not(return true or false)
public class CheckIfArrayIsSorted {
    static boolean sorting(int[] arr){
        int length = arr.length;
        for(int i=0; i<length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr = {};
        boolean result = sorting(arr);
        System.out.println(result);
    }
}
