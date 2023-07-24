//FibonacciWithoutRecursion
public class FibonacciWithoutRecursion {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series:");
        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 2; i < n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

