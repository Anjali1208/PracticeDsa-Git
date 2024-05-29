class Solution {
    public int characterReplacement(String s, int k) {
        int [] arr= new int[26];
        int l=0,r=0;
        int window=0;
        int res=0,max=0;
        while(r<s.length())
        {
            arr[s.charAt(r)-'A']++;
            max=Math.max(max, arr[s.charAt(r)-'A']);
            if(r-l+1-max>k)
            {
                arr[s.charAt(l)-'A']--;
                l++;
            }
            res=Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
  
}