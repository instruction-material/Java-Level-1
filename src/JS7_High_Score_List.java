import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class JS7_High_Score_List
{
	public static void main(String[] args) {
		
		// original sorted highscore list
		ArrayList<Integer> highscores = new ArrayList<>();
		highscores.add(500);
		highscores.add(450);
		highscores.add(375);
		System.out.println("\nHighscores:\n" + highscores);
		
		// add highscores forever
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a new highscore: ");
			int score = scanner.nextInt();
			insertScore(score, highscores);
			System.out.println("\nHighscores:\n" + highscores);
		}
	}
	
	//insert a score into the given list
	public static void insertScore(int score, List<Integer> highscores) {
		for (int i = 0; i < highscores.size(); i++) {
			if (score > highscores.get(i)) {
				highscores.add(i, score);
				return;
			}
		}
		// add to the end if it can't be inserted earlier
		highscores.add(score);
	}
}