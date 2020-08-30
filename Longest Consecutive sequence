class Solution {
public int longestConsecutive(int[] a) {
if(a.length==0)
{
return 0;
}
if(a.length==1)
{
return 1;
}
TreeMap<Integer,Integer> map=new TreeMap<>();
for(int i=0;i<a.length;i++)
{
map.put(a[i],i);
}
int max=1;
int count=1;
int temp=Integer.MIN_VALUE;
for(Map.Entry<Integer,Integer>entry:map.entrySet())
{

        int x=entry.getKey();
 
        if(x-temp==1)
        {
            count++;
        }
        else
        {
            count=1;
        }
      
        if(max<count)
        {
            max=count;
        }
        temp=x;
        
    }
    return max;
}
}
