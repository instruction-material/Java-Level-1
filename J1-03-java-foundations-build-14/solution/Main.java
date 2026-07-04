import java.util.List;

// Demonstrate a threshold-based score calculation
public class Main {
	private static final List<Integer> SAMPLE_VALUES = List.of(2, 5, 8, 13);
	private static final int BOOST_THRESHOLD = 10;
	private static final int BOOST_MULTIPLIER = 2;

	// Compute the total score after applying the boost threshold
	private static int computeScore(List<Integer> values) {
		int total = 0;

		// Apply the threshold rule to each value
		for (int value : values) {
			// Boost values that meet or exceed the threshold
			if (value >= BOOST_THRESHOLD) {
				total += value * BOOST_MULTIPLIER;
			}
			// Keep smaller values unchanged
			else {
				total += value;
			}
		}

		return total;
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
