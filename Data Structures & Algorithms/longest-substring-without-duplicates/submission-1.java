class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, maxLength = 0;
        while (right < s.length()) {
            if (map.containsKey(s.charAt(right)) && map.get(s.charAt(right)) >= left) {
                left = map.get(s.charAt(right)) + 1;
            }
            map.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left + 1);
            right ++;
        }
        return maxLength;
    }
}
