class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans =new ArrayList<>();
        int [] arr=new int[9];
        for(int i=0;i<9;i++)
        {
            arr[i]=i+1;
        }
        helper(arr,k,n,0,ans,new ArrayList<>());
        return ans ;
    }

    void helper(int[] arr,int k,int n,int index, List<List<Integer>> ans, List<Integer> ds)
    {
        if(n==0 && ds.size()==k)
        {
            ans.add(new ArrayList<>(ds));
        }

        for(int i=index;i<9;i++)
        {
            if(i>index && arr[i]==arr[i-1])
            {
                continue;
            }
            if(n<arr[i])
            break;
            ds.add(arr[i]);
            helper(arr,k,n-arr[i],i+1,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}