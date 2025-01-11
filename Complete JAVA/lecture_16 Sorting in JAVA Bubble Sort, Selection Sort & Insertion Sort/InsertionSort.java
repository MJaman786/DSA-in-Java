public class InsertionSort {
    void insertionSort(int[] arr) {
        System.out.println("Before Sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        System.out.println("\nAfter Sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int[] arr = { 5, 3, 10, 2, 1 };
        obj.insertionSort(arr);
    }
}

/*
output

Before Sorting : 
5 3 10 2 1 
After Sorting :
1 2 3 5 10
*/ 
