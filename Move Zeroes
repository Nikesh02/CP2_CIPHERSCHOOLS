class Solution {
    public void moveZeroes(int[] nums) {
        int index0=0,numindex=0;
        while(index0<=nums.length-1)
        {
            if(nums[index0]==0)
            { ++index0;}
            else
            {
                swap(nums,index0,numindex);++numindex;++index0;
            }
            
        }
    }
    
    public void swap(int []array,int a,int b)
    {
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}
