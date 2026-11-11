
class Solution {
    public double myPow(double x, int n) {

        long power = n;

        boolean negative = power < 0;

        if (negative) {
            power = -power;
        }

        double result = 1.0;

        while (power > 0) {

            if (power % 2 == 1) {
                result *= x;
            }

            x *= x;
            power /= 2;
        }

        if (negative) {
            result = 1.0 / result;
        }

        return result;
    }
}

