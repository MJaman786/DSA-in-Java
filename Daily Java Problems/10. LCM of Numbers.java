// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static int lcm(int num1, int num2){
        int factor;
        for(int i=1; i<=num2; i++){
            factor = num1 * i;
            if((factor % num2)==0){
                return factor;       
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("LCM od 15, 20: "+lcm(15, 20));
        System.out.println("LCM od 30, 40: "+lcm(30, 40));
        System.out.println("LCM od 2, 4: "+lcm(2, 4));
    }
}

LCM od 15, 20: 60
LCM od 30, 40: 120
LCM od 2, 4: 4

=== Code Execution Successful ===