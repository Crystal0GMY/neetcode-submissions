class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String string: strs) {
            String created = createString(string);
            map.putIfAbsent(created, new ArrayList<>());
            map.get(created).add(string);
        }
        return new ArrayList<>(map.values());
    }

    private String createString(String string) {
        int[] count = new int[26];
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            count[c-'a'] ++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append(count[i]);
            sb.append("#");
        }
        return sb.toString();
    }
}
