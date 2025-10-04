class Solution {
    /**
     * Finds the longest common prefix string amongst an array of strings.
     *
     * @param strs The input array of strings.
     * @return The longest common prefix, or "" if none exists.
     */
    public String longestCommonPrefix(String[] strs) {
        // If the array is empty or null, there's no prefix.
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Assume the first string is the prefix.
        String prefix = strs[0];

        // Iterate through the rest of the strings in the array.
        for (int i = 1; i < strs.length; i++) {
            // Keep shortening the prefix until it matches the start of the current string.
            // The indexOf() method returns 0 if the string starts with the prefix.
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by removing the last character.
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty, no common prefix exists.
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}