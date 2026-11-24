import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Type in the first number: ");
        int dividend = s.nextInt();
        System.out.print("Type in the second number: ");
        int divisor = s.nextInt();

        if (divisor == 0) {
            System.out.println("Cannot divide by zero.");
            return;
        }
        int quotient = dividend / divisor;
        int remainder = dividend - divisor * quotient;

        System.out.println(dividend + " divided by " + divisor + " equals " +
                           quotient + " with a remainder of " + remainder +
                           ".");
    }
}
