class butterfly{
    // void pattern(){
    //     int num = 5;
    //     for (int i = 1; i <= num; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    //     for (int i = 1; i <= num; i++) {
    //         for (int j = i; j <= num; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    //     for (int i = 1; i <= num; i++) {
    //         // spaces
    //         for (int j = i; j <= num; j++) {
    //             System.out.print(" ");
    //         }
    //         // stars
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }
    void pattern(){
        int num = 4;
        for (int i = 1; i <= num; i++) {
            // spaces
            for (int j = 1; j <= num-i; j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // void pattern(){
    //     int num = 5;
    //     // # Upper Part
    //     for (int i = 1; i <= num; i++) {
    //         // stars
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("* ");
    //         }
    //         // spaces
    //         for (int j = 1; j <= 2*(num-i); j++) {
    //             System.out.print("  ");
    //         }
    //         // stars
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }

    //     // # Lower half
    //     for (int i = num; i >= 1; i--) {
    //         // stars
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("* ");
    //         }
    //         // spaces
    //         for (int j = 1; j <= 2*(num-i); j++) {
    //             System.out.print("  ");
    //         }
    //         // stars
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args) {
        butterfly obj = new butterfly();

        obj.pattern();
    }
}
/*
*                 * 
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
*/ 