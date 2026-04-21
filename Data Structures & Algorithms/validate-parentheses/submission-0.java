class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char lastOp = stack.pop();
                if (c == ')' && lastOp != '(') {
                    return false;
                } else if (c == ']' && lastOp != '[') {
                    return false;
                } else if (c == '}' && lastOp != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
