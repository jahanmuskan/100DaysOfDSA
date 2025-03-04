class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpacePosition = s.lastIndexOf(' '); 
        return s.length() - lastSpacePosition - 1;
    }
}