class Solution {
    public String countAndSay(int n) {

        if (n == 0) {
            return "";
        }
        
        // this is the base case. We build on top of it.
        String num = "1"; 
        
        //Generate all the intermediate numbers to get nth number
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int j = 0;
            int len = num.length();
            while(j < len) {
                char first = num.charAt(j);
                int count = 1;
                j++;
                //find the count of repeating char
                while(j < len && num.charAt(j) == first) {
                    count++;
                    j++;
                }
                //append the count time number to string
                sb.append(String.valueOf(count)).append(first);
            }
            //update num to be the input for next iteration
            num = sb.toString();
        }
        
        return num;
    }
}
