class Solution {
    public int numSquares(int n) {
        int[] cntSq = new int[n+1];
        Arrays.fill(cntSq, Integer.MAX_VALUE);
        cntSq[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j*j <= i; j++) {
                cntSq[i] = Math.min(cntSq[i], cntSq[i-j*j]+1);
            }
        }
        return cntSq[n];
    }
}