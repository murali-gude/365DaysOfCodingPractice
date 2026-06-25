import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();

        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }

        System.out.println(base + " ^ " + exp + " = " + result);

        sc.close();
    }
}
