class BubbleSort{
    // Sort elements in Ascending order
    void sortElement_A(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }  
            }
        }
        System.out.print("Ascending Order : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    // Sort elements in Descending order
    void sortElement_D(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }  
            }
        }
        System.out.print("Descending Order : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {

        int[] arr = {1, 10, 2, 8, 3, 0, 5};

        System.out.print("Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        BubbleSort obj = new BubbleSort();
        obj.sortElement_A(arr);
        System.out.println();
        obj.sortElement_D(arr);
    }
}
/*
output
Array Elements : 1 10 2 8 3 0 5 
Ascending Order : 0 1 2 3 5 8 10 
Descending Order : 10 8 5 3 2 1 0
*/ 