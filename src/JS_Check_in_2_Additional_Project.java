class JS_Check_in_2_Additional_Project
{
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		
		System.out.println(countNumElementsAboveFive(arr));
	}
	
	public static int countNumElementsAboveFive(int[] a) {
		int count = 0;
		for (int j : a) {
			if (j > 5) {
				count++;
			}
		}
		return count;
	}
}