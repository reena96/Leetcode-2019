public class PalindromeNumber2 {
    public static boolean isPalindrome(int x) {
        int x_copy = x;
        if(x<0) return false;
        int rev = 0, r, prev_rev=0;
        while(x>0){
            r = x%10;
            rev = rev*10 + r;
            if((rev - r)/10 != prev_rev){
                return false;
            }
            x = x/10;
            prev_rev = rev;
        }
        if(x_copy == rev){
            return true;
        }
        return false;

    }
    public static void main(String[] args){
        System.out.println(isPalindrome(223222343));
    }
}