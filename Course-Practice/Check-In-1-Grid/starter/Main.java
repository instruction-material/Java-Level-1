import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // Get the coordinate from the user
        Scanner in = new Scanner(System.in);
        System.out.print("Please input a number from 1 to 10: ");
        int row = in.nextInt();
        System.out.print("Enter another number from 1 to 10: ");
        int col = in.nextInt();
        if (row < 1 || row > 10 || col < 1 || col > 10) {
            System.out.println("Use a row and column from 1 through 10.");
            return;
        }

        // Put an "O" if in the same row and column, but put an "X" at the entered coordinate
    }
}
