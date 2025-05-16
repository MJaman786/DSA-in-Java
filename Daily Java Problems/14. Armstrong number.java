// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class Main {
    public static int count(int num){
        int digits = 0;
        while(num!=0){
            digits++;
            num = num / 10;
        }
        System.out.println(" - Total number of digits: "+digits);
        return digits;
    }
    public static int powerOf(int base, int exponent){
        int result = 1;
        for(int i=1; i<=exponent; i++){
            result = result * base; 
        }
        System.out.println(" - "+base+" to power "+exponent+" : "+result);
        return result;
    }
    public static boolean isArmstrong(int num){
        int original = num;
        int result = 0;
        int numOfDigits = count(num);
        while(num!=0){
            int rem = num % 10;
            result = result + powerOf(rem, numOfDigits);
            num = num / 10;
        }
        System.out.println("Final number after summation of powers : "+result);
        if(result==original){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, choice;
        do{
            System.out.print("\n + Enter a number: ");
            num = sc.nextInt();
            // int num = 20;
            if(isArmstrong(num)){
                System.out.println("Is a Armstrong number.");
            }else{
                System.out.println("Is't a Armstrong number.");
            }
            System.out.print("\n If want to try again press 1 or exit press 0 : ");
            choice = sc.nextInt();
        }while(choice == 1);
        
    }
}

/*
 + Enter a number: 72
  - Total number of digits: 2
 - 2 to power 2 : 4
 - 7 to power 2 : 49
Final number after summation of powers : 53
Is't a Armstrong number.

 If want to try again press 1 or exit press 0 : 1
 
 + Enter a number: 153
  - Total number of digits: 3
 - 3 to power 3 : 27
 - 5 to power 3 : 125
 - 1 to power 3 : 1
Final number after summation of powers : 153
Is a Armstrong number.

 If want to try again press 1 or exit press 0 : 1
 
 + Enter a number: 152
  - Total number of digits: 3
 - 2 to power 3 : 8
 - 5 to power 3 : 125
 - 1 to power 3 : 1
Final number after summation of powers : 134
Is't a Armstrong number.

 If want to try again press 1 or exit press 0 : 1
 
 + Enter a number: 370
  - Total number of digits: 3
 - 0 to power 3 : 0
 - 7 to power 3 : 343
 - 3 to power 3 : 27
Final number after summation of powers : 370
Is a Armstrong number.

 If want to try again press 1 or exit press 0 : 0
 
*/