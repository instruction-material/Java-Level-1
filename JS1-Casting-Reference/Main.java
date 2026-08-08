class Main {
    public static void main(String[] args) {
        int one = 1;
        double half = .5;
        double onePointFive = one + half;
        System.out.println(onePointFive);

        // casting a double to an integer rounds down to the nearest whole number
        System.out.println((int)onePointFive);
        // casting an int to a double adds a decimal point
        System.out.println((double)one);

        // What happens when two integers are divided?
        int num = 4;
        int otherNum = 6;
        System.out.println((int)num / otherNum);
        System.out.println((int)(num / otherNum));
        int output = num / otherNum;
        System.out.println(output);

        // What happens when a double is divided by an integer?
        double result = ((double)num) / otherNum;
        System.out.println(result);

        // What happens when two integers are divided and then cast to a double?
        result = (double)(num / otherNum);
        System.out.println(result);

        //int newNumber = half; errors due to loss of information
    }
}
