package stackAndQueues;

import java.util.Stack;

public class Brackets {

    public int solution(String S) {
        char[] bracket = S.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < bracket.length; i++) {
            if (bracket[i] == '{' || bracket[i] == '[' || bracket[i] == '(') {
                stack.push(bracket[i]);
            } else {
                if (stack.isEmpty()) return 0;
                char lastCharacter = stack.peek();
                if (bracket[i] == '}' && lastCharacter == '{') stack.pop();
                else if (bracket[i] == ']' && lastCharacter == '[') stack.pop();
                else if (bracket[i] == ')' && lastCharacter == '(') stack.pop();
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
