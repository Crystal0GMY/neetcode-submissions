class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLength = 0;
        for (int num: nums) set.add(num);
        for (int num: set) {
            if (!set.contains(num-1)) {
                int length = 1;
                int start = num;
                while (set.contains(start+1)) {
                    length ++;
                    start ++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}
