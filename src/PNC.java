import java.util.Scanner;

public class PNC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n, r;
        while (true) {
            try {
                System.out.print("Enter N: ");
                n = input.nextLong();
                System.out.print("Enter R: ");
                r = input.nextLong();

                if (Factorial.factorial(n) != -1 && Factorial.factorial(r) != -1) {
                    System.out.println("The permutations are: " + (Factorial.factorial(n) / (Factorial.factorial(n - r))));
                    System.out.println("The combinations are: " + (Factorial.factorial(n) / (Factorial.factorial(n - r) * Factorial.factorial(r))));
                    break;
                } else if (Factorial.factorial(n) == -1) {
                    System.out.println("N is not defined");
                } else if (Factorial.factorial(r) == -1) {
                    System.out.println("R is not defined");
                }
            } catch (java.util.InputMismatchException IE) {
                System.out.println("Enter a non-negative integer.");
                input.next();
            }
        }
    }
}
