import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            double number = sc.nextDouble();

            if (number < 0) {
                throw new ArithmeticException("Cannot calculate square root of a negative number.");
            }

            double result = Math.sqrt(number);
            System.out.println("Square root of " + number + " is " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }
        sc.close();
    }
}
