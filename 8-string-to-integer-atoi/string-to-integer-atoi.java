class Solution {
    public int myAtoi(String s) {
           if (s == null || s.length() == 0) return 0;

        int i = 0, n = s.length();
        // Step 1: Ignore leading whitespace
        while (i < n && s.charAt(i) == ' ') i++;

        // Step 2: Check for the sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits to an integer
        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Step 4: Check for overflow or underflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        // Return the final result with the sign applied
        return result * sign;
    }
}

     
   