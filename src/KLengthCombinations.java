

// Java program to print all
// possible strings of length k

public class KLengthCombinations {

    // The method that prints all
// possible strings of length k.
// It is mainly a wrapper over
// recursive function printAllKLengthRec()
    static void printAllKLength(char[] set, int k)
    {
        int n = set.length;
        printAllKLengthRec(set, "", n, k, 0);
    }

    // The main recursive method
// to print all possible
// strings of length k
    static void printAllKLengthRec(char[] set,
                                   String prefix,
                                   int n, int k, int l)
    {

        // Base case: k is 0,
        // print prefix
        if (k == 0)
        {
            System.out.println(prefix);
            return;
        }

        // One by one add all characters
        // from set and recursively
        // call for k equals to k-1
        for (int i = l; i < n; ++i)
        {

            // Next character of input added
            String newPrefix = prefix + set[i];

            // k is decreased, because
            // we have added a new character
            printAllKLengthRec(set, newPrefix,
                    n, k - 1, l+1);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        System.out.println("First Test");
        char[] set1 = {'a', 'b','c','d'};
        int k = 3;
        printAllKLength(set1, k);

        System.out.println("\nSecond Test");
        char[] set2 = {'a', 'b', 'c', 'd'};
        k = 1;
        printAllKLength(set2, k);
    }
}
