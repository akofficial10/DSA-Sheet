class Solution {
    public double myPow(double x, int n) {
        // Convert n to long to safely handle cases like Integer.MIN_VALUE
        long N = n;

        // If exponent is negative, take reciprocal of base and make exponent positive
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        // Use fast exponentiation (divide and conquer)
        return fastPow(x, N);
    }

    private double fastPow(double x, long n) {
        // Base case: any number raised to power 0 is 1
        if (n == 0) {
            return 1.0;
        }

        // Recursively compute half power
        double half = fastPow(x, n / 2);

        // If n is even → result is half * half
        if (n % 2 == 0) {
            return half * half;
        } 
        // If n is odd → multiply extra x once
        else {
            return half * half * x;
        }
    }
}
