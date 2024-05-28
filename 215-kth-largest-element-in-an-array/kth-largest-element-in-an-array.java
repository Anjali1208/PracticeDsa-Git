class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pQueue=new  PriorityQueue<>();
        for(int n:nums)
        {
            pQueue.add(n);
        }
        for(int n:nums)
        {
            if(pQueue.size()>k)
        {
            pQueue.poll();
        }
       // System.out.println(pQueue) ;
        }
        
        return pQueue.peek();
    }
}