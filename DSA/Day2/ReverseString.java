package DSA.Day2;

import java.util.Scanner;

public class ReverseString {
    public static void reverseString(char[] s) {
        int n = s.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;    // Increment pointer
            end--;      // Decrement pointer
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        char[] s = input.toCharArray(); // Convert input string to char array

        reverseString(s);

        System.out.println("Reversed string: " + new String(s));
    }
}
