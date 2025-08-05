package Practical2;

public class StringImmutability {
    public static void main(String[] args) {
        String message = "Hello";
        System.out.printf("Original message: %s\n", message);

        message.concat("World"); // This does NOT change 'message' because strings are immutable
    }
}
