// Every Java program must be enclosed inside a class definition
public class Main {

    // The main method serves as the absolute entry point for execution
    public static void main(String[] args) {
        
        // 1. Output text to the console
        System.out.println("Hello, World!");
        
        // 2. Variables and Data Types
        int number1 = 10;
        int number2 = 20;
        int sum = number1 + number2;
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
        
        // 3. Conditional (If-Else) Statement
        if (sum > 25) {
            System.out.println("The sum is greater than 25.");
        } else {
            System.out.println("The sum is 25 or less.");
        }
        
        // 4. Loops (Printing numbers 1 to 5)
        System.out.print("Counting: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Prints a new line
        
        // 5. Calling a separate method
        int result = multiplyNumbers(4, 5);
        System.out.println("Result of multiplication: " + result);
    }
    
    // A separate reusable method that multiplies two numbers and returns the result
    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }
}

