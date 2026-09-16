class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateParenthesis(n, 0, 0, "", res);
        return res;
    }

    public void generateParenthesis(int n, int open, int close, String curr, List<String> ans) {
        if (curr.length() == 2 * n) {
            ans.add(curr);
            return;
        }

        if (open < n)
            generateParenthesis(n, open + 1, close, curr + "(", ans);
        if (close < open)
            generateParenthesis(n, open, close + 1, curr + ")", ans);
    }
}
