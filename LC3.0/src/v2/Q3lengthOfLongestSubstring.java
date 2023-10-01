package v2;

import java.util.HashMap;

public class Q3lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            res = Math.max(res, i - left + 1);
            map.put(c, i);
        }
        return res;
    }
}