import java.util.Scanner;

public class CheckOccurances {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int check = s.nextInt();
        int counter = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == check) {
                counter += 1;
            }
            num = num / 10;

        }
        System.out.println(counter);
    }
}
