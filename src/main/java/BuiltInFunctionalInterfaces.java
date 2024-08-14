import java.util.function.Predicate; // Import the Predicate functional interface
import java.util.function.Function; // Import the Function functional interface
import java.util.function.Consumer; // Import the Consumer functional interface
import java.util.function.Supplier; // Import the Supplier functional interface

public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        // Predicate to check if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;
        // Predicate functional interface represents a boolean-valued function.
        // The isEven predicate checks if a number is divisible by 2.
        System.out.println("Is 4 even? " + isEven.test(4));
        // Use the test method to evaluate the predicate with the number 4.
        // It prints "true" if 4 is even.

        // Function to square a number
        Function<Integer, Integer> square = number -> number * number;
        // Function functional interface represents a function that takes one argument and produces a result.
        // The square function takes an integer and returns its square.
        System.out.println("Square of 5: " + square.apply(5));
        // Use the apply method to execute the function with the number 5.
        // It prints "25" as the square of 5.

        // Consumer to display a message
        Consumer<String> displayMessage = message -> System.out.println("Message: " + message);
        // Consumer functional interface represents an operation that takes a single input and returns no result.
        // The displayMessage consumer takes a string and prints it.
        displayMessage.accept("Hello, Lambda!");
        // Use the accept method to execute the consumer with the string "Hello, Lambda!".
        // It prints "Message: Hello, Lambda!".

        // Supplier to provide a random number
        Supplier<Double> randomSupplier = () -> Math.random();
        // Supplier functional interface represents a function that takes no input and returns a result.
        // The randomSupplier provides a random double value.
        System.out.println("Random number: " + randomSupplier.get());
        // Use the get method to execute the supplier and obtain a random number.
        // It prints the random number generated.
    }
}

/*
 * Summary:
 * The BuiltInFunctionalInterfaces class demonstrates the use of Java's built-in functional interfaces:
 * Predicate, Function, Consumer, and Supplier. These interfaces are used to represent lambda expressions
 * that perform operations such as checking a condition, transforming data, consuming input, and supplying
 * output. The class shows how to create and use these interfaces with examples such as checking if a number
 * is even, squaring a number, displaying a message, and generating a random number.
 */
