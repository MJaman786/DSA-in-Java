public class Arrays{

    public void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }
    public static void main(String[] args) {
        Arrays object = new Arrays();
        // int arr[size]={10, 20, 30, 40, 50}

        // 1. array decleration
        // dataType [] arrayName = new datatype[SIZE];
        int size = 5;
        int[] arr = new int[size];
        System.out.println("length of array : "+arr.length);

        // 2. Adding elements to the array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        object.print(arr);

    }
}