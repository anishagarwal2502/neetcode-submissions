class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generateParenthesis(n, 0, 0, 0, new char[2 * n], ans);
        return ans;
    }

    public void generateParenthesis(
        int n, int idx, int open, int close, char[] curr, List<String> ans) {
        if (idx == 2 * n) {
            ans.add(new String(curr));
            return;
        }

        if (open < n) {
            curr[idx] = '(';
            generateParenthesis(n, idx + 1, open + 1, close, curr, ans);
        }

        if (close < open) {
            curr[idx] = ')';
            generateParenthesis(n, idx + 1, open, close + 1, curr, ans);
        }
    }
}
