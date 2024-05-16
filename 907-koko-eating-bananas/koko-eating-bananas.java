class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max=0;
        // if(piles.length==1 && piles[0]<h)
        // return 1;
        for(int i=0;i<piles.length;i++)
        {
            max=Math.max(max,piles[i]);
        }
        int i=0,j=max;
        while(i<=j)
        {
            int mid=(i+j)/2;
            //System.out.println("MID="+mid);
            //System.out.println("VALUE="+helper(piles,mid));
            if(helper(piles,mid)>h)
            {
                i=mid+1;
            }
            else
            j=mid-1;
           
        }
         return i;
    }

    public int helper(int []piles,int speed)
    {
        int value=0;
        for(int i=0;i<piles.length;i++)
        {
            // if(speed>0)
            // {
            value+=Math.ceil((double)piles[i]/(double)speed);
            // if(piles[i]%speed>0)
            // value+=1;
           // }
            // else
            // value+=1;
            
        }

        return value;
    }
}