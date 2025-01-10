// Selection Sort

class SelectionSort {
    void functionArray(int[] arr){ 
        
        System.out.print("Before Sorting : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.print("\nAfter Sorting : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5};
        
        SelectionSort obj = new SelectionSort();
        
        obj.functionArray(arr);
    }
}

/*
Before Sorting : 10 9 8 7 6 5 
After Sorting : 5 6 7 8 9 10 
=== Code Execution Successful ===
*/ 