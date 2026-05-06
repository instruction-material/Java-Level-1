class JS7_String_to_Array
{
	public static void main(String[] args) {
		
		char[] c1 = strToArr("dog");
		for (int i = 0; i < c1.length; i++) {
			System.out.println(c1[i]);
		}
		
		System.out.println();
		
		char[] c2 = strToArr2("treehouse");
		for (int i = 0; i < c2.length; i++) {
			System.out.println(c2[i]);
		}
		
		System.out.println();
		
		char[] c3 = strToArr2("rainbows");
		for (int i = 0; i < c3.length; i++) {
			System.out.println(c3[i]);
		}
	}
	
	public static char[] strToArr(String s) {
		
		char[] characters = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			characters[i] = s.charAt(i);
		}
		return characters;
	}
	
	public static char[] strToArr2(String s) {
		
		int arrLength = 0;
		if (s.length() % 2 == 0) {
			arrLength = s.length() / 2;
		} else {
			arrLength = s.length() / 2 + 1;
		}
		
		char[] characters = new char[arrLength];
		for (int i = 0; i < s.length(); i += 2) {
			characters[i / 2] = s.charAt(i);
		}
		return characters;
	}
}