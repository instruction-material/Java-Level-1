import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a temperature in degrees Farenheit: ");
        int tempFahrenheit = scanner.nextInt();

        // Conversion without casting (less precise)
        int tempCelsiusInt = (tempFahrenheit - 32) * 5 / 9;
        //System.out.println("Temperature in Celsius (int): " + tempCelsiusInt);

        // Conversion with casting
        double tempCelsius = ((double)tempFahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + tempCelsius);

        // Conversion rounded to the nearest degree
        int nearestDegree = (int)(tempCelsius + 0.5);
        System.out.println("Temperature in Celsius (rounded): " +
                           nearestDegree);

        // Reverse conversion
        System.out.print("Enter a temperature in degrees Celsius: ");
        int tempCelsius2 = scanner.nextInt();
        double tempFahrenheit2 = ((double)tempCelsius2 * 9 / 5) + 32;
        int tempFahrenheitRounded = (int)(tempFahrenheit2 + 0.5);
        System.out.println("Temperature in Fahrenheit: " + tempFahrenheit2);
        System.out.println("Temperature in Fahrenheit (rounded): " +
                           tempFahrenheitRounded);
    }
}
