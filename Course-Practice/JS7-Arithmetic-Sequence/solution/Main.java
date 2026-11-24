class Main {
    public static void main(String[] args) {

        int[] arr = generateArithSeq(5, 4, 2);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] generateArithSeq(int first, int count, int difference) {

        int[] arr = new int[count];

        int index = 0;
        int value = first;
        while (index < count) {
            arr[index] = value;
            value += difference;
            index++;
        }

        return arr;
    }
}
