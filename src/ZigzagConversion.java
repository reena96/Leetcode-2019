import java.util.Scanner;

public class ZigzagConversion {
    static String x = "hello";
    static String y = "hello";
    static String p = new String("hello");
    static String q = new String("hello");

    public static String convert(String s, int numRows) {
        System.out.println("== compares object reference");

        System.out.println(x==y);
        System.out.println("== returns true becuase the same string literals have the same reference");

        System.out.println(p==q);
        System.out.println("== returns false becuase the 2 different string objects have different reference");


        Scanner sc = new Scanner(System.in);

        // String input
        String name = sc.next();

        // Character input
        char isMarried = sc.next().charAt(0); // Type T or F

        String gender = sc.nextLine(); // Male or Female
//Using next() will only return what comes before a space. nextLine() automatically
// moves the scanner down after returning the current line.

        // Numerical data input
        // byte, short and float can be read
        // using similar-named functions.
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double cgpa = sc.nextDouble();

        // Print the values to check if input was correctly obtained.
        System.out.println("Name: "+name);
        System.out.println("Is Married: "+isMarried);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+mobileNo);
        System.out.println("CGPA: "+cgpa);

//        System.out.println(ZigzagConversion.x);
        int i = numRows, k = 0, idx = 0, j = 0;
//        StringBuilder sb = new StringBuilder();
//        while (System.out.println(ZigzagConversion.x);
//        int i = numRows, k = 0, idx = 0, j = 0;i > 0) {
//            idx = 2*i - 2;
//            j = k;
//            while ( j < s.length()){
//                sb.append(s.charAt(j));
//                System.out.println(sb.toString());
//                j = j + idx;
//            }
//            i = i - 1;
//            k = k + 1;
//        }
        return "";

    }
    public static void main(String[] args){
        convert("PAYPALISHIRING",5);
    }
}
