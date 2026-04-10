import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    // Get the coordinate from the user
    Scanner in = new Scanner(System.in);
    System.out.print("Please input a number from 0 to 10: ");
    int row = in.nextInt();
    System.out.print("Enter another number from 0 to 10: ");
    int col = in.nextInt();

    // Put an "O" if in the same row and column, but put an "X" at the entered coordinate
    for (int currentRow = 0; currentRow <= 10; currentRow++) {
      for (int currentCol = 0; currentCol <= 10; currentCol++) {
        if (currentRow == row && currentCol == col) {
          System.out.print("X ");
        }
        else if (currentRow == row || currentCol == col) {
          System.out.print("O ");
        }
        else {
          System.out.print(". ");
        }
      }
      System.out.println();
    }
  }
}
