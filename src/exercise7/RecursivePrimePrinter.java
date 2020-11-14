package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
        // Implement recursive method
        if (n == 1) {
            System.out.println("1");
        } else {
            if (isPrime(n)) System.out.println(n);
            printPrimes(n - 1);
        }
    }

    // Implement method
    public static boolean isPrime(int n) {
        boolean result = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                result = false;
                break;
            }
        }
        return result;

    }
}