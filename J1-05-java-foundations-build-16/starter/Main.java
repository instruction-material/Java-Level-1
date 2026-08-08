import java.util.List;

public class Main {
    private static int computeScore(List<Integer> values) {
        int largestGap = 0;
        for (int i = 1; i < values.size(); i++) {
            // TODO: compare values.get(i) with values.get(i - 1).
        }
        return largestGap;
    }

    public static void main(String[] args) {
        System.out.println(computeScore(List.of(2, 5, 8, 13)));
    }
}
