// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static long factorial(long num){
        long fact = 1;
        if(num == 1){
            return fact;
        }
        return num * factorial(num-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(20));
    }
}

2432902008176640000

=== Code Execution Successful ===

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static long factorial(int num){
        long fact = 1;
        if(num == 1){
            return 1;
        }
        else if(num > 1){
            for(int i=num; i>=1; i--){
                fact *= i;
            }    
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial(20));
    }
}

2432902008176640000

=== Code Execution Successful ===