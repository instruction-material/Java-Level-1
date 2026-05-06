import java.util.Scanner;


class JS7_Lucky_Array
{
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		
		if (isLucky(arr)) {
			System.out.println("Your array is lucky!");
		} else {
			System.out.println("Your array isn't lucky.");
		}
		
		System.out.println("Your array was:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static boolean isLucky(int[] arr) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("What is your lucky number? ");
		int lucky = s.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == lucky) {
				return true;
			}
		}
		return false;
	}
}