public class SubMulDiv {
    // Only use add operator
    static int findNegative(int a){
        int flip = a < 0 ? 1 : -1; // flip digit to opposite sign
        int neg = 0;
        while (a != 0){
            neg = neg + flip;
            a = a + flip;
        }
        return neg;
    }

    static int abs(int a){
        if(a < 0)
            return findNegative(a);
        return a;
    }

    static int subtract(int a,int b){
        return a + findNegative(b);
    }

    static int multiply(int a,int b){
        int absa = abs(a);
        int absb = abs(b);
        int sum = 0;
        for(int i = 0; i < absb; i++){
            sum = sum + absa;
        }
        if(!((a>0 && b>0) || (a<0 && b<0))){
            return findNegative(sum);
        }
        return sum;
    }

    static int divide(int a,int b){
        // x = a/b  =>  a = bx, Find x for which b*x = a
        int absa = abs(a);
        int absb = abs(b);
        int product = 0;
        int quotient = 0;
        while(product + absb <= absa){
            product = product + absb;
            quotient++;
        }
        if(!((a>0 && b>0) || (a<0 && b<0))){
            return findNegative(quotient);
        }
        return quotient;
    }


    public static void main(String[] args) {
        int a = -15, b = -2;
        System.out.println(subtract(a,b));
        System.out.println(multiply(a,b));
        System.out.println(divide(a,b));
    }
}
