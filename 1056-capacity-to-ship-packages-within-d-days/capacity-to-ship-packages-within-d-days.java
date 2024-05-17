//capacity-to-ship-packages-within-d-days
class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int ans=0,low=Integer.MIN_VALUE,high=0;
        for(int n:weights)
        {
            low=Math.max(low,n);
            high+=n;
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(noOfDays(weights,mid)>=days)
            {
                low=mid+1;
            }
            else
            high=mid-1;
        }
       return low; 
    }

    public int noOfDays(int [] weights,int capacity)
    {
        int days=0,cap=0;
        for(int n:weights)
        {
            if(n+cap>capacity)
            {
                days+=1;
                cap=n;
            }
            else
            {
                cap+=n;
            }
        }
        return days;
    }
}