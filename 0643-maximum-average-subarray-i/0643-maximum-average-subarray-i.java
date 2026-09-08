class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum =0,l=0;
        double max =Integer.MIN_VALUE;
        for(int i=0;i<nums.length; i++){
            sum += nums[i];
            if(i-l+1 == k){
              
                max = Math.max(max,(double) sum/k);
                sum -= nums[l];
                l++;
            }
        }
        return max;
    }
}