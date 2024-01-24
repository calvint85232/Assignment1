// Question #3
import java.math.BigInteger;
import java.util.Scanner;

public class NotFibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the NotFibonacci sequence: ");
        int numberOfTerms = scanner.nextInt();

        generateNotFibonacciSequence(numberOfTerms);
    }

    private static void generateNotFibonacciSequence(int numberOfTerms) {
        BigInteger[] sequence = new BigInteger[numberOfTerms];
        sequence[0] = BigInteger.ZERO;
        sequence[1] = BigInteger.ONE;

        for (int i = 2; i < numberOfTerms; i++) {
            // recursive equation is n[i] = 3 * n[i-2] + 2 * n[i-1]
            sequence[i] = BigInteger.valueOf(3).multiply(sequence[i - 2]).add(BigInteger.valueOf(2).multiply(sequence[i - 1]));
        }

        System.out.println("NotFibonacci Sequence:");
        for (BigInteger term : sequence) {
            System.out.print(term + " ");
        }
    }
}
// Time complexity is O(n) because its linear and iterates through each item in the sequence as the sequence grows linearly