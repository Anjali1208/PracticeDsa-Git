class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> ans=new ArrayList<>();
        helper(n,0,0,ans,"");
        return ans;
    }

    void helper(int n,int left,int right,List<String> ans,String s)
    {
        if(s.length()==n*2)
        {
            ans.add(s);
            return;
        }
        
        if(left<n)
        {
            //s+="(";
            helper(n,left+1,right,ans,s+"(");
        }
        if(right<left)
        {
            //s+=")";
            helper(n,left,right+1,ans,s+")");
        }
        
    }
}