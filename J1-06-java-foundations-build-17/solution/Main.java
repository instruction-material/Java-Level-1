import java.util.List;

// Demonstrate comparing values against their average
public class Main {
	private static final List<Integer> SAMPLE_VALUES = List.of(2, 5, 8, 13);
	private static final int NO_VALUES_ABOVE_AVERAGE = 0;

	// Count how many values are greater than the list average
	private static int computeScore(List<Integer> values) {
		// Empty input has no values above the average
		if (values.isEmpty()) {
			return NO_VALUES_ABOVE_AVERAGE;
		}

		int total = 0;

		// Add each value before calculating the average
		for (int value : values) {
			total += value;
		}

		double average = (double) total / values.size();
		int countAboveAverage = 0;

		// Compare each value against the calculated average
		for (int value : values) {
			// Count only values that are above the average
			if (value > average) {
				countAboveAverage++;
			}
		}

		return countAboveAverage;
	}

	/**
	 * @brief Print the sample score
	 *
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		System.out.println(computeScore(SAMPLE_VALUES));
	}
}
