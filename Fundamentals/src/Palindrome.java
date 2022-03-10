import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();

        int i = 0;
        int j = a.length() - 1;

        while (i <= j) {

            if (a.charAt(i) != a.charAt(j)) {
                System.out.println("Not palindrome");

                return;
            } else {
                i++;
                j--;
            }
        }
        System.out.println("Palindrome");

    }
}
