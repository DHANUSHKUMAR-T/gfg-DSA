class Solution {
    public int longestKSubstr(String s, int k) {
        if (k == 0 || s.length() == 0) return -1;

        Map<Character, Integer> freq = new HashMap<>();
        int l = 0;
        int ml = -1; // default -1 (for case when no valid substring found)

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            // shrink window if unique chars > k
            while (freq.size() > k) {
                char lc = s.charAt(l);
                freq.put(lc, freq.get(lc) - 1);
                if (freq.get(lc) == 0) {
                    freq.remove(lc);
                }
                l++;
            }

            // update only when we have exactly k unique chars
            if (freq.size() == k) {
                ml = Math.max(ml, r - l + 1);
            }
        }

        return ml;
    }
}