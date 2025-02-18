package DSA.Day7;

public class Fibonacci {
    public static int findFibonnaci(int n){
        // 1st way to solve the problem
//        int num1 = 0;
//        int num2 = 1;
//        int fibonacci = 0;
//        if(n < 2){
//            return n;
//        }
//        for(int i=2; i<=n; i++){
//            fibonacci = num1 + num2;
//            num1 = num2;
//            num2 = fibonacci;
//        }
//        return fibonacci;

        // 2nd way to solve the problem
        if(n < 2){
            return n;
        }
        return findFibonnaci(n - 1) + findFibonnaci(n - 2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fibonacci of "+n+ " is "+findFibonnaci(n));
    }
}
