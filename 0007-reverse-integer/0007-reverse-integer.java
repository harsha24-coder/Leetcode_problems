class Solution {
    public int reverse(int x) {

        int rev = x;
        int sum = 0;

        while (rev != 0) {

            int n = rev % 10;

            // Check overflow before multiplying by 10
            if (sum > Integer.MAX_VALUE / 10 ||
                sum < Integer.MIN_VALUE / 10) {
                return 0;
            }

            sum = sum * 10 + n;
            rev = rev / 10;
        }

        return sum;
    }
}