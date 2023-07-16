public class Q383RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] alpha = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            alpha[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            alpha[ransomNote.charAt(i) - 'a']--;
            if (alpha[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
