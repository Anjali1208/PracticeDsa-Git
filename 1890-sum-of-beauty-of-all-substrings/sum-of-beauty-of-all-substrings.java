class Solution {
    public int beautySum(String s) {

        int res=0;
        for(int i=0;i<s.length();i++)
        {
            int [] freq=new int[26];
            for(int j=i;j<s.length();j++)
            {
                freq[s.charAt(j)-'a']++;
                res+=maxF(freq)-minF(freq);


            }
        }
        return res;
    }

    public int maxF(int freq[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
            {
                max=Math.max(max,freq[i]);
            }
        }
        return max;
    }

    public int minF(int freq[])
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
            {
                min=Math.min(min,freq[i]);
            }
        }
        return min;
    }
   
}