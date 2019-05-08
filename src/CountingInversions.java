//public class CountingInversions {
//// Java implementation of counting the
//// inversion using merge sort
//
//        /* This method sorts the input array and returns the
//           number of inversions in the array */
//        static int mergeSort(int arr[], int array_size)
//        {
//            int temp[] = new int[array_size];
//            for(int i = 0;i<array_size;i++){
//                temp[i] = arr[i];
//            }
//            return _mergeSort(temp, 0, array_size - 1);
//        }
//
//        /* An auxiliary recursive method that sorts the input array and
//          returns the number of inversions in the array. */
//        static int _mergeSort(int temp[], int left, int right)
//        {
//            int mid, inv_count = 0;
//            if (right > left) {
//            /* Divide the array into two parts and call _mergeSortAndCountInv()
//           for each of the parts */
//                mid = (right + left) / 2;
//
//            /* Inversion count will be sum of inversions in left-part, right-part
//          and number of inversions in merging */
//                inv_count += _mergeSort(temp, left, mid);
//                inv_count += _mergeSort(temp, mid + 1, right);
//
//            /*Merge the two parts*/
//                inv_count += merge(temp, left, mid + 1, right);
//            }
//            return inv_count;
//        }
//
//        /* This method merges two sorted arrays and returns inversion count in
//           the arrays.*/
//        static int merge(int temp[], int left, int mid, int right)
//        {
//            int i, j, k;
//            int inv_count = 0;
//
//            i = left; /* i is index for left subarray*/
//            j = mid; /* j is index for right subarray*/
//            k = left; /* k is index for resultant merged subarray*/
//            while ((i <= mid - 1) && (j <= right)) {
//                if(temp[i] > temp[j]){
//                    temp[k++] = arr[j++];
//
//                /*this is tricky -- see above explanation/diagram for merge()*/
//                    inv_count = inv_count + (mid - i);
//                }
//            }
//
////        /* Copy the remaining elements of left subarray
////       (if there are any) to temp*/
////            while (i <= mid - 1)
////                temp[k++] = arr[i++];
////
////        /* Copy the remaining elements of right subarray
////       (if there are any) to temp*/
////            while (j <= right)
////                temp[k++] = arr[j++];
////
////        /*Copy back the merged elements to original array*/
////            for (i = left; i <= right; i++)
////                arr[i] = temp[i];
//
//            return inv_count;
//        }
//
//        // Driver method to test the above function
//        public static void main(String[] args)
//        {
//            int arr[] = new int[] { 1,2,6,5,4 };
//            System.out.println("Number of inversions are " + mergeSort(arr, 5));
//        }
//    }