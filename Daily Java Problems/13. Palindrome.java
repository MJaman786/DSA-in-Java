// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void palindrome(int num){
        int original = num;
        int remainder, answer = 0;
        while(num!=0){
            remainder = num % 10;
            answer = answer * 10 + remainder;
            num = num / 10;
        }
        System.out.println("Reverse of number: "+answer);
        if(answer==original){
            System.out.println("number is palindrome.");
        }else{
            System.out.println("number is't palindrome.");
        }
    }
    public static void main(String[] args) {
        palindrome(123);
    }
}

Reverse of number: 321
number is't palindrome.

=== Code Execution Successful ===