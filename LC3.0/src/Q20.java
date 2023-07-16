import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Q20 {
    public boolean isValid(String s) {
        int length = s.length();
        if (length % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap(){};
        pairs.put('{', '}');
        pairs.put('[', ']');
        pairs.put('(', ')');
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
            } else if (c.equals(pairs.get(stack.peek()))) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
