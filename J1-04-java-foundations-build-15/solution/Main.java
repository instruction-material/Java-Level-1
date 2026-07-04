import java.util.List;

// Demonstrate counting values inside an inclusive range
public class Main {
	private static final List<Integer> SAMPLE_VALUES = List.of(2, 5, 8, 13);
	private static final int MINIMUM_ALLOWED_VALUE = 5;
	private static final int MAXIMUM_ALLOWED_VALUE = 10;

	// Count values that fall within the inclusive minimum and maximum bounds
	private static int computeScore(List<Integer> values, int minimumValue, int maximumValue) {
		int count = 0;

		// Test each value against both bounds
		for (int value : values) {
			// Count values that stay inside the valid range
			if (value >= minimumValue && value <= maximumValue) {
				count++;
			}
		}

		return count;
	}

	/**
	 * @brief Print the sample score
	 *
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		System.out.println(
			computeScore(
				SAMPLE_VALUES,
				MINIMUM_ALLOWED_VALUE,
				MAXIMUM_ALLOWED_VALUE
			)
		);
	}
}
