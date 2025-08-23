class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
      int [] temp = new int[n]; 
      int t = 0;
      for(int i = 0; i < n; i++){
         t += nums[i];
         temp[i] = t;
      }
      return temp;
    }
}