import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a > b && a > c) {
            System.out.println("Largest is a");
        } else if (b > a && b > c) {
            System.out.println("Largest is b");
        } else {
            System.out.println("Largest is c");
        }
    }
}