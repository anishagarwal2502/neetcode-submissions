class Solution {
    public double myPow(double x, int n) {
        return myPowHelper(x, n);
    }
    public double myPowHelper(double x, long n) {
        if (x == 0)
            return 0;
        if (n == 0)
            return 1;
        if (x == 1)
            return 1;
        if (x == -1)
            return n % 2 == 0 ? 1 : -1;

        if (n > 0) {
            double ans = myPowHelper(x, n / 2);
            if (n % 2 == 0)
                return ans * ans;
            return ans * ans * x;
        } else {
            return 1 / myPowHelper(x, -1 * n);
        }
    }
}
