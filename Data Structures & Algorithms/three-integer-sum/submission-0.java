class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int target = 0 - nums[i];
            int m = i + 1, n = nums.length - 1;
            while (m < n) {
                if (nums[m] + nums[n] == target) {
                    res.add(new ArrayList<>(List.of(nums[i], nums[m], nums[n])));
                    m ++;
                    n --;
                    while (m < n && nums[m] == nums[m-1]) m ++;
                    while (m < n && nums[n] == nums[n+1]) n --;
                }
                else if (nums[m] + nums[n] > target) n --;
                else m ++;
            }
        }
        return res;
    }
}
