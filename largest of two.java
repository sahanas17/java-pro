import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();        
        if (num1 > num2) {
            System.out.println(num1 + " is the largest.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the largest.");
        } else {
            System.out.println("Both numbers are equal.");
        }        
        scanner.close();
    }
}