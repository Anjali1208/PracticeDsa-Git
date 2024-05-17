class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

         List<int[]> list=new ArrayList<>();
         int start=intervals[0][0];
         int end=intervals[0][1];

         for(int i=1;i<intervals.length;i++)
         {
            if(end>=intervals[i][0])
            {
                if(end<intervals[i][1])
                {
                    end=intervals[i][1];
                }
                continue;
            }
            list.add(new int[]{start,end});
            // for(int [] arr:list)
            // {
            //     System.out.println(arr[0]+","+arr[1]);
            // }
            
            start=intervals[i][0];
            end=intervals[i][1];
         }
         list.add(new int[]{start,end});
        //  for(int [] arr:list)
        //     {
        //         System.out.println(arr[0]+","+arr[1]);
        //     }

         int [][] res=new int[list.size()][2];
         int j=0;
         for(int [] arr:list)
         {
            res[j][0]=arr[0];
            res[j][1]=arr[1];
            j++;
         }
         return res;
    }
}