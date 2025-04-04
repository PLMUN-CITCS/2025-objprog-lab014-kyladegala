public class MethodReturnTypes {

    // Method to display a welcome message
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    // Method to calculate the average of two integers
    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;
        return average;
    }

    public static void main(String[] args) {
        // Calling the welcome message method
        displayWelcomeMessage();

        // Variables to calculate the average
        int value1 = 20;
        int value2 = 30;

        // Calling the calculateAverage method and storing the result
        double result = calculateAverage(value1, value2);

        // Printing the result of the average
        System.out.println("The average is: " + result);
    }
}
