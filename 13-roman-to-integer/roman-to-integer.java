class Solution {
    public int romanToInt(String s) {
        // Map Roman numerals to their integer values
        java.util.Map<Character, Integer> romanMap = new java.util.HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int result = 0;
        int prevValue = 0;
        
        // Iterate through the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));
            
            // If current value is greater than or equal to previous value, add it
            // Otherwise subtract it (handles cases like IV, IX, etc.)
            if (currentValue >= prevValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }
            
            prevValue = currentValue;
        }
        
        return result;
    }
}