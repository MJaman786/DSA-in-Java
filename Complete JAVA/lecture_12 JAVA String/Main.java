public class Main {

    public static void main(String[] args) {
        // String Declaration and Initialization
        String str1 = "Hello";
        String str2 = "World";

        // 1. Concatenation (Joining two strings together)
        String concatenatedStr = str1 + " " + str2;  // Using + operator to concatenate
        System.out.println("Concatenated String: " + concatenatedStr); // Output: Hello World

        // 2. Length (Finding the length of a string)
        int length = concatenatedStr.length();  // length() gives the number of characters in a string
        System.out.println("Length of concatenated string: " + length); // Output: 11

        // 3. Substring (Extracting a portion of the string)
        String substring = concatenatedStr.substring(0, 5);  // Extracts substring starting from index 0 to 5 (exclusive)
        System.out.println("Substring (0,5): " + substring); // Output: Hello

        // 4. Character at specific index (Get the character at a particular position)
        char charAtIndex = concatenatedStr.charAt(6);  // Gets the character at index 6
        System.out.println("Character at index 6: " + charAtIndex); // Output: W

        // 5. String Comparison (Check if two strings are equal)
        boolean areStringsEqual = str1.equals(str2);  // Compares str1 and str2 for equality (case-sensitive)
        System.out.println("Are strings equal? " + areStringsEqual); // Output: false

        // 6. String Comparison ignoring case (Check equality ignoring case)
        boolean areStringsEqualIgnoreCase = str1.equalsIgnoreCase("HELLO");  // Compares ignoring case
        System.out.println("Are strings equal (ignoring case)? " + areStringsEqualIgnoreCase); // Output: true

        // 7. Case Conversion (Convert the string to lowercase and uppercase)
        String lowerCase = str1.toLowerCase();  // Converts string to lowercase
        String upperCase = str2.toUpperCase();  // Converts string to uppercase
        System.out.println("Lowercase of str1: " + lowerCase); // Output: hello
        System.out.println("Uppercase of str2: " + upperCase); // Output: WORLD

        // 8. Trimming (Remove leading and trailing spaces)
        String strWithSpaces = "  Hello World  ";
        String trimmedStr = strWithSpaces.trim();  // Removes leading and trailing spaces
        System.out.println("Trimmed String: " + trimmedStr); // Output: Hello World

        // 9. Replace (Replace a character or a substring)
        String replacedStr = str1.replace('l', 'x');  // Replaces 'l' with 'x'
        System.out.println("String after replacing 'l' with 'x': " + replacedStr); // Output: Hexxo

        // 10. Splitting a string (Split the string into an array based on a delimiter)
        String sentence = "Hello,World,Java,Programming";
        String[] words = sentence.split(",");  // Splits the sentence at each comma
        System.out.println("Splitted words: ");
        for (String word : words) {
            System.out.print(word+" ");  // Output: Hello, World, Java, Programming
        }

        // 11. String to character array (Convert string to an array of characters)
        char[] charArray = str1.toCharArray();  // Converts the string to a char array
        System.out.print("Character array: ");
        for (char c : charArray) {
            System.out.print(c + " ");  // Output: H e l l o 
        }
        System.out.println();

        // 12. Index of a character or substring (Find the position of a character or substring)
        int index = concatenatedStr.indexOf('W');  // Finds the index of the first occurrence of 'W'
        System.out.println("Index of 'W': " + index); // Output: 6

        // 13. Last index of a character (Find the last occurrence of a character or substring)
        String repeatedStr = "Hello Hello";
        int lastIndex = repeatedStr.lastIndexOf('l');  // Finds the last occurrence of 'l'
        System.out.println("Last index of 'l': " + lastIndex); // Output: 9

        // 14. Check if a string contains a specific character/substring
        boolean containsSubstring = concatenatedStr.contains("World");  // Checks if "World" is in concatenatedStr
        System.out.println("Does the string contain 'World'? " + containsSubstring); // Output: true

        // 15. Checking if a string starts or ends with a specific substring
        boolean startsWith = str1.startsWith("He");  // Checks if str1 starts with "He"
        boolean endsWith = str2.endsWith("ld");  // Checks if str2 ends with "ld"
        System.out.println("Does str1 start with 'He'? " + startsWith); // Output: true
        System.out.println("Does str2 end with 'ld'? " + endsWith); // Output: true

        // 16. String to Integer (Convert string to integer)
        String numStr = "123";
        int num = Integer.parseInt(numStr);  // Converts string "123" to integer 123
        System.out.println("Converted Integer: " + num); // Output: 123

        // 17. Integer to String (Convert integer to string)
        int number = 456;
        String numAsString = Integer.toString(number);  // Converts integer 456 to string "456"
        System.out.println("Converted String: " + numAsString); // Output: 456
    }
}
