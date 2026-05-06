class JS6_Caught_Speeding
{
	public static void main(String[] args) {
		// test cases
		System.out.println(caughtSpeeding(66, true));
		System.out.println(caughtSpeeding(60, false));
		System.out.println(caughtSpeeding(85, true));
		System.out.println(caughtSpeeding(85, false));
	}
	
	public static String caughtSpeeding(int speed, boolean isBirthday) {
		if (speed <= 65) {
			return "No ticket!";
		}
		
		if (isBirthday) {
			if (speed <= 80) {
				return "No ticket!";
			}
			return "Small ticket!";
		} else {
			if (speed <= 80) {
				return "Small ticket!";
			}
			return "Big ticket!";
		}
	}
}