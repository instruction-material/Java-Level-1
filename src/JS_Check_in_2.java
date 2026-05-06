class JS_Check_in_2
{
	public static void main(String[] args) {
		/* ------------------------------------ */
		// RANDOM NUMBERS AND VARIABLES
		/* ------------------------------------ */
		
		// Create a random integer between 0 and 10 and save it to the variable num1
		int num1 = (int) (Math.random() * 10);
		
		// Create a random integer between 20 and 30 and save it to the variable num2
		int num2 = (int) (Math.random() * 10) + 20;
		
		// What is ASCII?
		// Ans: ASCII is a language in which every possible letter (or character) is represented by a number.
		
		// Create a random lowercase letter and save it to the variable letter
		int l = (int) (Math.random() * 26) + 97;
		char letter = (char) l;
		System.out.println(letter);
		
		
		/* ------------------------------------ */
		// METHODS
		/* ------------------------------------ */
		
		// What is a method? Can you give me an example of a built-in function in Java?
		
		// Define a method that takes in two integers and returns the sum of those two doubles (see below)
		
		// Using the sum method that you wrote, print the sum of 36 and 59.
		System.out.println(sum(36, 59));
		
		// Define a method that flips a coin. In the method, create a double between 0 and 1. If the double is 0.5 or above, return "Heads". If the double is < 0.5, return "Tails" (see below).
		
		// Using the coinFlip method you wrote, simulate flipping a coin 100 times and print out "You flipped heads __ times out of 100!"
		int numHeads = 0;
		for (int i = 0; i < 100; i++) {
			if (coinFlip().equals("Heads")) {
				numHeads++;
			}
		}
		System.out.println("You flipped heads " + numHeads + " times out of 100!");
		
		
		/* ------------------------------------ */
		// ARRAYS
		/* ------------------------------------ */
		
		// What is an array?
		
		// Create an empty integer array of length 10
		int[] arr = new int[10];
		
		// Create a pre-populated array with 1,3,5,7
		int[] arr2 = {1, 3, 5, 7};
		
		// Print out the 2nd element in either one of the arrays you just initialized
		System.out.println(arr[1]);
		
		// Using a loop, add the numbers 1-20 to an array called nums and print the array
		int[] nums = new int[20];
		for (int i = 0; i < 20; i++) {
			nums[i] = i + 1;
			System.out.println(nums[i]);
		}
		// Using another loop, add 100 to every element of the array nums
		for (int j = 0; j < 20; j++) {
			nums[j] += 100;
		}
		
		
		/* ------------------------------------ */
		// TWO-DIMENSIONAL ARRAYS
		/* ------------------------------------ */
		
		// What is a two-dimensional array? How is it different from a regular array?
		
		// Create a new 5x10 two-dimensional array
		int[][] arr3 = new int[5][10];
		
		// Set the element in 3rd row and 5th column to a 5
		arr3[2][4] = 5;
		
		// Print the number of rows
		System.out.println(arr3.length);
		
		// Print the number of columns
		System.out.println(arr3[0].length);
		
		// Using loops, print out all of the elements in the two-dimensional array in a grid format
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[0].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
		// Another way to do with this with for each loops

    /*
    for (int[] row: arr3) {
      for (int col: row) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
    */
		
	}
	
	
	/* ------------------------------------ */
	// METHODS
	/* ------------------------------------ */
	
	// Define a method that takes in two integers and returns the sum of those two integers
	public static int sum(int x, int y) {
		return x + y;
	}
	
	// Define a method that flips a coin. In the method, create a double between 0 and 1. If the double is 0.5 or above, return "Heads". If the double is <0.5, return "Tails" (see below).
	public static String coinFlip() {
		double flip = Math.random();
		if (flip >= 0.5) {
			return ("Heads");
		} else {
			return ("Tails");
		}
	}
}