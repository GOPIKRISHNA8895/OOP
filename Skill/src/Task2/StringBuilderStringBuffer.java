package Task2;

public class StringBuilderStringBuffer {
    public static void main(String[] args) {
        // StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        System.out.println("StringBuilder: " + sb.toString());

        // StringBuffer (Thread-safe)
        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Programming");
        sbf.reverse();
        System.out.println("StringBuffer (reversed): " + sbf.toString());
    }
}
