class Main {
    public static void main(String[] args) {
        // Order of Operations
        System.out.println(5 + (6 / 3));
        System.out.println(5 + 6 / 3);
        int num = 5 * 6 + 7 / 9 + 3 - 2;
        System.out.println(num);

        // Modulo (mod) operator calculates the remainder
        System.out.println(5 % 3);
        System.out.println(4 % 2);

        // Using an operator on the left side of the equals sign assigns the variable to now be equal to that operation performed on itself
        int count = 0;
        count = count + 1;         // 1
        count += 1;                // 2
        count += 5;                // 7
        count -= 3;                // 4
        count /= 3;                // 1
        count *= 2;                // 2
        System.out.println(count); // 2
    }
}
