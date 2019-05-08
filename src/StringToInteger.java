public class StringToInteger {
//    public static int power(int length){
//        int i = 0, result = 1, c = 0;
//        while (i < length) {
//            result = 10 * result;
//            i++;
//        }
//        return result;
//
//
//    }
    public static int myAtoi(String str) {
        int index = 0, c;
        boolean isNegative = false;

        if(str == null || str.trim().length() == 0){
            return 0;
        }
        str = str.trim();

        c = str.charAt(0) - '0';
        if(str.charAt(0) == '+' || str.charAt(0) == '-'){
            if(str.length() == 1) return 0;
            if(str.charAt(0) == '-') isNegative = true;
            index++;
            if(str.charAt(1)=='+' || str.charAt(1) == '-') return 0;
        } else if (c < 0 ||  c > 9){
            return 0;
        }

        int i, prev = 0;
        int res = 0;
        for (i=index;i<str.length(); i++){
            c = str.charAt(i) - '0';
            if(c>=0 && c<=9) {
                res = res * 10 + c;
                if (((res - c) / 10) != prev) { // Will not happen in first iteration as res = c. So, res - c = 0 (prev = 0)
                    System.out.println("**** max ****");
                    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                prev = res;
            } else
                break;
        }
        res= isNegative ? -res : res;

        return res;
    }
    public static void main(String[] args){
        System.out.println(StringToInteger.myAtoi("2147483648"));
//        int x = 2147483648;
        System.out.println("Integer.MAX_VALUE: "+ Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE: "+ Integer.MIN_VALUE);
    }
}