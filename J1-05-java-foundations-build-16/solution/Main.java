import java.util.List;

// Demonstrate comparing neighboring values in a list
public class Main {
	private static final List<Integer> SAMPLE_VALUES = List.of(2, 5, 8, 13);
	private static final int FIRST_COMPARISON_INDEX = 1;
	private static final int PREVIOUS_INDEX_OFFSET = 1;

	// Compute the largest increase between neighboring values
	private static int computeScore(List<Integer> values) {
		int largestGap = 0;

		// Compare each value with the value immediately before it
		for (int valueIndex = FIRST_COMPARISON_INDEX; valueIndex < values.size(); valueIndex++) {
			int gap = values.get(valueIndex) - values.get(valueIndex - PREVIOUS_INDEX_OFFSET);

			// Save the gap only when it is the largest seen so far
			if (gap > largestGap) {
				largestGap = gap;
			}
		}

		return largestGap;
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
