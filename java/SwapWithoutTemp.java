
import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.println("Before Swapping: a = " + a + ", b = " + b);
        
        // Swapping without temp
        a = a + b;  // a now becomes sum
        b = a - b;  // b = sum - b = original a
        a = a - b;  // a = sum - new b = original b
        
        System.out.println("After Swapping: a = " + a + ", b = " + b);
        
        sc.close();
    }
}