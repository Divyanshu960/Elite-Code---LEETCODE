class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
          int len = words.length * words[0].length();
        List<Integer> result = new ArrayList<>();
        int k = words[0].length();
        HashMap<String, Integer> map = new HashMap<>();
        for (String st : words) {
            map.put(st, map.getOrDefault(st, 0) + 1);
        }
        for (int i=0; i+len <= s.length(); ++i) {
            HashMap<String, Integer> count = new HashMap<>();
            int c = 0;
            for (int j=i; j<i+len; j+=k) {
                String word = s.substring(j, j+k);
                count.put(word, count.getOrDefault(word, 0) + 1);
                if (!map.containsKey(word) || count.get(word) > map.get(word)) {
                    break;
                }
                c += k;
            }
            if (c == len) {
                result.add(i);
            }
        }
        return result;
    }
}
