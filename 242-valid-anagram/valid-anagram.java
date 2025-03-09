class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        //----------Brute Force------------
        // char[] sArray = s.toCharArray();
        // char[] tArray = t.toCharArray();
        // Arrays.sort(sArray);
        // Arrays.sort(tArray);
        // return Arrays.equals(sArray, tArray);

        //---------Optimal Approach---------
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        return allZero(count);
    }
    private static boolean allZero(int[] count) {
        for (int num : count) {
            if (num != 0) return false;
        }
        return true;
    }
}