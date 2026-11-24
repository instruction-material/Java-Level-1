import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean[][] grid = new boolean[10][10];
        Scanner s = new Scanner(System.in);

        while (true) {
            printGrid(grid);

            System.out.println("Which row do you want to draw in? (To stop "
                               + "drawing, enter -1)");
            if (!s.hasNextInt()) break;
            int row = s.nextInt();
            if (row == -1) break;

            System.out.println("Which column do you want to draw in? (To "
                               + "stop drawing, enter -1)");
            if (!s.hasNextInt()) break;
            int col = s.nextInt();

            if (row == -1 || col == -1) {
                break;
            }

            if (row >= 0 && row < 10 && col >= 0 && col < 10) {
                grid[row][col] = true;
            } else {
                System.out.println("Use indices 0 through 9.");
            }
        }
    }

    public static void printGrid(boolean[][] grid) {
        System.out.print("  ");
        for (int i = 0; i < grid.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < grid.length; i++) {
            System.out.print(i + " ");

            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == true) {
                    System.out.print("x"
                                     + " ");
                } else {
                    System.out.print("-"
                                     + " ");
                }
            }
            System.out.println();
        }
    }
}
