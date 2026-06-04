class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String string: strs) {
            int[] count = new int[26];
            for (int i = 0; i < string.length(); i++) {
                char c = string.charAt(i);
                count[c-'a'] ++;
            }
            String created = Arrays.toString(count);
            map.putIfAbsent(created, new ArrayList<>());
            map.get(created).add(string);
        }
        return new ArrayList<>(map.values());
    }
}
