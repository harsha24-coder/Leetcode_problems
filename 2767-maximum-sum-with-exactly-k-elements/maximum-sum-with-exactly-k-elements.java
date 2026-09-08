class Solution {
    public int maximizeSum(int[] nums, int k) {
        int count =0, sum = 0, max =0;
        Arrays.sort(nums);
        while(count < k){
            sum+=nums[nums.length-1];
            nums[nums.length -1] += 1;
            max = Math.max(max, sum);
            count ++;
        }
        return max;
    }
    
}