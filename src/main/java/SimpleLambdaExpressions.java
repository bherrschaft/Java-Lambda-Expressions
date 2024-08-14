public class SimpleLambdaExpressions {
    public static void main(String[] args) {
        // Lambda expression for addition
        // Implements the MathOperation interface to add two numbers
        MathOperation addition = (a, b) -> a + b;

        // Lambda expression for subtraction
        // Implements the MathOperation interface to subtract the second number from the first
        MathOperation subtraction = (a, b) -> a - b;

        // Lambda expression for multiplication
        // Implements the MathOperation interface to multiply two numbers
        MathOperation multiplication = (a, b) -> a * b;

        // Lambda expression for division
        // Implements the MathOperation interface to divide the first number by the second
        MathOperation division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero"); // Throw an exception if the second number is zero
            }
            return a / b; // Perform division if b is not zero
        };

        // Test the lambda expressions with example numbers
        System.out.println("Addition: " + addition.operate(10, 5)); // Prints "Addition: 15.0"
        System.out.println("Subtraction: " + subtraction.operate(10, 5)); // Prints "Subtraction: 5.0"
        System.out.println("Multiplication: " + multiplication.operate(10, 5)); // Prints "Multiplication: 50.0"
        System.out.println("Division: " + division.operate(10, 5)); // Prints "Division: 2.0"
    }

    // Functional interface for math operations
    interface MathOperation {
        // Abstract method that takes two double numbers and returns a double result
        double operate(double a, double b);
    }
}

/*
 * Summary:
 * The SimpleLambdaExpressions class demonstrates the use of lambda expressions to implement a custom
 * functional interface named MathOperation. This interface defines a method for performing operations
 * on two numbers. Lambda expressions are used to implement addition, subtraction, multiplication,
 * and division operations. The class also includes error handling for division by zero and tests each
 * operation with sample input values, printing the results to the console.
 */
