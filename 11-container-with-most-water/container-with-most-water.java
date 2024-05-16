class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int maxA=0,maxH=0;

        while(l<r)
        {
            //maxH=Math.max(maxH,height[r]);
             maxA=Math.max(maxA,(r-l)*Math.min(height[l], height[r]));
           if(height[l]<height[r])
           {
            l++;

           }
           else
           {
           r--;
           }
        }
       return maxA; 
    }
}