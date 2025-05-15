// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static boolean isPrime(int num){
        for(int i=2; i*i<=num; i++){
            if((num % i)==0){
                return false;
            }
        }
        return true;
    }
    
    public static void printPrime(){
        for(int i=2; i<=100; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println(isPrime(49));
        System.out.println("Prime number in range of 100: ");
        printPrime();
    }
}

false
Prime number in range of 100: 
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
=== Code Execution Successful ===