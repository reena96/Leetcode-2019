package PermutationsCombinations;

public class StringPerumations {
    static void printDistinctPermutations(String str,
                                     String ans)
    {

        // If string is empty
        if (str.length() == 0) {

            // print ans
            System.out.print(ans + " ");
            return;
        }

        // Make a boolean array of size '26' which
        // stores false by default and make true
        // at the position which alphabet is being
        // used
        boolean alpha[] = new boolean[26];

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // If the character has not been used
            // then recursive call will take place.
            // Otherwise, there will be no recursive
            // call
            if (alpha[ch - 'a'] == false)
                printDistinctPermutations(ros, ans + ch);
            alpha[ch - 'a'] = true;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "abb";
        printDistinctPermutations(s, "");
    }
}
