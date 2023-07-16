public class Q125 {
    public boolean isPalindrome(String s) {
        String s1 = s.trim().toLowerCase();
        String s2 = "";
        int length = s1.length();
        for (int i = 0; i < length; i++) {
            char ch = s1.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                s2 = s2 + ch;
            }
        }
        int head = 0;
        int tail = s2.length() - 1;
        while (head < tail) {
            if (s2.charAt(head) != s2.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }
}
