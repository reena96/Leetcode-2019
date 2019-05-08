package Heaps;

import java.util.HashMap;

public class MergeSortedArrays {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k= 0;
        int[] nums1_copy = new int[m];
        for(int l = 0;l<m;l++){
            nums1_copy[l] = nums1[l];
        }
        while(i<m && j<n){
            if(nums1_copy[i]<=nums2[j]){
                nums1[k++] = nums1_copy[i++];
            } else {
                nums1[k++] = nums2[j++];
            }
        }
        while (i<m){
            nums1[k++] = nums1_copy[i++];
        }
        while (j<n){
            nums1[k++] = nums2[j++];
        }
        return nums1;
    }

    public static int[] merge2(int A[], int m, int B[], int n) {
        int i=m-1, j=n-1, k=m+n-1;
        while (i>-1 && j>-1) A[k--]= (A[i]>B[j]) ? A[i--] : B[j--];
//        while (i>-1)         A[k--]= A[i--];
        while (j>-1)         A[k--]= B[j--];
        return A;
    }
    public static void main(String[] args){
        int[] result = merge2(new int[]{4,5,6,0,0,0},3,new int[]{1,2,3},3);
        for(int i = 0;i<result.length;i++){
            System.out.print(" "+ result[i]);
        }
//        String x = "sdf";
//        StringBuffer sb = new StringBuffer("abcdefghijk");
//        sb.replace(1,3, "123");
//        System.out.println(sb);
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Reena");
        Object obj = map.put(1,"Mary");
        System.out.println(obj.toString());
        obj = map.get(1);
        System.out.println(obj.toString());

    }
}