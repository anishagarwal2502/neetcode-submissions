class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int n = carry + digits[i];
            carry = n / 10;
            digits[i] = n % 10;
        }

        if (carry == 0)
            return digits;
        int[] temp = new int[digits.length + 1];
        temp[0] = carry;
        for (int i = 0; i < digits.length; i++) temp[1 + i] = digits[i];
        return temp;
    }
}
