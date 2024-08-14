public class CustomFunctionalInterfaces {
    public static void main(String[] args) {
        // Custom functional interface for string concatenation
        // The lambda expression defines how two strings should be concatenated with a space in between
        StringConcat concat = (str1, str2) -> str1 + " " + str2;

        // Test the lambda expression
        // It concatenates "Hello" and "World" with a space and prints "Hello World"
        System.out.println(concat.concat("Hello", "World"));
    }

    // Custom functional interface
    @FunctionalInterface // This annotation indicates that the interface is intended to be a functional interface
    interface StringConcat {
        // Abstract method that takes two strings and returns a concatenated string
        String concat(String str1, String str2);
    }
}

/*
 * Summary:
 * The CustomFunctionalInterfaces class demonstrates the creation and use of a custom functional interface
 * named StringConcat. This interface defines a single abstract method for concatenating two strings.
 * A lambda expression is used to implement this interface, which concatenates two strings with a space in between.
 * The class shows how to create a custom functional interface, implement it with a lambda expression, and use it
 * to perform the desired operation.
 */
