class Solution {
    public int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            // Get the last digit of x
            int digit = x % 10;

            // Check for overflow or underflow before adding the digit
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow case
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow case
            }

            // Add the digit to the reversed number
            reversed = reversed * 10 + digit;

            // Remove the last digit from x
            x /= 10;
        }

        return reversed;
    }
}