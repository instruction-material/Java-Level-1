import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class JS7_Song_Shuffler
{
	public static void main(String[] args) {
		
		// original playlist
		ArrayList<String> songs = new ArrayList<>(
				List.of("The Scientist", "Say Something", "Circles", "Harmony Hall", "Can't Hold Us", "Build Me Up Buttercup", "Shake It Off", "Here Comes the Sun", "Don't Stop Believing", "Lucky", "All the Single Ladies", "Humble and Kind", "Lose Yourself", "Thinking Out Loud", "Despacito"));
		System.out.println("\nOriginal Playlist:\n" + songs);
		
		// shuffle the songs
		Random random = new Random();
		ArrayList<String> shuffled = new ArrayList<>();
		while (songs.size() > 0) {
			int index = random.nextInt(songs.size());
			String song = songs.get(index);
			songs.remove(song);
			shuffled.add(song);
		}
		songs = shuffled;
		
		// print the songs
		System.out.println("\nAfter Shuffling:\n" + songs);
	}
}

