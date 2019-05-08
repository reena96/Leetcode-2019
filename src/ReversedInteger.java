public class ReversedInteger {
        public static int reverse(int x) {
            boolean isNegative = false;
            int r = 0, a = 0, prev_a = 0;
            if(x<0){
                isNegative = true;
                x = -x;
            }
            while(x>0){
                r = x % 10;
                a = a*10 + r;
                if ((a-r)/10 != prev_a) {
                    System.out.println("OVERFLOW");
                    return 0;
                }
                x = x/10;
                prev_a = a;
            }
            if(isNegative) a = -a;
            return a;

        }
        public static void main(String[] args){
        System.out.println(reverse(123));
    }

}
