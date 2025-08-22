class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int [] temp = new int[length];
        int k = 0;
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    boolean exist = false;
                    for(int x = 0; x < k; x++){
                         if(temp[x] == nums1[i]){
                            exist = true;
                            break;
                         }
                    }
                    if(!exist){
                     temp[k++] = nums1[i];
                    }
                }
            }
        } 
        int [] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = temp[i];
        }
        return result;
    }
}