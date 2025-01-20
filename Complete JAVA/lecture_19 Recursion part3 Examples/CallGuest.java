public class CallGuest {
    public static int call(int num){
        
        if (num<=1) {
            return 1;
        }

        // single
        int ways1 = call(num-1);

        // pairs
        int ways2 = (num-1) * call(num-2);

        return ways1 + ways2;
    }
    public static void main(String[] args) {
        System.out.println(call(4)); //10
        System.out.println(call(3)); //4
    }
}
