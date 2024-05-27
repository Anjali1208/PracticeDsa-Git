class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,ans,new ArrayList<>());
        return ans ;
    }

    void helper(int[] nums,int ind,List<List<Integer>> ans,List<Integer> ds)
    {
        
            ans.add(new ArrayList<>(ds));
        

        for(int i=ind;i<nums.length;i++)
        {
            if(i>ind && nums[i]==nums[i-1])
            {
                continue;
            }
            ds.add(nums[i]);
            helper(nums,i+1,ans,ds);
            ds.remove(ds.size()-1);
           // helper(nums,i,ans,ds);
        }
    }
}