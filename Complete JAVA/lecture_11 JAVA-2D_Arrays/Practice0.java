// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Practice0 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int columns = sc.nextInt();
        
        int[][] arr = new int[rows][columns];
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print("Enter element at position ("+i+","+j+") : ");
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        int key = 9;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==key){
                    System.out.println("Element found at position : ("+i+","+j+")");
                    return;
                }
            }
            System.out.println();
        }
    }
}

/*
output 

Enter number of rows : 3
Enter number of columns : 3
Enter element at position (0,0) : 1
Enter element at position (0,1) : 2
Enter element at position (0,2) : 3
Enter element at position (1,0) : 4
Enter element at position (1,1) : 5
Enter element at position (1,2) : 6
Enter element at position (2,0) : 7
Enter element at position (2,1) : 8
Enter element at position (2,2) : 9
1 2 3 
4 5 6 
7 8 9 


Element found at position : (2,2)

=== Code Execution Successful ===
*/ 