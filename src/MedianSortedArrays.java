public class MedianSortedArrays {
    public static void main( String[] args) {
        findMedianSortedArrays(new int[]{},new int[]{2,3});
    }
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length;
            int n = nums2.length;
            double d = 0;
            int[] nums = new int[m+n];
            int i = 0, j = 0, k=0;
            while( i < m && j < n){
                if( nums1[i] <= nums2[j]){
                    nums[k++] = nums1[i++];
                }
                else if( nums1[i] > nums2[j]){
                    nums[k++] = nums2[j++];
                }
            }
            while (i < m) {
                nums[k++] = nums1[i++];
            }
            while (j < n) {
                nums[k++] = nums2[j++];
            }
            if(nums.length % 2 == 0) {
                d = ( nums[(nums.length/2) - 1] + nums[nums.length/2] )/(2.0);
                System.out.println(d);
            } else {
                d = nums[(nums.length - 1)/2];
            }

//            System.out.println("Full array");
//            for( k = 0; k < (m+n); k++){
//                System.out.println(nums[k]);
//            }
//            System.out.println("Median");
//            System.out.println(d);
            return d;


        }
}
