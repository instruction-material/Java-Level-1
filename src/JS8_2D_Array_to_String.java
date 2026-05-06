class JS8_2D_Array_to_String
{
	public static void main(String[] args) {
		int[][] arr = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
		System.out.println(arrToString(arr));
	}
	
	public static String arrToString(int[][] a) {
		
		String readable = "[";
		for (int i = 0; i < a.length; i++) {
			
			readable += "[";
			for (int j = 0; j < a[0].length; j++) {
				
				readable += a[i][j];
				if (j < a[0].length - 1) {
					readable += ", ";
				}
			}
			readable += "]";
			
			if (i < a.length - 1) {
				readable += ", ";
			}
		}
		readable += "]";
		return readable;
	}
}