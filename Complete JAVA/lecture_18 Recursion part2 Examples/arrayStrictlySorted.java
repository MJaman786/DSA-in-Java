public class arrayStrictlySorted {
    boolean check = true;

    void checkArray(int[] arr, int index) {
        if (index == arr.length - 1) {
            System.out.println("Array is Sorted");
            return;
        }
        if (arr[index] >= arr[index + 1]) {
            System.out.println("Array is not Sorted");
            return;
        }
        checkArray(arr, index + 1);
    }

    public static void main(String[] args) {
        arrayStrictlySorted obj = new arrayStrictlySorted();
        int[] arr1 = { 10, 30, 30, 40, 50 };
        int[] arr2 = { 10, 20, 30, 40, 50 };

        obj.checkArray(arr1, 0);
        obj.checkArray(arr2, 0);

    }
}

/*
 * output
 * Array is not Sorted
 * Array is Sorted
 */