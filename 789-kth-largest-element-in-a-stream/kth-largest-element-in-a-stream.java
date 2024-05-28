class KthLargest {
    private PriorityQueue<Integer>pQueue=new PriorityQueue<>();;
    int k;
    public KthLargest(int k, int[] nums) {
      this.k=k;
      for(int n:nums)
      {
        //pQueue.add(n);
        add(n);
      }
      //System.out.println(pQueue) ; 
    }
    
    public int add(int val) {
      pQueue.add(val);
     // System.out.println("add"+pQueue) ; 
      if(pQueue.size()>k)
      {
        pQueue.poll();
      } 
      return  pQueue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

 