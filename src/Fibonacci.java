import java.util.HashMap;

public class Fibonacci {
    public HashMap<Integer, Long> fibonacciNums = new HashMap<Integer, Long>();

    public Fibonacci(Long one, Long two) {
        fibonacciNums.put(0,one);
        fibonacciNums.put(1,two);
    }



    public long fasterCalcFibonacci( int index ) {
        // check to see if index is in fibonacciNums
        if( fibonacciNums.get(index) != null ) {
            // if it is, return the long value
            return fibonacciNums.get(index);
        } else {
            // if it isn't, we have to compute it recursively
            long temp = fasterCalcFibonacci(index-1) + fasterCalcFibonacci(index-2);
            // store it in the map
            fibonacciNums.put(index, temp);
            return temp;
        }
    }
}
