class app{
    void solidRectangle(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void hollowRectangle(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i==1||i==5||j==1||j==5) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void halfPyramid(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void inverted_halfPyramid(){
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void inverted_rotated_halfPyramid(){
        int n=10;
        for (int i = 1; i <= n; i++) {
            
            // inner loop -> spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            } 

            // inner loop -> stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    

    void halfPyramid_Numbers(){
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    void inverted_halfPyramid_Numbers(){
        int num=6;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    void Floyds_Triangle(){
        int num=4;
        int count = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+"  ");
                count++; // count = count + 1
            }
            System.out.println();
        }
    }

    void pyramid(){
        int num = 5;
        for (int i = 1; i <= num; i++) {
            // # leftside of triangle
            // spaces
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // # rightside of triangel
            for (int j = 2; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void triangle10(){
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2==0) {
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        app obj = new app();

        obj.solidRectangle();

        obj.hollowRectangle();

        obj.halfPyramid();

        obj.inverted_halfPyramid();

        obj.inverted_rotated_halfPyramid();

        obj.halfPyramid_Numbers();

        obj.inverted_halfPyramid_Numbers();

        obj.Floyds_Triangle();

        obj.pyramid();

        obj.triangle10();
        
    }
}