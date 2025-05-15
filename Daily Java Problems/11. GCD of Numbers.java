// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static int gcd(int num1, int num2){
        int divisor = 0;
        for(int i=1; i<=num1; i++){
            if( (num1 % i) == 0 && (num2 % i) == 0){
                divisor = i;
            }
        }
        return divisor;
    }
    public static void main(String[] args) {
        System.out.println("GCD od 10, 20: "+gcd(10, 20));
        System.out.println("GCD od 30, 40: "+gcd(30, 40));
        System.out.println("GCD od 2, 4: "+gcd(2, 4));
    }
}

GCD od 15, 20: 10
GCD od 30, 40: 10
GCD od 2, 4: 2

=== Code Execution Successful ===