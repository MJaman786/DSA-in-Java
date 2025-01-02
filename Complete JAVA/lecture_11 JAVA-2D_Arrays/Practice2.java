import java.util.Scanner;
public class Practice2 {
    Scanner sc = new Scanner(System.in);
    void getInput(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element at position ("+ i +") : ");
            arr[i] = sc.nextInt();
        }
    }
    void uniqueElement(int[] arr){
        getInput(arr);
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique = unique ^ arr[i];
        }
        System.out.println("Unique Element : "+unique);
    }
    public static void main(String[] args) {
        Practice2 pobj = new Practice2();
        int[] arr = new int[5];
        pobj.uniqueElement(arr);
    }
}
/*
output

Element at position (0) : 1
Element at position (1) : 3
Element at position (2) : 1
Element at position (3) : 2
Element at position (4) : 2
Unique Element : 3

*/ 