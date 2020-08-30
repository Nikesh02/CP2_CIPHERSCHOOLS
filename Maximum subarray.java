class Solution {
public int maxSubArray(int[] nums) {
int dp=nums[0];
int max = dp;
for(int i=1;i<nums.length;i++){
dp=Math.max(nums[i],nums[i]+dp);
if(dp>max){
max = dp;
}
}

    return max;
}
}
