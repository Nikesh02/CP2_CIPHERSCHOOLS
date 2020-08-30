class Solution {
    public int tribonacci(int n) {
        final int[] memo = new int[n+1];
        return tribonacci(n, memo);
    }
    
    private int tribonacci(int n, int[] memo) {
        if (n == 0) return 0;
        else if (n <= 2) return 1;
        else if (memo[n] == 0) {
            memo[n] = tribonacci(n-1, memo) + tribonacci(n-2, memo) + tribonacci(n-3, memo);   
        }
        return memo[n];
    }
}
