//longest-repeating-character-replacement
class Solution {
    public int characterReplacement(String s, int k) {
        int [] arr= new int[26];
        int l=0,r=0;
        int window=0;
        int ans=0,max=0;
        while(r<s.length())
        {
            arr[s.charAt(r)-'A']++;
            //System.out.println(s.charAt(r)-'A');
            //window=r-l+1;
            max=Math.max(max, arr[s.charAt(r)-'A']);
            //System.out.println(arr[s.charAt(r)-'A']+"="+arr[s.charAt(r)-'A']);
           // while(window-max>k)
           if(r-l+1-max>k)
            {
                arr[s.charAt(l)-'A']--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
            //System.out.println("Answer="+ans);
            r++;
        }
        return ans;
    }
}