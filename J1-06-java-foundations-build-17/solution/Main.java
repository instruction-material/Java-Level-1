import java.util.List;

public class Main {
	private static int computeScore(List<Integer> values) {
		if (values.isEmpty()) {
			return 0;
		}

		int total = 0;
		for (int value : values) {
			total += value;
		}

		double average = (double) total / values.size();
		int count = 0;
		for (int value : values) {
			if (value > average) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(computeScore(List.of(2, 5, 8, 13)));
	}
}
