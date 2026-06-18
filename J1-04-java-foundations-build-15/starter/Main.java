import java.util.List;

public class Main {
	private static int computeScore(List<Integer> values, int min, int max) {
		int count = 0;
		for (int value : values) {
			// TODO: count values that are between min and max, inclusive.
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(computeScore(List.of(2, 5, 8, 13), 5, 10));
	}
}
