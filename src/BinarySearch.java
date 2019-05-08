//public class BinarySearch {
//    int mid, low, high, targ;
//
//    private int binarySearch(int[] nums, int low, int high,int target){
//        mid = (low + high)/2;
//        binarySearch(nums,low, mid, target);
//        binarySearch(nums,mid+1, high, target);
//        if(low == high){
//            return nums[low]==target ? nums[low] : -1;
//        }
//        return -1;
//    }
//
//    int getRandom(int x, int y)
//    {
//        return (int) (x + Math.random() % (y-x+1));
//    }
//
//    private int randomBinarySearch(int[] nums, int low, int high,int target) {
//        int mid = getRandom(low, high);
//        if (nums[mid] == target)
//            return mid;
//        if (nums[mid] > target)
//            return randomBinarySearch(arr, l,
//                    mid-1, x);
//        randomBinarySearch(nums, low, mid, target);
//        randomBinarySearch(nums, mid + 1, high, target);
//        if (low == high) {
//            return nums[low] == target ? nums[low] : -1;
//        }
//        return -1;
//    }
//
//    public static void main(String[] args){
//        int[] arr = new int[]{1,2,3,4,5};
//        BinarySearch bs = new BinarySearch();
//        System.out.println(bs.randomBinarySearch(arr,0,5,1));
//    }
//
//}
