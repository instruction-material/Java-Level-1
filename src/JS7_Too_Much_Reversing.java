class JS7_Too_Much_Reversing
{
	public static void main(String[] args) {
		
		String[] strArr = {"horse", "cowboy", "yeehaw"};
		String[] reverseStrArr = reverseArr(strArr);
		for (int i = 0; i < reverseStrArr.length; i++) {
			System.out.println(reverseStrArr[i]);
		}
	}
	
	public static String[] reverseArr(String[] a) {
		
		String[] newA = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			newA[a.length - 1 - i] = reverseStr(a[i]);
		}
		return newA;
	}
	
	public static String reverseStr(String s) {
		
		String newS = "";
		for (int i = 0; i < s.length(); i++) {
			newS = s.charAt(i) + newS;
		}
		return newS;
	}
}