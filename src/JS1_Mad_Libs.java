import java.util.Scanner;


class JS1_Mad_Libs
{
	public static void main(String[] args) {
		System.out.println("Let's play Mad Libs!");
		Scanner s = new Scanner(System.in);
		System.out.print("noun: ");
		String noun1 = s.nextLine();
		System.out.print("number: ");
		String num1 = s.nextLine();
		System.out.print("verb: ");
		String verb1 = s.nextLine();
		System.out.print("noun: ");
		String noun2 = s.nextLine();
		System.out.print("adjective: ");
		String adj1 = s.nextLine();
		System.out.print("adjective: ");
		String adj2 = s.nextLine();
		System.out.print("noun: ");
		String noun3 = s.nextLine();
		System.out.print("adjective: ");
		String adj3 = s.nextLine();
		System.out.print("noun: ");
		String noun4 = s.nextLine();
		System.out.print("verb: ");
		String verb2 = s.nextLine();
		System.out.print("verb: ");
		String verb3 = s.nextLine();
		System.out.print("verb: ");
		String verb4 = s.nextLine();
		System.out.print("noun: ");
		String noun5 = s.nextLine();
		System.out.print("verb: ");
		String verb5 = s.nextLine();
		System.out.print("noun: ");
		String noun6 = s.nextLine();
		System.out.print("verb: ");
		String verb6 = s.nextLine();
		System.out.print("noun: ");
		String noun7 = s.nextLine();
		System.out.print("noun: ");
		String noun8 = s.nextLine();
		System.out.println();
		
		System.out.println("My name is " + noun1 + " and I've known Sarah and Steven for " + num1 + " years. I " + verb1 + " all the way from " + noun2 + " to celebrate this day. I am so " + adj1 + " that Sarah and Steven are getting married! They have to be the most " + adj2 + " " + noun3 + " and I wish them " + adj3 + " " + noun4 + " for years to come. My best advice? Don't forget to " + verb2 + " before you " + verb3 + " and " + verb4 + " after the " + noun5 + ". Steven, you should always " + verb5 + " Sarah's " + noun6 + " and Sarah, you should always " + verb6 + " Steven's " + noun7 + ". I wish you both a lifetime of happiness and " + noun8 + "!");
	}
}