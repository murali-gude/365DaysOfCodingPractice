import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int product = 1;
        int temp = num;
        
        // Handle 0 case
        if (temp == 0) {
            product = 0;
        } else {
            // If negative, convert to positive
            if (temp < 0) {
                temp = -temp;
            }
            
            while (temp != 0) {
                int digit = temp % 10;
                product = product * digit;
                temp = temp / 10;
            }
        }
        
        System.out.println("Product of digits of " + num + " = " + product);
        
        sc.close();
    }
}