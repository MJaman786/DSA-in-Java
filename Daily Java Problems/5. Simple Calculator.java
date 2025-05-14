// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static int add(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static int div(int a, int b){
        return a / b;
    }
    public static int mul(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, result;
        int choice=0;
        System.out.println("Simple Calculator...");
        while(choice!=5){
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            System.out.println("5. Exit");
            System.out.print(" - Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.print(" - Enter number1: ");
                    a = sc.nextInt();
                    System.out.print(" - Enter number2: ");
                    b = sc.nextInt();
                    result = add(a, b);
                    System.out.println(" - Addition of "+a+" + "+b+" = "+result+"\n");
                break;
                case 2:
                    System.out.print(" - Enter number1: ");
                    a = sc.nextInt();
                    System.out.print(" - Enter number2: ");
                    b = sc.nextInt();
                    result = sub(a, b);
                    System.out.println(" - Subtraction of "+a+" - "+b+" = "+result+"\n");
                break;
                case 3:
                    System.out.print(" - Enter number1: ");
                    a = sc.nextInt();
                    System.out.print(" - Enter number2: ");
                    b = sc.nextInt();
                    result = div(a, b);
                    System.out.println(" - Division of "+a+" / "+b+" = "+result+"\n");
                break;
                case 4:
                    System.out.print(" - Enter number1: ");
                    a = sc.nextInt();
                    System.out.print(" - Enter number2: ");
                    b = sc.nextInt();
                    result = mul(a, b);
                    System.out.println(" - Multiplication of "+a+" + "+b+" = "+result+"\n");
                break;
                default:
                    System.out.println(" + Enter valid option..\n");
                break;
            }
            
        }
    }
}