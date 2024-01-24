// Question #4
import java.math.BigInteger;
import java.util.Scanner;

public class Position {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index to find in the NotFibonacci sequence: ");
        int index = scanner.nextInt();

        BigInteger result = findNotFibonacciValue(index);
        System.out.println("Value at index " + index + ": " + result);
    }

    private static BigInteger findNotFibonacciValue(int index) {
        if (index == 0) {
            return BigInteger.ZERO;
        } else if (index == 1) {
            return BigInteger.ONE;
        }

        BigInteger[] sequence = new BigInteger[index + 1];
        sequence[0] = BigInteger.ZERO;
        sequence[1] = BigInteger.ONE;

        for (int i = 2; i <= index; i++) {
            sequence[i] = BigInteger.valueOf(3).multiply(sequence[i - 2]).add(BigInteger.valueOf(2).multiply(sequence[i - 1]));
        }

        return sequence[index];
    }
}
//O(n) its linear with respect to the input index, it performs constant time operations