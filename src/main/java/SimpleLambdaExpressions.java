public class SimpleLambdaExpressions {
    public static void main(String[] args) {
        // Lambda expression for addition
        MathOperation addition = (a, b) -> a + b;

        // Lambda expression for subtraction
        MathOperation subtraction = (a, b) -> a - b;

        // Lambda expression for multiplication
        MathOperation multiplication = (a, b) -> a * b;

        // Lambda expression for division
        MathOperation division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return a / b;
        };

        // Test the lambda expressions
        System.out.println("Addition: " + addition.operate(10, 5));
        System.out.println("Subtraction: " + subtraction.operate(10, 5));
        System.out.println("Multiplication: " + multiplication.operate(10, 5));
        System.out.println("Division: " + division.operate(10, 5));
    }

    // Functional interface for math operations
    interface MathOperation {
        double operate(double a, double b);
    }
}
