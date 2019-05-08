public class RemoveElement {
    public static int removeElement2(int[] nums, int val) {
        int length = nums.length;
        int j,k,count;
        for(int i = 0;i<length; i++){
            if(nums[i] == val) {
                j = k = i;
                count = 0;
                while (k<length && nums[k] == val) { //counts no of continuous vals
                    k++;
                    count++;
                }
                while (k < length) {
                    nums[j] = nums[k];
                    j++;
                    k++;
                }
                length = length - count;
            }
        }
        return length;
    }

    static int removeElement(int[] nums, int val) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,1,2,1};
        System.out.println("Length:"+removeElement(arr,1));
        System.out.println("Array elements");
        for(int i: arr){
            System.out.println(i);
        }

        int x = 7>8 ? 2 : 3;
    }
}
