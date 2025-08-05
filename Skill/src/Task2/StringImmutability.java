package Task2;

public class StringImmutability {
    public static void main(String[] args) {
        String s = "Immutable";
        System.out.println("Original String: " + s);

        s.concat(" String"); // Not stored
        System.out.println("After concat (not stored): " + s);

        s = s.concat(" String"); // Stored in s
        System.out.println("After concat (stored): " + s);
    }
}
