import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class QuickSort {
// Java program for implementation of QuickSort

    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    int partition(int arr[], int low, int high)
    {
//        System.out.println("Parition call ");
//        printArray(arr);
        int pivot = arr[high];
        int pi = low; // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {

                // swap arr[pi] and arr[j]
                int temp = arr[pi];
                arr[pi] = arr[j];
                arr[j] = temp;
                pi++;
            }
            //everything to the left of pi is less than pivot
//            printArray(arr);
        }

        // swap arr[pi] and arr[high]  (arr[high] is pivot)
        int temp = arr[pi];
        arr[pi] = arr[high];
        arr[high] = temp;
//        printArray(arr);

        return pi;    //everything to the left of pi is less than pivot
    }


    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[])
    {
        int arr[] = {1,4,9,8,7,6,4,2,1};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);

        System.out.println("sorted array");
        printArray(arr);

        new ArrayList<>().add(1,2);
    }
}
/*This code is contributed by Rajat Mishra */
