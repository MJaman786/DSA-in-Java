class DecimalToBinary {

    public int DecBin(int num) {
        int remain = 0;
        int answer = 0;
        int place = 1;
        while (num != 0) {
            remain = num % 2;
            answer = answer + remain * place;
            place = place * 10;
            num = num / 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        DecimalToBinary obj = new DecimalToBinary();
        System.out.println("|  Decimal\t|  Binary\t|");
        System.out.println("|  10\t\t|    " + obj.DecBin(10) + "\t|");
        System.out.println("|  11\t\t|    " + obj.DecBin(11) + "\t|");
        System.out.println("|  12\t\t|    " + obj.DecBin(12) + "\t|");
        System.out.println("|  16\t\t|    " + obj.DecBin(16) + "\t|");
        System.out.println("|  13\t\t|    " + obj.DecBin(13) + "\t|");
        System.out.println("|  3\t\t|    " + obj.DecBin(3) + "\t\t|");
        System.out.println("|  10\t\t|    " + obj.DecBin(10) + "\t|");
        System.out.println("|  14\t\t|    " + obj.DecBin(14) + "\t|");
        System.out.println("|  0\t\t|    " + obj.DecBin(0) + "\t\t|");
    }
}

/*
output

|  Decimal      |  Binary       |
|  10           |    1010       |
|  11           |    1011       |
|  12           |    1100       |
|  16           |    10000      |
|  13           |    1101       |
|  3            |    11         |
|  10           |    1010       |
|  14           |    1110       |
|  0            |    0          |
*/ 