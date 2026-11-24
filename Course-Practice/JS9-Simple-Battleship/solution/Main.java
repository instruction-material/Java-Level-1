import java.util.Scanner;

public class Main {
    static boolean[][] fleet() {
        boolean[][] ships = new boolean[10][10];
        ships[2][3] = ships[2][4] = ships[2][5] = true;
        ships[8][7] = ships[9][7] = true;
        return ships;
    }

    static int coordinate(String line) {
        try {
            int n = Integer.parseInt(line.trim());
            if (n >= 0 && n < 10) return n;
        } catch (NumberFormatException ignored) {
            // The caller asks for a new shot.
        }
        return -1;
    }

    static String fire(boolean[][] ships, char[][] shots, int row, int col) {
        if (row < 0 || row >= ships.length || col < 0 || col >= ships[row].length)
            return "Invalid coordinate";
        if (shots[row][col] != 0) return "Already tried";
        shots[row][col] = ships[row][col] ? 'X' : 'o';
        return ships[row][col] ? "Hit" : "Miss";
    }

    static void display(char[][] shots) {
        System.out.println("  0123456789");
        for (int r = 0; r < shots.length; r++) {
            System.out.print(r + " ");
            for (char mark : shots[r]) System.out.print(mark == 0 ? '.' : mark);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean[][] ships = fleet();
        char[][] shots = new char[10][10];
        int remaining = 5;
        int consecutiveErrors = 0;
        Scanner input = new Scanner(System.in);
        display(shots);
        while (remaining > 0 && consecutiveErrors < 3) {
            System.out.println("Row 0-9:");
            if (!input.hasNextLine()) return;
            int row = coordinate(input.nextLine());
            System.out.println("Column 0-9:");
            if (!input.hasNextLine()) return;
            int col = coordinate(input.nextLine());
            String result = fire(ships, shots, row, col);
            System.out.println(result);
            if (result.equals("Invalid coordinate")) {
                consecutiveErrors++;
                continue;
            }
            consecutiveErrors = 0;
            if (result.equals("Hit")) remaining--;
            display(shots);
        }
        System.out.println(remaining == 0 ? "You sank all the ships!" : "Game ended after three invalid shots.");
    }
}
