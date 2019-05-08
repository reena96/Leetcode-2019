import java.util.Iterator;
import java.util.LinkedList;

public class CountKDistinctStrings {
    public static int countDistinct(String str, int k){
        int n = str.length();
        int res = 0;

        LinkedList<String> l = new LinkedList<>();
        l.addFirst("1");
        l.addFirst("2");
        l.addFirst("3");
        l.addFirst("4");
        Iterator<String> i = l.listIterator();
        while (i.hasNext())
            System.out.println(i.next());


        return 0;
    }

    public static int divide(int a, int b){
        int product = 0;
        int quotient = 0;
        while(product + b <= a){
            product = product + b;
            quotient++;
        }
        return quotient;
    }

    public static void main(String[] args) {
//        countDistinct("",2);
        System.out.println(divide(15,3));
    }
}

