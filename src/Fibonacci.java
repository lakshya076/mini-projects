import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number;

        System.out.print("Enter the number till where you want to print the fibonacci series: ");

        while (true) {
            try {
                number = input.nextLong();

                if (number == 1) {
                    System.out.print("The fibonacci sequence is: 0");
                } else if (number == 2) {
                    System.out.print("The fibonacci sequence is: 0 1");
                } else if (number > 2) {
                    System.out.print("The fibonacci sequence is: 0 1 ");

                    long a = 0, b = 1, c;
                    for (long i = 0; i < number - 2; i++) {
                        c = a + b;
                        a = b;
                        b = c;
                        System.out.print(c + " ");
                    }
                    input.close();
                    break;
                } else {
                    System.out.println("Enter a non negative integer.");
                    break;
                }
            } catch (java.util.InputMismatchException IE) {
                System.out.println("Enter a non negative integer.");
                input.next();
            }
        }
    }
}
