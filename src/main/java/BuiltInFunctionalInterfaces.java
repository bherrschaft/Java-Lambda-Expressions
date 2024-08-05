import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        // Predicate to check if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // Function to square a number
        Function<Integer, Integer> square = number -> number * number;
        System.out.println("Square of 5: " + square.apply(5));

        // Consumer to display a message
        Consumer<String> displayMessage = message -> System.out.println("Message: " + message);
        displayMessage.accept("Hello, Lambda!");

        // Supplier to provide a random number
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random number: " + randomSupplier.get());
    }
}
