package v2;

public class Q125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                s2 = s2 + s.charAt(i);
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
