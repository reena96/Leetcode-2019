public class FibonacciRecursionSpace {
    static int fibonacci(int i, int stack) {
        System.out.println("Fib: " + i + " stack: " + stack);
        if (i == 0) return 0;
        if (i == 1) return 1;
        return fibonacci(i - 1, stack + 1) + fibonacci(i - 2, stack + 1);
    }
    public static void main(String[] args){
        System.out.println(fibonacci(6,1));
    }
}
