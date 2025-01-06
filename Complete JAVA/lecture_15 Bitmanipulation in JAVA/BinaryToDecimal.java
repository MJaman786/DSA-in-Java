public class BinaryToDecimal {
    public int binDec(int num) {
        int answer = 0;
        int remainder = 0;
        int place = 1;
        while (num != 0) {
            remainder = num % 10;
            if (remainder == 1) {
                answer = answer + remainder * place;
            }
            place = place * 2;
            num = num / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        BinaryToDecimal obj = new BinaryToDecimal();
        System.out.println("|  Binary\t|  Decimal\t|");
        System.out.println("|  1010\t\t|    " + obj.binDec(1010) + "\t\t|");
        System.out.println("|  1011\t\t|    " + obj.binDec(1011) + "\t\t|");
        System.out.println("|  1110\t\t|    " + obj.binDec(1110) + "\t\t|");
        System.out.println("|  110\t\t|    " + obj.binDec(110) + "\t\t|");
        System.out.println("|  100\t\t|    " + obj.binDec(100) + "\t\t|");
        System.out.println("|  1010\t\t|    " + obj.binDec(1010) + "\t\t|");
        System.out.println("|  10\t\t|    " + obj.binDec(10) + "\t\t|");
        System.out.println("|  1\t\t|    " + obj.binDec(1) + "\t\t|");
        System.out.println("|  0\t\t|    " + obj.binDec(0) + "\t\t|");

    }
}
/*
 * output
|  Binary       |  Decimal      |
|  1010         |    10         |
|  1011         |    11         |
|  1110         |    14         |
|  110          |    6          |
|  100          |    4          |
|  1010         |    10         |
|  10           |    2          |
|  1            |    1          |
|  0            |    0          | 
*/