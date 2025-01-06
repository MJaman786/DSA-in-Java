class Bitmanipulation {
    public static void main(String[] args) {
        int a = 5; // 101
        int b = 6; // 110
        System.out.println(a & b); // 100
        System.out.println(a | b); // 111
        System.out.println(a ^ b); // 011
        System.out.println(~a); // 11111111111111111111111111111010
        System.out.println(a << 1); // 1010
        System.out.println(a >> 1); // 10
        System.out.println(a >>> 1); // 10

    }
}