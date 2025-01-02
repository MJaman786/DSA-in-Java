public class EncryptionDecryption {

    // Encryption method
    public static String encrypt(String message, int shift) {
        StringBuilder encryptedMessage = new StringBuilder();

        // Loop through each character of the string
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            // Encrypt lowercase characters
            if (Character.isLowerCase(c)) {
                c = (char) ('a' + (c - 'a' + shift) % 26);
            }
            // Encrypt uppercase characters
            else if (Character.isUpperCase(c)) {
                c = (char) ('A' + (c - 'A' + shift) % 26);
            }

            encryptedMessage.append(c);
        }
        return encryptedMessage.toString();
    }

    // Decryption method
    public static String decrypt(String encryptedMessage, int shift) {
        StringBuilder decryptedMessage = new StringBuilder();

        // Loop through each character of the encrypted message
        for (int i = 0; i < encryptedMessage.length(); i++) {
            char c = encryptedMessage.charAt(i);

            // Decrypt lowercase characters
            if (Character.isLowerCase(c)) {
                c = (char) ('a' + (c - 'a' - shift + 26) % 26);
            }
            // Decrypt uppercase characters
            else if (Character.isUpperCase(c)) {
                c = (char) ('A' + (c - 'A' - shift + 26) % 26);
            }

            decryptedMessage.append(c);
        }
        return decryptedMessage.toString();
    }

    public static void main(String[] args) {
        String message = "How are you";
        int shift = 3;  // Key for encryption

        // Encrypt the message
        String encryptedMessage = encrypt(message, shift);
        System.out.println("Encrypted Message: " + encryptedMessage);

        // Decrypt the message
        String decryptedMessage = decrypt(encryptedMessage, shift);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }
}
