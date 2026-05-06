import java.util.Scanner;


class JS_Check_in_1_Additional_Project
{
	public static void main(String[] args) {
		// Get the coordinate from the user
		Scanner in = new Scanner(System.in);
		System.out.print("\nPlease input a number from 1 to 10: ");
		int row = in.nextInt();
		System.out.print("Enter another number from 1 to 10: ");
		int col = in.nextInt();
		
		// Put an "O" if in the same row and column, but put an "X" at the entered coordinate
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == row && j == col) {
					System.out.print("X");
				} else if (i == row || j == col) {
					System.out.print("O");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}

    /* 
    // An alternative for students that are uncomfortable with using complex conditionals
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        if (i == row) {
          if (j == col) {
            System.out.print("X");
          } else {
            System.out.print("O");
          }
        } else if (j == col) {
          System.out.print("O");
        } else {
          System.out.print("-");
        }
      }
      System.out.println();
    }
    */
	}
}