import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int b = s.nextInt();

        double result = 0.5 * (h * b);
        System.out.println(result);

    }
}
