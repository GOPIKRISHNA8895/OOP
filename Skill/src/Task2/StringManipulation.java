package Task2;

public class StringManipulation {
    public static void main(String[] args) {
        String original = "  Java Programming  ";

        System.out.println("Original: \"" + original + "\"");
        System.out.println("Trimmed: \"" + original.trim() + "\"");
        System.out.println("Lowercase: " + original.toLowerCase());
        System.out.println("Uppercase: " + original.toUpperCase());
        System.out.println("Substring (5, 16): " + original.substring(5, 16));
        System.out.println("Replace 'a' with '@': " + original.replace('a', '@'));
    }
}
