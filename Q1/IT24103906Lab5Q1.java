import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third integer: ");
        int num3 = scanner.nextInt();
        
        System.out.println("User entered numbers are: " + num1 + ", " + num2 + ", " + num3);
        
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));
        
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
        
        scanner.close();
    }
}