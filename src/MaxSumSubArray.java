public class MaxSumSubArray {
    static int findMaxSum(int arr[],int low, int high)
    {
        if(low == high)
        {
            return arr[low];
        }
        int mid = (low+high)/2;
        int left = findMaxSum(arr,low, mid );
        int right = findMaxSum(arr,mid+1, high);
        int cross = findMaxCross(arr,low, mid, high);
        return Math.max(cross, Math.max(left,right));
    }

    private static int findMaxCross(int[] arr, int low,int mid, int high) {
        int sum = 0;
        int left_sum = Integer.MIN_VALUE;
        // 3 -2 5 -1
        for (int i = mid; i >= low; i--)
        {
            sum = sum + arr[i];
            if (sum > left_sum)
                left_sum = sum;
        }

        // Include elements on right of mid
        sum = 0;
        int right_sum = Integer.MIN_VALUE;
        for (int i = mid + 1; i <= high; i++)
        {
            sum = sum + arr[i];
            if (sum > right_sum)
                right_sum = sum;
        }

        // Return sum of elements on left
        // and right of mid
        return left_sum + right_sum;
    }


    public static void main(String[] args)
    {
        int[] arr = {4,8,-1,2,-3,-8};
        System.out.println(findMaxSum(arr,0,arr.length-1));
    }
}
