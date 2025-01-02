
/*
1. Declearation of 2D arrays
    dataType[][] arrayName = new int[numberOfRows][numberOfColumns];

Key Points:
- A 2D array can store data in a grid-like structure.
- It's declared with two dimensions: dataType[][] arrayName.
- Values are accessed or modified using arrayName[row][column].

*/
import java.util.Scanner;

class twoDarray {
    
    Scanner sc = new Scanner(System.in);

    void getInput(int[][] array, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter Element for position(" + i + ", " + j + ") : ");
                array[i][j] = sc.nextInt();
            }
        }
    }

    void displayInput(int[][] array, int rows, int columns) {
        // Print the 2D array
        System.out.println("\nThe 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        twoDarray obj = new twoDarray();

        System.out.print("Enter number of rows : ");
        int rows = obj.sc.nextInt();

        System.out.print("Enter number of columns : ");
        int columns = obj.sc.nextInt();

        System.out.println();

        int[][] array = new int[rows][columns];

        obj.getInput(array, rows, columns);
        obj.displayInput(array, rows, columns);

    }
}

/*
output

Enter number of rows : 3
Enter number of columns : 3

Enter Element for position(0, 0) : 1
Enter Element for position(0, 1) : 2
Enter Element for position(0, 2) : 3
Enter Element for position(1, 0) : 4
Enter Element for position(1, 1) : 5
Enter Element for position(1, 2) : 6
Enter Element for position(2, 0) : 7
Enter Element for position(2, 1) : 8
Enter Element for position(2, 2) : 9

The 2D array is:
1 2 3
4 5 6
7 8 9
*/ 