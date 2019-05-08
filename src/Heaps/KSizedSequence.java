package Heaps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KSizedSequence {
    public static void main(String[] args){
//        Set<Character> set = new HashSet<>();
//        set.add('r');set.add('e');set.add('n');set.add('a');
//        int k = 3;
        char[] charArr = new char[]{'r','e'};
        add(charArr,3,"");

    }

    public static void add(char[] charArr,int k, String str){
        if(k == 0) {
            System.out.println(str);
//            return;
        }
        else
            for (int i = 0; i < charArr.length; i++) {
                    String newStr = str + charArr[i];
                    add(charArr, k-1, newStr);
            }
    }
}
