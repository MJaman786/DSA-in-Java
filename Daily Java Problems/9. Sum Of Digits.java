// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static long sumOfDigits(int num){
        int sum = 0;
        while(num!=0){
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1020));
    }
}

3

=== Code Execution Successful ===



// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void sumOfDigits(int num, int answer){
        if(num == 0){
            System.out.println("\n - Sum of Digit: "+answer);
            return;    
        }
        answer += num % 10;
        num /= 10;
        sumOfDigits(num, answer);
    }
    
    public static void main(String[] args) {
        sumOfDigits(123, 0);
    }
}


 - Sum of Digit: 6

=== Code Execution Successful ===


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static int sumOfDigits(int num){
        if(num == 0){
            return 0;    
        }
        return (num % 10) + sumOfDigits(num / 10);
    }
    public static void main(String[] args) {
        System.out.println("\n - Sum of Digit: "+sumOfDigits(123));
    }
}


 - Sum of Digit: 6

=== Code Execution Successful ===
