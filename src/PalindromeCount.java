public class PalindromeCount {
    // Complete the count_palindromes function below.
    static int count_palindromes(String S) {

        int n = S.length();
        int[][] count_arr = new int[n+1][n+1];
        for(int i = 0; i<n;i++)
            count_arr[i][i] = 1;

        for(int l = 2; l<= n; l++){
            for(int k = 0; k < n;k++){
                int m = l + k - 1;
                if(m<n){
                    if(S.charAt(k) == S.charAt(m))
                        count_arr[k][m] = count_arr[k][m-1] + count_arr[k+1][m] + 1;
                    else
                        count_arr[k][m] = count_arr[k][m-1] + count_arr[k+1][m] + count_arr[k+1][m-1];
                }
            }
        }
        return count_arr[0][n-1];
    }




    static int countPS(String str)

    {

        int N = str.length();


        // create a 2D array to store the count

        // of palindromic subsequence

        int[][] cps = new int[N + 1][N + 1];


        // palindromic subsequence of length 1

        for (int i = 0; i < N; i++)

            cps[i][i] = 1;


        // check subsequence of length L is

        // palindrome or not

        for (int L = 2; L <= N; L++)

        {

            for (int i = 0; i < N; i++)

            {

                int k = L + i - 1;

                if (k < N) {

                    if (str.charAt(i) == str.charAt(k))

                        cps[i][k] = cps[i][k - 1] +

                                cps[i + 1][k] + 1;

                    else

                        cps[i][k] = cps[i][k - 1] +

                                cps[i + 1][k] -

                                cps[i + 1][k - 1];

                }

            }

        }


        // return total palindromic subsequence

        return cps[0][N - 1];
    }
    public static void main(String[] args){
        //System.out.println(countPS("aaaa"));
        int x = 3/2;
        System.out.println(3);

    }
}
