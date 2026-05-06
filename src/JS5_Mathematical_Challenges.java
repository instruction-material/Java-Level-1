class JS5_Mathematical_Challenges
{
	public static void main(String[] args) {
		// 1. Fizzbuzz
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizzbuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		
		// 2. Factors
		int x = 100;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				System.out.println(i);
			}
		}
		
		// 3. Word reversed
		String word = "racecar";
		String wordReversed = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			wordReversed += word.charAt(i);
		}
		System.out.println(wordReversed);
	}
}