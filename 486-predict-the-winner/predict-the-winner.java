class Solution {
    public boolean predictTheWinner(int[] nums) {
        
        int firstPlayerMaxScore = helper(nums,0,nums.length - 1);
        int totalScore = Arrays.stream(nums).sum();
        //System.out.println(totalScore);
        return (2 * firstPlayerMaxScore >= totalScore);
    }
    
    int helper(int[] nums,int i,int j){
        if(i > j) return 0;
        
        if(i == j) return nums[i];
        
        int bestScore = Math.max(
            nums[i] + Math.min(helper(nums,i+2,j),helper(nums,i+1,j-1))
           ,nums[j] + Math.min(helper(nums,i+1,j-1),helper(nums,i,j-2))  
        );
        
        return bestScore;
    }
}