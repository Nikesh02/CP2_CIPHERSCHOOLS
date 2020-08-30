class Solution {

private int subsetSumWays(int[] array, int sum){
    int nums = array.length;
    int[][] dp = new int[sum+1][nums+1];
    
    for(int i=0;i<=sum;i++){
        Arrays.fill(dp[i],0);
    }
    
    for(int j=0;j<=nums;j++){
        dp[0][j] = 1;
    }
    
    for(int i=1;i<=sum;i++){
        dp[i][0] = 0;
    }
    
    for(int i=1;i<=sum;i++){
        for(int j=1;j<=nums;j++){
            dp[i][j] += dp[i][j-1];
            if(array[j-1]<=i){
                dp[i][j] += dp[i-array[j-1]][j-1];   
            }
        }
    }
    return dp[sum][nums];
}
    
public int findTargetSumWays(int[] nums, int S) {
    int sum = 0;
    int numZeros = 0;
    for (int n : nums){
        sum += n;
        if(n==0){
            numZeros++;
        }
    }
    Arrays.sort(nums);
    int zeroFactor = (int) Math.pow(2, numZeros);
    System.out.println(zeroFactor);
    return sum < S || (S + sum) % 2 > 0 ? 0 : subsetSumWays(nums,(S + sum)/2)*zeroFactor; 
}
}
