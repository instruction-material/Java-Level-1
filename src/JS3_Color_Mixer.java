import java.util.Scanner;


class JS3_Color_Mixer
{
	public static void main(String[] args) {
		boolean isValid;
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nPrimary Color Mixer");
		System.out.println("Enter red, yellow, or blue:");
		
		//GET COLORS:
		//get color 1
		String color1;
		System.out.print("\nColor 1: ");
		color1 = scanner.nextLine();
		isValid = color1.equals("red") ||
				color1.equals("yellow") ||
				color1.equals("blue");
		if (!isValid) {
			System.out.println("\nInvalid input...\nPlease try again!\n");
			return;
		}
		
		//get color 2
		String color2;
		System.out.print("Color 2: ");
		color2 = scanner.nextLine();
		isValid = color2.equals("red") ||
				color2.equals("yellow") ||
				color2.equals("blue");
		if (!isValid) {
			System.out.println("\nInvalid input...\nPlease try again!\n");
			return;
		}
		
		System.out.println();
		//same color
		if (color1.equals(color2)) {
			System.out.println(color1);
			
			//color1 = red
		} else if (color1.equals("red") && color2.equals("yellow")) {
			System.out.println("orange");
		} else if (color1.equals("red") && color2.equals("blue")) {
			System.out.println("purple");
			
			//color1 = yellow
		} else if (color1.equals("yellow") && color2.equals("red")) {
			System.out.println("orange");
		} else if (color1.equals("yellow") && color2.equals("blue")) {
			System.out.println("green");
			
			//color1 = blue
		} else if (color1.equals("blue") && color2.equals("red")) {
			System.out.println("purple");
		} else if (color1.equals("blue") && color2.equals("yellow")) {
			System.out.println("green");
		}
		System.out.println();
	}
}