public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String str = x + "";
        if(x<0) return false;
        if(str.length() == 1) return true;
        int i,j, n = str.length();
        if(n % 2==0){
            i = n/2 - 1;
            j = n/2;
        } else {
            i = ((n-1)/2)- 1;
            j = (n-1)/2 + 1;
        }
        while(i>=0 && j<str.length()) {
            if (str.charAt(i) == str.charAt(j)) {
                i--;
                j++;
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(-101 ));
    }
}
