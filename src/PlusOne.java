import com.sun.tools.corba.se.idl.constExpr.Plus;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PlusOne {
    public static int[] plusOne(int[] digits){

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int[n+1];
        newNumber[0] = 1;

        try {
            throw new FileNotFoundException();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        return newNumber;
    }
    public static void main(String[] args){
        int[] arr = new int[]{9,9,9,9};
        int[] result = plusOne(arr);
        for(int i: result){
            System.out.println(i);
        }
        PlusOne.main(new String[]{"reena"});
    }
}
