class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int num: nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (map.get(a) - map.get(b)));
        // for (int num: map.keySet()) {
        //     pq.offer(num);
        //     if (pq.size() > k) pq.poll();
        // }
        // int[] res = new int[k];
        // for (int i = 0; i < k; i++) {
        //     res[i] = pq.poll();
        // }
        // return res;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] count = new List[nums.length+1];
        for (int i = 0; i < count.length; i++) {
            count[i] = new ArrayList<>();
        }
        for (int num: map.keySet()) {
            count[map.get(num)].add(num);
        }
        int[] res = new int[k];
        int index = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            for (int j = 0; j < count[i].size(); j++) {
                res[index] = count[i].get(j);
                index ++;
                if (index >= k) return res;
            }
        }
        return res;
    }
}
