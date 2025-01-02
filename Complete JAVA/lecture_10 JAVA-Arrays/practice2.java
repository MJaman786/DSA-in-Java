// check array is sorted or not (Ascending or Decending)

public class practice2 {

    void checkOrder(int[] arr) {
        boolean isAscending = true;
        boolean isDescending = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                isDescending = false;
            } else if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("Array is in Ascending order");
        } else if (isDescending) {
            System.out.println("Array is in Descending order");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 5, 4, 3, 2, 1 };
        int[] arr3 = { 3, 5, 1, 0, 7 };

        practice2 obj = new practice2();

        obj.checkOrder(arr1);
        obj.checkOrder(arr2);
        obj.checkOrder(arr3);

    }
}
