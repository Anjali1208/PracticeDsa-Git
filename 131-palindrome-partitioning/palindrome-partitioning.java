class Solution {
    public List<List<String>> partition(String s) {
       List<List<String>> ans=new ArrayList<>();
       helper(s,0,ans,new ArrayList<>());
       return ans; 
        
    }

    void helper(String s, int ind,List<List<String>> ans,List<String>ds)
    {
        if(ind==s.length())
        {
            ans.add(new ArrayList<>(ds));
        }
        for(int i=ind+1;i<=s.length();i++)
        {
            if(isPalindrome(s,ind,i-1))
            {
            ds.add(s.substring(ind,i));
            helper(s,i,ans,ds);
            ds.remove(ds.size()-1);
            }
        }
    }

    boolean isPalindrome(String s,int start,int end)
    {
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
                 return false; 
            start++;
            end--;      
        }
                    return true;
    }
}