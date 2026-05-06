import java.util.Scanner;


class JS3_Code_Your_Own_Adventure
{
	public static void main(String[] args) {
		System.out.println("You wake up and find yourself on a hard wooden bench. You're in a tiny room - you look up and see a door with metal bars running down it. Do you *peek* out the door or do you *yell* to see if anyone is out there?");
		
		Scanner in = new Scanner(System.in);
		String action = in.nextLine();
		
		if (action.equals("peek")) {
			System.out.println("You see another room! There's a person in there watching TV. Do you *watch* to see what's on TV or do you *look around* the room some more?");
			
			action = in.nextLine();
			
			if (action.equals("look around")) {
				System.out.println("You examine every nook and cranny of this tiny room. All you find is dust, until you're feeling around under the bench. You feel a handle, and with a slight tug, a hole opens up in the ground and you start falling right through it!\n\nYou land on a soft spot, right back on your bed. Phew! :)");
			} else if (action.equals("watch")) {
				System.out.println("You've never seen this show before. But somehow, you are hooked... the longer you watch, the more mesmerized you are by the TV. Before you know it, you're asleep again.");
			} else {
				System.out.println("Sorry, you didn't choose one of the options.");
			}
		} else if (action.equals("yell")) {
			System.out.println("A dark figure glides over and covers up the door. You're trapped in darkness. Foiled!");
		} else {
			System.out.println("Sorry, you didn't choose one of the options.");
		}
	}
}