class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0,high=0;
        for(int n:nums)
        {
            low=Math.max(low,n);
            high+=n;
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            int l=helper(nums,mid);
            if(l>k)
            {
                low=mid+1;
            }
            else
            high=mid-1;
        }
        return low;
    }

    int helper(int [] arr, int k)
    {
        int n=arr.length;

        int l = 1;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + arr[i] <= k) {
                sum += arr[i];
            } else {
               
                l++;
                sum = arr[i];
            }
        }
        return l;
    }
}