import java.util.Scanner;

public class ExceptionsHandling02 {

    public static void main(String[] args) {

        int dividend;
        int divisor;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hi! Choose a dividend");
            dividend = scanner.nextInt();
            System.out.println("Hi! Choose a divisor");
            divisor = scanner.nextInt();

            if (divisor != 0) {
                System.out.println("The result is " + dividend/divisor);
            }else{
                throw new ArithmeticException("!!ERROR!! You can't divide by 0");
            }
        }
    }
}
