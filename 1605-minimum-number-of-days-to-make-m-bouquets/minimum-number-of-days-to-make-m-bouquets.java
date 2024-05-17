class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low=Integer.MAX_VALUE,high=0;
        long val = (long) m * k;
       if (val >  bloomDay.length) return -1; 
        for(int n:bloomDay)
        {
            low=Math.min(low,n);
            high=Math.max(high,n);
        }

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(helper(bloomDay,mid,m,k))
            {
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return low;
    }

    public boolean helper(int [] bloomDay,int days,int m,int k)
    {
        int cnt=0,totalCnt=0;
        for(int n:bloomDay)
        {
            if(n<=days)
            {
                cnt++;
            }
            else
            {
                totalCnt+=(cnt/k);
                cnt=0;
            }
        }
       totalCnt+=(cnt/k);
        if(totalCnt<m)
        return false;
        return true;

    }
}