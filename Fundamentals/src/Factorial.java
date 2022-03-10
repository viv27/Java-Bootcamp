import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int result = 1;

        while (num > 0) {
            result = result * num;
            num -= 1;

        }

        System.out.println(result);
    }

}
