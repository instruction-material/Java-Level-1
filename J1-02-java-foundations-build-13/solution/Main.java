import java.util.List;

// Demonstrate filtering values before adding them to a score
public class Main {
    private static final List<Integer> SAMPLE_VALUES = List.of(2, 5, 8, 13);
    private static final int EVEN_DIVISOR = 2;

    // Compute the total of the even values only
    private static int computeScore(List<Integer> values) {
        int total = 0;

        // Check each value before adding it to the total
        for (int value : values) {
            // Keep only values that divide evenly by two
            if (value % EVEN_DIVISOR == 0) {
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
