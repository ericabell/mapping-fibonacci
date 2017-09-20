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
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 40; i++) {
            System.out.println("calc(" + i + ") = " + calcFibonacci(i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime));
    }
}
