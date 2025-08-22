class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       /* int length1 = nums1.length;
        int length2 = nums2.length;
        int k = 0;
         int [] temp1 = new int[length1];
         int [] temp2 = new int[length2];
         for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] != nums2[j]){
                   boolean exist = false;
                   for(int x = 0; x < k; x++){
                    if(temp1[x] == nums1[1]){
                        exist = true;
                        break;
                    }
                    if(temp2[x] == nums2[j]){
                        exist = true;
                        break;
                    }
                   }   
                }
                if(!exist){
                    temp1[k++] = nums1[i];
                    temp2[k++] = nums2[j];
                }
            }
         }

         int [] result = temp1; */
         Set <Integer> set1 = new HashSet<>();
         Set<Integer> set2 = new HashSet<>();

         for(int n : nums1)set1.add(n);
         for(int n : nums2)set2.add(n);

         List<Integer> diff1 = new ArrayList<>(set1);
         diff1.removeAll(set2);

         List<Integer> diff2 = new ArrayList<>(set2);
         diff2.removeAll(set1);

         List<List<Integer>> result = new ArrayList<>();
         result.add(diff1); 
         result.add(diff2);

         return result;
    }
}