import java.util.HashMap;

public class Main {

    public static long calcFibonacci (int index) {
        if (index == 1) {
            return 1;
        }
        if (index == 0) {
            return 0;
        }
        return calcFibonacci(index - 1) + calcFibonacci(index - 2);
    }

    public static void main(String[] args) {
        // SLOW WAY
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 41; i++) {
            System.out.println("calc(" + i + ") = " + calcFibonacci(i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for slow: " + (endTime - startTime));
        // END SLOW WAY

        // USING MAP

        // Init the map
        Fibonacci fibonacci = new Fibonacci(0l,1l);


        // compute some values
        startTime = System.currentTimeMillis();
        System.out.println(fibonacci.fasterCalcFibonacci(40));
        endTime = System.currentTimeMillis();
        System.out.println("Execution time for fast: " + (endTime - startTime));
    }
}
