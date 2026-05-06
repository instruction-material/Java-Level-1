class JS7_Arithmetic_Sequence
{
	public static void main(String[] args) {
		
		int[] arr = generateArithSeq(-2, 3, 6);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] generateArithSeq(int d, int a, int n) {
		
		int[] arr = new int[n];
		
		int index = 0;
		int value = a;
		while (index < n) {
			arr[index] = value;
			value += d;
			index++;
		}
		
		return arr;
	}
}