class Solution {
    public boolean isPalindrome(int x) {
       
        // Edge case: If number ends with 0 but is not 0 itself, it's not a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revNum = 0;
        while(x > revNum){
            int lastDigit = x%10;  // Gives last number
            revNum = revNum * 10 + lastDigit;   // Append digit to reversed number
            x/=10;  // Removes last number
        }
        return x == revNum || x == revNum/10;
    }
}