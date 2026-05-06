import java.util.Scanner;


class JS3_Elevator_Limits
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int weightLimit = 1500;
		System.out.print("How much does the elevator weigh? ");
		int elevatorWeight = s.nextInt();
		
		if (elevatorWeight > weightLimit) {
			System.out.println("Warning: the elevator is overweight by " + (elevatorWeight - weightLimit) + " pounds!");
		} else {
			System.out.println("The elevator is good to go! It is " + (weightLimit - elevatorWeight) + " pounds under the weight limit.");
		}
	}
}