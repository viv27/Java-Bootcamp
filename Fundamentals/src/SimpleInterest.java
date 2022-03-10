import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        int t = s.nextInt();
        int r = s.nextInt();

        int interestRate = p * (1 + (r * t));
        System.out.println(interestRate);
    }
}
