public class CustomFunctionalInterfaces {
    public static void main(String[] args) {
        // Custom functional interface for string concatenation
        StringConcat concat = (str1, str2) -> str1 + " " + str2;

        // Test the lambda expression
        System.out.println(concat.concat("Hello", "World"));
    }

    // Custom functional interface
    @FunctionalInterface
    interface StringConcat {
        String concat(String str1, String str2);
    }
}
