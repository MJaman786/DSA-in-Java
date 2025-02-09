public class MergeSort{
    public void conqureArray(int[] arr, int sI, int mid, int eI){
        int[] merged = new int[eI - sI + 1];
        int idx1 = sI;
        int idx2 = mid+1;
        int x = 0;

        while (idx1<=mid && idx2<=eI) {
            if (arr[idx1]<=arr[idx2]) {
                merged[x++] = arr[idx1++];
            }
            else{
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1<=mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2<=eI) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = sI; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
    public void devideArray(int[] arr, int sI, int eI){
        if (sI>=eI) {
            return;
        }
        int mid = sI + (eI - sI) / 2;
        devideArray(arr, sI, mid);
        devideArray(arr, mid+1, eI);
        
        conqureArray(arr, sI, mid, eI);
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int size = arr.length;

        MergeSort obj = new MergeSort();
        obj.devideArray(arr, 0, size - 1);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}