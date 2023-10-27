// Program to calculate factorial of a small number
// For big number, use linked lists, BigInteger from java.math.BigInteger or use arrays

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want the factorial of: ");
        long number;

        while (true) {
            try {
                number = input.nextLong();
                if (factorial(number) != -1) {
                    System.out.println("Factorial is " + factorial(number));
                } else {
                    System.out.println("Factorial not defined");
                }
                input.close();
                break;
            } catch (java.util.InputMismatchException IE) {
                System.out.println("Enter an integer");
                input.next();
            }
        }
    }

    static long factorial(long num) {
        if (num >= 1) {
            return num * factorial(num - 1);
        } else if (num == 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
