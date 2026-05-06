import java.util.Scanner;


class JS7_Airline_Management
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Transatlantic Airlines!");
		boolean[] seats = new boolean[5];
		
		while (!isFull(seats)) {
			
			System.out.print("Which seat would you like to book? Pick a seat number between 1 and 5: ");
			int seatNumber = s.nextInt();
			
			if (reserveSeat(seatNumber, seats)) {
				System.out.println("Perfect! Your seat has been booked!\n");
			} else {
				System.out.println("Sorry, that seat has already been reserved.\n");
			}
		}
		
		System.out.println("The plane is ready for take-off! Thanks for flying with Transatlantic Airlines!");
	}
	
	public static boolean reserveSeat(int seatNumber, boolean[] seats) {
		if (seats[seatNumber - 1]) { // seat is already reserved
			return false;
		} else { // not already reserved, so reserve the seat
//			seats[seatNumber - 1] = true;
			return seats[seatNumber - 1] = true;
		}
	}
	
	public static boolean isFull(boolean[] seats) {
		for (boolean seat : seats) {
			if (!seat) {
				return false;
			}
		}
		return true;
	}
}