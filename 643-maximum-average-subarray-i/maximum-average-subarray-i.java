class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double windowsum = 0;

 
        for(int i= 0; i < k; i++){
             windowsum += nums[i];
        }

        double maxAvg  = windowsum;
      

        for(int i = k;i < nums.length;i++ ){

            windowsum += nums[i] - nums[i-k];

            if(windowsum > maxAvg){
                maxAvg = windowsum;
            }

        }

        return maxAvg/k;
        
    }
}