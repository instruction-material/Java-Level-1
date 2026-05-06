import java.util.Scanner;


class JS3_Too_Chicken_to_Cross_the_Road
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Left side is clear (enter true or false): ");
		boolean leftSideClear = s.nextBoolean();
		System.out.print("Right side is clear (enter true or false): ");
		boolean rightSideClear = s.nextBoolean();
		
		if (leftSideClear && rightSideClear) {
			System.out.println("Charlie, it is safe to cross the road!");
		} else if (leftSideClear && !rightSideClear) {
			System.out.println("Charlie, there are cars on the right side of the road!");
		} else if (rightSideClear && !leftSideClear) {
			System.out.println("Charlie, there are cars on the left side of the road!");
		} else {
			System.out.println("Charlie, there are cars on both sides of the road!");
		}
	}
}