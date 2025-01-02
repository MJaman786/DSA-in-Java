// find mininmum and maximum element in array
import java.util.Scanner;
public class Practice3 {
    Scanner sc = new Scanner(System.in);

    void getInput(int[] array){
        // System.out.print("Enter Elements : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element "+(i+1)+" : ");
            array[i]=sc.nextInt();
        }
    }

    void checkElement(int[] array){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // System.out.println("max : "+max+" min : "+min);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("max : "+max+" min : "+min);
    }
    public static void main(String[] args) {
        Practice3 obj = new Practice3();
        int[] array = new int[5];
        
        obj.getInput(array);
        obj.checkElement(array);
    }
}

/*
output

Enter element 1 : 12
Enter element 2 : 21
Enter element 3 : 13
Enter element 4 : 21
Enter element 5 : 41
max : 41 min : 12
*/ 