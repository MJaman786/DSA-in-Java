public class placeTiles {
    public static int placeTile(int n, int m){

        if (n==m) {
            return 2;
        }
        if (n<m) {
            return 1;
        }

        int verticalPlacements = placeTile(n-m, m);
        int horizontalPlacements = placeTile(n-1, m);
        return verticalPlacements + horizontalPlacements;
    }
    public static void main(String[] args) {
        System.out.println(placeTile(4, 2)); // 5
        System.out.println(placeTile(3, 3)); // 2
    }
}
