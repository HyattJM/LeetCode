class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String reverseString = "";
        char c;
        int output = 0;
        for(int i = s.length()-1; i >= 0; i--) {
            c = s.charAt(i);
            if (c != ' ') {
                reverseString = c + reverseString;
            } else break;
        }
        return reverseString.length();
    }
}