public class Reverse {
    public static void main(String[] args) {

        int num = 79532;
        int result = 0;
        while (num > 0) {

            int digit = num % 10;
            result = (result * 10) + digit;
            num = num / 10;
        }

        System.out.println(result);
    }
}
