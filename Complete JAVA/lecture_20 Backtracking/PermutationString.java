class PermutationString {
    public static void printString(String str, String perm, int index) {
        if (str.length() == 0) {
            System.out.print(perm + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printString(newStr, perm + currChar, index + 1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printString(str, "", 0);
    }
}