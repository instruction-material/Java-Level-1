import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try {
            play();
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Game ended. Enter whole numbers for board settings and coordinates.");
        }
    }

    static void play() {
        // Game setup
        System.out.println(
            "\nWelcome to Battleship! Let's start by setting up the game.");

        System.out.print("How tall should the board be? ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.print("How wide should the board be? ");
        int M = in.nextInt();
        if (N < 1 || M < 1 || N > 100 || M > 100) {
            System.out.println("Choose board dimensions from 1 to 100.");
            return;
        }
        int totalSquares = 0;

        int[] numShips = new int[3];
        System.out.print("How many two-unit ships should each player have? ");
        numShips[0] = in.nextInt();
        System.out.print("How many three-unit ships should each player have? ");
        numShips[1] = in.nextInt();
        System.out.print("How many four-unit ships should each player have? ");
        numShips[2] = in.nextInt();
        for (int count : numShips) {
            if (count < 0 || count > N * M) {
                System.out.println("Invalid fleet count.");
                return;
            }
        }
        totalSquares = 2 * numShips[0] + 3 * numShips[1] + 4 * numShips[2];

        if (totalSquares == 0 || totalSquares > N * M) {
            System.out.println("Choose a nonempty fleet that fits the board.");
            return;
        }

        // Player setup
        System.out.println(
            "Okay, it's time for Player 1 to set up their ships! You will be "
            + "asked to type in coordinates for each of your ships.");
        boolean[][] ships1 = setupGrid(in, N, M, numShips);
        System.out.println(
            "Okay, it's time for Player 2 to set up their ships! You will be "
            + "asked to type in coordinates for each of your ships.");
        boolean[][] ships2 = setupGrid(in, N, M, numShips);

        // Gameplay
        char[][] guesses1 = new char[N][M];
        char[][] guesses2 = new char[N][M];
        int numHits1 = 0;
        int numHits2 = 0;

        System.out.println("The game begins!");
        while (true) {
            System.out.println("Player 1, here's your board:");
            printGrid(guesses1);

            System.out.print("Player 1, pick a row: ");
            int row = in.nextInt();
            System.out.print("Player 1, pick a column: ");
            int col = in.nextInt();

            if (row < 0 || row >= N || col < 0 || col >= M) {
                System.out.println("These coordinates are out of bounds!");
            } else if (ships2[row][col] && guesses1[row][col] == 0) {
                System.out.println("It\'s a hit!");
                guesses1[row][col] = 'X';
                numHits1++;
            } else if (guesses1[row][col] != 0) {
                System.out.println("Already tried this square!");
            } else {
                guesses1[row][col] = 'o';
                System.out.println("Miss!");
            }

            if (numHits1 == totalSquares) {
                System.out.println(
                    "Player 1 sank all the ships! Player 1 wins!");
                break;
            }

            System.out.println("Player 2, here's your board:");
            printGrid(guesses2);

            System.out.print("Player 2, pick a row: ");
            row = in.nextInt();
            System.out.print("Player 2, pick a column: ");
            col = in.nextInt();

            if (row < 0 || row >= N || col < 0 || col >= M) {
                System.out.println("These coordinates are out of bounds!");
            } else if (ships1[row][col] && guesses2[row][col] == 0) {
                System.out.println("It\'s a hit!");
                guesses2[row][col] = 'X';
                numHits2++;
            } else if (guesses2[row][col] != 0) {
                System.out.println("Already tried this square!");
            } else {
                guesses2[row][col] = 'o';
                System.out.println("Miss!");
            }

            if (numHits2 == totalSquares) {
                System.out.println(
                    "Player 2 sank all the ships! Player 2 wins!");
                break;
            }
        }
    }

    public static boolean[][] setupGrid(Scanner in, int N, int M, int[] numShips) {
        boolean[][] grid = new boolean[N][M];


        for (int i = 0; i < numShips.length; i++) {
            System.out.println("Now entering coordinates for your " +
                               numShips[i] + " " + (i + 2) + "-unit ships.");
            int coordsRemaining = numShips[i] * (i + 2);
            while (coordsRemaining > 0) {
                System.out.print("Pick a row: ");
                int row = in.nextInt();
                System.out.print("Pick a column: ");
                int col = in.nextInt();
                if (row < 0 || row >= N || col < 0 || col >= M) {
                    System.out.println("These coordinates are out of bounds!");
                } else if (grid[row][col]) {
                    System.out.println("You've already placed a ship here!");
                } else {
                    grid[row][col] = true;
                    coordsRemaining--;
                }
            }
            System.out.println(
                "You've completed placing your " + (i + 2) +
                "-unit ships. Here is what your board currently looks like:");
            for (boolean[] row : grid) {
                for (boolean occupied : row) System.out.print(occupied ? "X " : ". ");
                System.out.println();
            }
        }

        return grid;
    }

    public static void printGrid(char[][] guesses) {
        System.out.print("  ");
        for (int c = 0; c < guesses[0].length; c++) System.out.print(c + " ");
        System.out.println();
        for (int r = 0; r < guesses.length; r++) {
            System.out.print(r + " ");
            for (char cell : guesses[r]) System.out.print((cell == 0 ? '.' : cell) + " ");
            System.out.println();
        }
    }
}
