import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Type in the first number: ");
        int dividend = s.nextInt();
        System.out.print("Type in the second number: ");
        int divisor = s.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend - divisor * quotient;

        System.out.println(divisor + " divided by " + dividend + " equals " +
                           quotient + " with a remainder of " + remainder +
                           ".");
    }
}
