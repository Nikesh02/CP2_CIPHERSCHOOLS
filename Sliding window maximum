class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        if(k == 1)
            return nums;
        
        int n = nums.length;
        int[] ret = new int[n-k+1];
        Deque<Integer> que = new ArrayDeque<Integer>(); 
        
        for(int i=0 ; i<k ; i++){
            if(que.isEmpty()){
                que.addLast(i);
            }else{
                while(!que.isEmpty() && nums[que.getLast()] < nums[i]){
                    que.removeLast();
                }
                que.addLast(i);
            }
        }
        
        ret[0] = nums[que.getFirst()];
       
        for(int i=k ; i<nums.length ; i++){
            //[i..i+k-1]
            
            while(!que.isEmpty() && que.getFirst() < i-k+1){
                que.removeFirst();
            }
            
            if(que.isEmpty()){
                que.addLast(i);
            }else{
                while(!que.isEmpty() && nums[que.getLast()] < nums[i]){
                    que.removeLast();
                }
                que.addLast(i);
            }
            
            ret[i-k+1] = nums[que.getFirst()];
        }
        
        return ret;
    }
}
