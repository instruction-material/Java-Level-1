import java.util.List;

public class Main {
    private static int computeScore(List<Integer> values) {
        if (values.isEmpty()) {
            return 0;
        }

        int total = 0;
        for (int value : values) {
            // TODO: add each value to total.
        }

        double average = 0.0; // TODO: calculate the average.
        int count = 0;
        for (int value : values) {
            // TODO: count values greater than average.
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(computeScore(List.of(2, 5, 8, 13)));
    }
}
