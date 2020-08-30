class Solution {
    int res=1;
    public int lengthOfLongestSubstring(String s) {
        int st=0,c=0;
        int[] count=new int[127];
     
        
         if(s.length()==0)
            return 0;
        
        if(s.length()==1 || s.charAt(0)==' ')
            return res;
        
        for(int i=0;i<s.length();i++){
            count[(int)s.charAt(i)]++;
            
            if( count[(int)s.charAt(i)]>1){
                c++;
                res=Math.max(res,s.substring(st,i).length());
                    
                    System.out.println(s.substring(st+1,s.length())+" "+res);
                    return lengthOfLongestSubstring(s.substring(++st,s.length()));
                    

            }
            
            
        }
        if(c==0)
            res=Math.max(res,s.length());
        
        
        return res;
    }
}
