import java.util.Scanner;


class JS3_Weather_Activities
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("What is the weather today? ");
		String weather = s.nextLine();
		
		if (weather.equals("sunny")) {
			System.out.println("Swim and relax at the beach!");
		} else if (weather.equals("rainy")) {
			System.out.println("Stay at home and read a book!");
		} else if (weather.equals("cloudy")) {
			System.out.println("Go to the movie theather!");
		} else if (weather.equals("snowy")) {
			System.out.println("Go skiing or snowboarding!");
		} else {
			System.out.println("Sorry, I'm not sure what you should do today!");
		}
	}
}