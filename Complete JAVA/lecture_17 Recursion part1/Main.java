// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    // print from 5 to 1
    void printReverse(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num + " ");
        printReverse(num - 1);
    }

    // print from 5 to 1
    void printNormal(int num) {
        if (num == 6) {
            return;
        }
        System.out.print(num + " ");
        printNormal(num + 1);
    }

    // print sum of n Natural numbers
    void sumNnumbers(int i, int n, int sum){
        if (i>n) {
            System.out.println("Sum of n natural Numbers : "+ sum);
            return;
        }
        sum += i;
        sumNnumbers(i+1, n, sum); 
    }

    // print n! factorials
    void printFactorials(int num, int ans){
        if(num<=1){
            System.out.println("Factorial : "+ans);
            return;
        }
        ans *= num;
        num -= 1; 
        printFactorials(num, ans);
    }

    // fibonacci series
    void fibonacci(int start, int end, int num){
        if(num<3){
            return;
        }
        int answer = start + end;
        System.out.print(answer+" ");
        fibonacci(end, answer, num-1);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        // obj.printReverse(5);
        // obj.printNormal(1);
        // obj.sumNnumbers(1, 5, 0);
        // obj.printFactorials(5, 1);

        System.out.print("0 1 ");
        obj.fibonacci(0, 1, 7);
    }
}
/*
 * output
 * 5 4 3 2 1
 * 1 2 3 4 5
 * 
 * Factorial : 120
 * 
 * Fibonacci : 0 1 1 2 3 5 8 
 * 
 */