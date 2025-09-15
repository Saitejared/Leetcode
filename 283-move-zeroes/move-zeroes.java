class Solution {
    public void moveZeroes(int[] nums) {
        int temp;
        int n = nums.length;
        for(int i = 0; i <= n - 1; i++){
           /* if(nums[i] == 0){
                temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }*/
            for(int j = 0; j < n - i - 1; j++){
               if(nums[j] == 0){
                temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
               }
            }
        }
       System.out.print(nums);
    }
}