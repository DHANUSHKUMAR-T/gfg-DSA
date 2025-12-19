class Solution {
    public int nthRoot(int n, int m) {
        // Edge case: any root of 0 is 0
        if (m == 0) return 0;

        // Edge case: 1st root of any number is the number itself
        if (n == 1) return m;

        // Start from 1 (since 1^n is always <= m)
        for (int i = 1; i <= m; i++) {
            double val = Math.pow(i, n);
            
            if (val == m) return i;
            if (val > m) break;
        }

        return -1; // not a perfect nth root
    }
}