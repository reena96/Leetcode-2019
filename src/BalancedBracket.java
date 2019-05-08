import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {

    static boolean isBalanced(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[')
                stack.push(arr[i]);
            else { // isCloser
                if (i == 0 || stack.empty()) return false;
                else if (arr[i] == getCloser(stack.peek()))
                    stack.pop();
                else return false;
            }

        }
        return stack.empty();
    }

    static char getCloser(char c) {
        char result = '\0';
        if (c == '(') result = ')';
        else if (c == '{') result = '}';
        else if (c == '[') result = ']';
        return result;
    }


    static boolean isBalanced2(String s){
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<c.length;i++){
            if (c[i] == '(') stack.push(')');
            else if (c[i] == '{') stack.push('}');
            else if (c[i] == '[') stack.push(']');
            else if (stack.isEmpty() == false && stack.peek() == c[i])
                stack.pop();
            else return false;

        }
        return stack.isEmpty();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println(isBalanced2("[(){}{{}}]"));

    }
}
