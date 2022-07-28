import java.util.Scanner;

public class Main {
    /*
     static void exponent(double n1, double n2) {
         double result = 1.0;
         for (int i = 1; i <= n2; i++) {
             result = result * n1;
         }
         System.out.println("Result: " + result);
     }
 */
    static int result = 1;

    static int exponent(int b, int e) {
        if (b == 0) {
            return 0;
        } else if (e == 0) {
            return 1;
        }
        result *= b;
        exponent(b, e - 1);

        return result;

    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int base, exp;
        System.out.print("Base Number: ");
        base = inp.nextInt();
        System.out.print("Exponent Number: ");
        exp = inp.nextInt();
        System.out.println(exponent(base, exp));

    }
}