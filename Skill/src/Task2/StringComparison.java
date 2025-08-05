package Task2;
public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        // Reference comparison
        System.out.println("str1 == str2: " + (str1 == str2)); // true
        System.out.println("str1 == str3: " + (str1 == str3)); // false

        // Content comparison
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
    }
}

