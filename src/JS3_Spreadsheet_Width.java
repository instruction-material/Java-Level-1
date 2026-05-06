import java.util.Scanner;


class JS3_Spreadsheet_Width
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("How many characters wide is each cell of the spreadsheet? ");
		int width = s.nextInt();
		
		System.out.print("Type in the string: ");
		String string = s.next();
		
		String finalString = "|";
		int length = string.length();
		
		if (length < width) {
			finalString += string;
			for (int i = length; i < width; i++) {
				finalString += " ";
			}
		} else {
			finalString += string.substring(0, width);
		}
		
		finalString += "|";
		
		System.out.println(finalString);
	}
}