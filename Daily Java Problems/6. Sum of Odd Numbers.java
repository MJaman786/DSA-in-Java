// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static int oddSum(int num){
        int sum = 0;
        for(int i=1; i<=num; i=(i+2)){
            System.out.print(" - Sum of "+sum+" + "+i+" = ");
            sum += i;
            System.out.println(sum);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int result = oddSum(num);
        System.out.println(" - Total sum of odd number till range "+num+": "+result);
    }
}

Enter any number: 5
 - Sum of 0 + 1 = 1
 - Sum of 1 + 3 = 4
 - Sum of 4 + 5 = 9
 - Total sum of odd number till range 5: 9

=== Code Execution Successful ===