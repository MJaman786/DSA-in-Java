class demo {
    public void factorialNumber(int num) {
        int fact = 1;
        for (int i = num; i > 1; i--) {
            fact = fact * i;
            System.out.print(fact + " ");
        }
    }

    public void evenNumber(int num) {
        if (num < 0) {
            System.out.println("Number " + num + " is not even");
        } else if (num % 2 == 0) {
            System.out.println("Number " + num + " is even");
        }
    }

    public void primeNumber(int num) {
        if (num < 1) {
            System.out.print(num + " less than 2");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    System.out.print(num + " Is't prime");
                    return;
                }
            }
        }
        System.out.println(num + " is a prime number.");
    }

    public void table(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("Table of : "+i);
            for (int j = 1; j <= num; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();
        }
    }

    public void prime() {
        int[] number = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] primeNumber = new int[number.length];
        int[] notPrimeNumber = new int[number.length];
        int primeIndex = 0, notPrimeIndex = 0;

        // Check for prime and not prime
        for (int i = 0; i < number.length; i++) {
            int count = 0;
            for (int j = 1; j <= number[i]; j++) { // Count divisors
                if (number[i] % j == 0) {
                    count++;
                }
            }
            // A prime number has exactly 2 divisors: 1 and itself
            if (count == 2) {
                primeNumber[primeIndex++] = number[i];
            } else {
                notPrimeNumber[notPrimeIndex++] = number[i];
            }
        }

        // Print the results
        System.out.println("Not prime | Prime");
        for (int i = 0; i < Math.max(primeIndex, notPrimeIndex); i++) {
            String notPrimeStr = (i < notPrimeIndex) ? String.valueOf(notPrimeNumber[i]) : "";
            String primeStr = (i < primeIndex) ? String.valueOf(primeNumber[i]) : "";
            System.out.printf("%-10s | %-10s\n", notPrimeStr, primeStr);
        }
    }
    public static void main(String[] args) {
        demo obj = new demo();
        // obj.factorialNumber(5);
        // obj.evenNumber(10);
        // obj.primeNumber(21);
        // obj.table(10);
        obj.prime();
    }
}