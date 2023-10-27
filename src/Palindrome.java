import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        String word = input.nextLine();
        StringBuilder reverse = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse.append(word.charAt(i));
        }
        if (reverse.toString().equalsIgnoreCase(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
