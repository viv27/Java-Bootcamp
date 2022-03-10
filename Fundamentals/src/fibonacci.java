import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int f1 = 0;
        int f2 = 1;

        int next = f1 + f2;

        System.out.print(f1 + " ");
        System.out.print(f2 + " ");

        for (int i = 2; i < num; i++) {
            System.out.print(next + " ");
            f1 = f2;
            f2 = next;
            next = f1 + f2;
        }

    }
}
