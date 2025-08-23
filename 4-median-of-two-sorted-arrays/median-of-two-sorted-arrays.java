class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int [] num = new int[length];
        
        System.arraycopy(nums1, 0, num, 0, nums1.length);
        System.arraycopy(nums2, 0, num, nums1.length, nums2.length);

        Arrays.sort(num);
        if(length % 2 == 1){
            return num[length / 2];
        }
        else{
            return (num[(length / 2)-1]+num[length / 2]) / 2.0;
        }

    }
}