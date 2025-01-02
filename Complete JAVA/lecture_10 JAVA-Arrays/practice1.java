import java.util.Scanner;
public class practice1 {
    Scanner sc = new Scanner(System.in);

    void find(int[] arr){
        System.out.println("Enter element to search : ");
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                System.out.println("Element found at index : "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    void getInput(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
    } 

    public static void main(String[] args) {
        int[] Array = new int[5];
        practice1 pobj = new practice1();

        pobj.getInput(Array);
        pobj.find(Array);

    }
}
/*
output

Enter Element 1 : 1
Enter Element 2 : 2
Enter Element 3 : 1
Enter Element 4 : 10
Enter Element 5 : 13
Enter element to search : 
10
Element found at index : 3
*/ 