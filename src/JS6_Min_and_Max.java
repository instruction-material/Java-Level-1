class JS6_Min_and_Max
{
	public static void main(String[] args) {
		//test cases
		System.out.println(max(10, 4, 6));
		System.out.println(min(1, 0, -3));
	}
	
	public static int max(int a, int b, int c) {
		if (a > b) {
			if (a > c) {
				return a;
			} else {
				return c;
			}
		} else {
			if (b > c) {
				return b;
			} else {
				return c;
			}
		}
	}
	
	public static int min(int a, int b, int c) {
		if (a < b) {
			if (a < c) {
				return a;
			} else {
				return c;
			}
		} else {
			if (b < c) {
				return b;
			} else {
				return c;
			}
		}
	}
}