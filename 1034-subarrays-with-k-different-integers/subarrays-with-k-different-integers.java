class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
        
    }

    int helper(int [] nums,int k)
    {
        int ans=0,left=0,right=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(right<nums.length)
        {
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            // if(map.size()==k)
            // ans++;
            while(map.size()>k)
            {
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0)
                map.remove(nums[left]);
                left++;
            }
           
           ans+=right-left+1;
            right++;
        }
        return ans;

    }
}