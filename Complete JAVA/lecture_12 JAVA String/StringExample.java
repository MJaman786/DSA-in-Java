// Importing necessary package (not required for String but a good practice for Java programs)
// import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        // 1. String creation using literals
        String literalString = "Hello, World!"; // Stored in the String Pool
        System.out.println("Literal String: " + literalString);

        // 2. String creation using 'new' keyword
        String newString = new String("Hello, Java!"); // Stored in heap memory
        System.out.println("New String: " + newString);

        // 3. String length
        int length = literalString.length(); // Length of the string
        System.out.println("Length of the literal string: " + length);

        // 4. Accessing a character at a specific index
        char character = literalString.charAt(7); // Character at index 7
        System.out.println("Character at index 7: " + character);

        // 5. Extracting a substring
        String substring = literalString.substring(7, 12); // From index 7 to 11
        System.out.println("Substring: " + substring);

        // 6. Comparing strings
        String anotherString = "hello, world!";
        boolean isEqual = literalString.equals(anotherString); // Case-sensitive comparison
        System.out.println("Is equal (case-sensitive): " + isEqual);

        boolean isEqualIgnoreCase = literalString.equalsIgnoreCase(anotherString); // Ignore case
        System.out.println("Is equal (ignore case): " + isEqualIgnoreCase);

        // 7. Converting to lowercase and uppercase
        System.out.println("Lowercase: " + literalString.toLowerCase());
        System.out.println("Uppercase: " + literalString.toUpperCase());

        // 8. Removing extra spaces
        String spacedString = "   Hello, World!   ";
        System.out.println("Trimmed string: " + spacedString.trim());

        // 9. Replacing characters
        String replacedString = literalString.replace('o', '0'); // Replace 'o' with '0'
        System.out.println("Replaced string: " + replacedString);

        // 10. Concatenating strings
        String concatenatedString = literalString + " Let's learn Java.";
        System.out.println("Concatenated string: " + concatenatedString);

        String concatenatedWithMethod = literalString.concat(" It's fun!");
        System.out.println("Concatenated with concat(): " + concatenatedWithMethod);

        // 11. String comparison using compareTo()
        int comparisonResult = literalString.compareTo(anotherString); // Lexicographical comparison
        System.out.println("Comparison result: " + comparisonResult); // Positive if greater, negative if smaller

        // 12. Using StringBuilder for mutable strings
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", Java!"); // Append to the existing string
        System.out.println("StringBuilder result: " + sb);

        // 13. Using StringBuffer for thread-safe operations
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(", Thread-safe!");
        System.out.println("StringBuffer result: " + sbf);
    }
}
