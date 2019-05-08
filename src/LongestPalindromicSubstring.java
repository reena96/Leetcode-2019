public class LongestPalindromicSubstring {
        public static String longestPalindrome(String s) {
            if (s == null || s.length() < 1) return "";
            int start = 0, end = 0;
            for (int i = 0; i < s.length(); i++) {
                int len1 = expandAroundCenter(s, i, i);
                int len2 = expandAroundCenter(s, i, i + 1);
                int len = Math.max(len1, len2);
                if (len > end - start) {
                    start = i - (len - 1) / 2;
                    end = i + len / 2;
                    float d = len/2;
                    System.out.println(d);
                    System.out.println("i = " + i + ", len = "+len+", start = "+start+ ", end = "+end);

                }
            }
            return s.substring(start, end + 1);
        }

    public static String longestDP(String s) {

        int n = s.length();
        if(n<=1) return s;
        char[] sChar = s.toCharArray();
        boolean[][] table = new boolean[n][n];
        int longestLength = 0;
        String longestPalindrome = "";
        // for palindromic strings of length 1
        for(int i=0;i<n;i++){
            table[i][i] = true;
            longestPalindrome = sChar[i]+"";
        }
        longestLength++;
        // for palindromic string of length 2
        for(int i =0;i<n-1;i++){
            if(sChar[i] == sChar[i+1]) {
                longestPalindrome = s.substring(i, i + 2);
                table[i][i + 1] = true;
            }
        }
        longestLength++;

        // for palindromic strings of length > 2
        for(int k=2; k<n; k++){
            for(int i=0;i<n; i++){
                int j = i+k;
                if(j<n && sChar[i]==sChar[j] && table[i+1][j-1]==true){
                    if(s.substring(i,j+1).length() > longestLength){
                        longestPalindrome = s.substring(i,j+1);
                        longestLength = longestPalindrome.length();
                    }
                    table[i][j] = true;
                }
            }
        }
         return longestPalindrome;
    }



        private static int expandAroundCenter(String s, int left, int right) {
            int L = left, R = right;
            while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
                L--;
                R++;
            }
            return R - L - 1;
        }

        public static void main(String[] args) {
            String s = "eabcb";
//            System.out.println(longestPalindrome(s));
//            System.out.println(s.substring(1, 3));
            System.out.println(longestDP(s));
        }
}
