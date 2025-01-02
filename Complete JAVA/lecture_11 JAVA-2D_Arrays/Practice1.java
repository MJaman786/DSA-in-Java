
// matrix operations
import java.util.Scanner;

class MatrixOperation {
    Practice1 p = new Practice1();

    void add(int[][] arr1, int[][] arr2, int[][] result) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Addition of matrix1 and matrix2 : ");
        p.getDisplay(result);
    }
    void sub(int[][] arr1, int[][] arr2, int[][] result) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                result[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        System.out.println("Subtraction of matrix1 and matrix2 : ");
        p.getDisplay(result);
    }
    
}

public class Practice1 {
    Scanner sc = new Scanner(System.in);

    void getInput(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Element at position (" + i + "," + j + ") : ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void getDisplay(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Practice1 obj = new Practice1();

        // input row and columns
        System.out.print("Enter number of rows : ");
        int rows = obj.sc.nextInt();
        System.out.print("Enter number of columns : ");
        int columns = obj.sc.nextInt();

        // matrix1
        int[][] arr1 = new int[rows][columns];

        // matrix2
        int[][] arr2 = new int[rows][columns];

        // result
        int[][] result = new int[rows][columns];

        System.out.println(" - Enter elements of Matrix 1");
        obj.getInput(arr1);
        obj.getDisplay(arr1);

        System.out.println(" - Enter elements of Matrix 2");
        obj.getInput(arr2);
        obj.getDisplay(arr2);

        // Add operation
        MatrixOperation mo = new MatrixOperation();
        mo.add(arr1, arr2, result);
        mo.sub(arr1, arr2, result);

    }
}

/*
output
Enter number of rows : 2
Enter number of columns : 2
 - Enter elements of Matrix 1
Element at position (0,0) : 1
Element at position (0,1) : 1
Element at position (1,0) : 2
Element at position (1,1) : 2
1 1 
2 2
 - Enter elements of Matrix 2
Element at position (0,0) : 2
Element at position (0,1) : 2
Element at position (1,0) : 1
Element at position (1,1) : 1
2 2 
1 1
Addition of matrix1 and matrix2 :
3 3
3 3
*/

/*
 * ---- IMP -----
 * 1. arr.length
 * Definition: This property gives the total number of rows in a 2D array.
 * For a 1D array, it provides the total number of elements in the array.
 * 
 * Usage in 2D Arrays: When working with a 2D array (e.g., int[][] arr),
 * arr.length tells you how many rows the matrix has.
 * 
 * Example:
 * 
 * java
 * Copy code
 * int[][] arr = {
 * {1, 2, 3}, // Row 0
 * {4, 5, 6}, // Row 1
 * {7, 8, 9} // Row 2
 * };
 * 
 * System.out.println("Number of rows: " + arr.length); // Output: 3
 * Key Point:
 * In the above example, arr has 3 rows. Each row itself is an array.
 * 
 * 2. arr[i].length
 * Definition: This property gives the total number of columns (elements) in a
 * specific row of the 2D array.
 * It is used when you want to determine how many elements are present in a
 * particular row.
 * 
 * Usage in 2D Arrays: Since each row in a 2D array is itself a separate 1D
 * array, arr[i].
 * length tells you the number of elements (columns) in row i.
 * 
 * Example:
 * 
 * java
 * Copy code
 * int[][] arr = {
 * {1, 2, 3}, // Row 0: 3 columns
 * {4, 5}, // Row 1: 2 columns
 * {6, 7, 8, 9} // Row 2: 4 columns
 * };
 * 
 * System.out.println("Columns in row 0: " + arr[0].length); // Output: 3
 * System.out.println("Columns in row 1: " + arr[1].length); // Output: 2
 * System.out.println("Columns in row 2: " + arr[2].length); // Output: 4
 */