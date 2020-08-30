class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[256];
        //Remember counts for each character in target
        for(char c:t.toCharArray()){
            freq[c]++;
        }
        int startIndex=0;
        int len = Integer.MAX_VALUE;
        //l is used for "excluding" characters
        int l= 0; 
        //Set r to l first. Remember that r is only used
        //for "including" characters
        int r = l;
        //Use this count to determine when we have found
        //every character in target.
        //Each time r finds a character, decrement the count (include)
        //each time l finds a character, increment the count (exclude)
        int count = t.length();
        while(r < s.length()){
            char include = s.charAt(r);
            freq[include]--;
            
            if(freq[include] > -1){
                //This means the character exists in target
                // for all other characters, the act of
                //decrementing them in freq, will reduce
                //their count to below 0.
                count--;
            }
            //Now that we've found all characters
            //see how much we can shrink the window
            //without losing any target characters
            while(count==0){
                if(r-l+1 < len){
                    len = r-l+1;
                    startIndex = l;
                }
                char exclude = s.charAt(l++);
                freq[exclude]++;
                if(freq[exclude]>0){
                    //Seems like we excluded a character
                    //from target. Increment count to indicate this.
                    count++;
                }
            }
            //continue to expand the window
            r++;
        }
        return len==Integer.MAX_VALUE?"":s.substring(startIndex,startIndex+len);
    }
}
