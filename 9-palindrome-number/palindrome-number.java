class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String intAsString = Integer.toString(x);
        char ch;
        String newStr = "";
        for(int i = 0; i < intAsString.length(); i++){
            ch = intAsString.charAt(i);
            newStr = ch + newStr;
        }
        if (newStr.equals(intAsString)){
            return true;
        }
        return false;
    }
}