class JS6_Methods_Practice
{
	public static void main(String[] args) {
		System.out.println(average(3, 6));
		System.out.println(isEven(8));
		System.out.println(min(10, 9.5, 8));
		System.out.println(factorial(5));
		System.out.println(exponent(5, 3));
	}
	
	public static double average(int a, int b) {
		return (a + b) / 2.0;
	}
	
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
	
	public static double min(double a, double b, double c) {
		if (a < b && a < c) {
			return a;
		} else if (b < a && b < c) {
			return b;
		} else {
			return c;
		}
	}
	
	public static int factorial(int n) {
		int answer = 1;
		for (int i = 2; i <= n; i++) {
			answer *= i;
		}
		
		return answer;
	}
	
	public static int exponent(int b, int p) {
		int answer = 1;
		for (int i = 0; i < p; i++) {
			answer *= b;
		}
		
		return answer;
	}
}