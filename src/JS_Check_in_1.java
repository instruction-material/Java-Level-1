import java.util.Scanner;


class JS_Check_in_1
{
	public static void main(String[] args) {
		/* --------------------------------------*/
		// VARIABLES AND INPUT/OUTPUT
		/* --------------------------------------*/
		
		// What is a variable? Store the integer 20 in a variable called num. Store the decimal 3.14 in a variable called pi. Store the boolean true in a variable called isHot.
		int num = 20;
		double pi = 3.14;
		boolean isHot = false;
		
		// Print one of the variables
		System.out.println(num);
		
		// What's the difference between System.out.print and System.out.println?
		// Ans: System.out.println will add a new line after the printed output while System.out.print will not
		
		// Store the string "food" in a variable called word. How is a string different from the other kinds of variables?
		// Ans: ints, doubles, and booleans are primitive types while strings are objects.
		String word = "food";
		
		// Ask the user to guess an animal and then guess the color of that animal.
		Scanner in = new Scanner(System.in);
		System.out.print("Guess an animal: ");
		String animal = in.nextLine();
		System.out.print("Guess what color the animal is: ");
		String color = in.nextLine();
		
		// Print the first letter in the animal that the user guessed
		System.out.println(animal.charAt(0));
		
		// Print the number of letters in the color that the user guessed
		System.out.println(color.length());
		
		// Print a statement that tells the user what animal and color they guessed (make sure there’s a space between the color and animal!)
		System.out.println("You guessed a " + color + " " + animal);
		
		// Write a comment describing the line of code you just wrote
		// ex. This tells the user what colored animal that they guessed
		
		
		/* --------------------------------------*/
		// CONDITIONALS
		/* --------------------------------------*/
		
		// What is a conditional statement? Can you think of a conditional statement in real life?
		// ex. An if-then statement; where we check if something is true; tells program to do something only if the condition is true..etc
		// ex: if the light is red, then stop, if the light is green, then go, etc.
		
		// Using the guesses that we asked the user for above, we want to check if the user guessed correctly! First we'll check if the user guessed a dog. If the animal they guessed was a dog, tell the user "Dogs rule!"
		if (animal.equals("dog")) {
			System.out.println("Dogs rule!");
		}
		
		// Next, let’s tell the user whether they got the right answer of a black cat! Print “Correct answer!” if the animal is a black cat, print “Almost there!” if the animal is either black or a cat, and print “Incorrect answer :( ” if the user guessed neither.
		if (animal.equals("cat") && color.equals("black")) {
			System.out.println("Correct answer!");
		} else if (animal.equals("cat") || color.equals("black")) {
			System.out.println("Almost there!");
		} else {
			System.out.println("Incorrect answer :( ");
		}
		
		// Do you remember what a nested if statement is? How would you change part of the above problem to include a nested if statement?
		if (animal.equals("cat")) {
			if (color.equals("black")) {
				System.out.println("Correct answer!");
			} else {
				System.out.println("Right animal! Wrong color!");
			}
		} else if (color.equals("black")) {
			if (animal.equals("cat")) {
				System.out.println("Correct answer!");
			} else {
				System.out.println("Right color! Wrong animal!");
			}
		} else {
			System.out.println("Wrong answer :(");
		}
		
		
		/* --------------------------------------*/
		// LOOPS
		/* --------------------------------------*/
		
		// What is a loop? What do we use it for?
		//ex: We use it when we want to repeat some code over and over / when we want to do something multiple times!
		
		// What is the difference between a for loop and a while loop?
		// ex: We use a for loop when we want to repeat a certain number of times, and a while loop if we want to repeat until a condition is met
		
		// Print the numbers 0 - 9 using a for loop
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// Print the numbers 20 to 10 using a for loop
		for (int j = 20; j >= 10; j--) {
			System.out.println(j);
		}
		
		// Print all of the even numbers between 12 and 28 using a for loop
		for (int i = 12; i <= 28; i += 2) {
			System.out.println(i);
		}
		
		// Using a while loop, print the numbers from 0 to 20
		int c = 0;
		while (c < 21) {
			System.out.println(c);
			c++;
		}
		
		// Using a while loop, print the even numbers from 34 to 10
		int e = 34;
		while (e >= 10) {
			System.out.println(e);
			e -= 2;
		}
		
		// How do we know when to use nested loops?
		// Ans: We would use them when we want some code that's already being repeated to repeat within a loop
		
		// Use nested loops to print out a 5x5 multiplication table
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
		
		// In the previous problem's code, how many total times does the inner print statement run?
		// Ans: 25 times (the outer loop runs 5 times and the inner loop runs 5 times for each iteration of the outer loop)
	}
}