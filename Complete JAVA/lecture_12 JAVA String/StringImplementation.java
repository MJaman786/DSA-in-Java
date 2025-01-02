public class StringImplementation {

    void palindromeString(String str){

        char[] charArray = str.toCharArray();

        int start = 0;
        int end = str.length()-1;

        char temp;
        for (int i = 0; i < (charArray.length/2); i++) {
            temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
        
            start++;
            end--;

        }
        System.out.println("Original String : "+str);
        String newString = new String(charArray);
        System.out.println("Reverse string : "+newString);
        if (str.equals(newString)) {
            System.out.println("String ["+newString+"] is palindrome");
        }else{
            System.out.println("String ["+newString+"] is not a palindrome");
        }
    }
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "AAAA";
        String str3 = "ABBA";

        StringImplementation obj = new StringImplementation();
        obj.palindromeString(str1);
        obj.palindromeString(str2);
        obj.palindromeString(str3);
    }
}

/*
output
Original String : ABCD
Reverse string : DCBA
*/ 