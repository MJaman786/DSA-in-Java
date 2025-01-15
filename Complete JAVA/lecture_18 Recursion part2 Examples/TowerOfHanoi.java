public class TowerOfHanoi {
    public static void towerofHanoi(int n, String Source, String Helper, String Destination) {
        if (n == 1) {
            System.out.println("Transfer disk (" + n + ") from " + Source + " to " + Destination);
            return;
        }
        towerofHanoi(n - 1, Source, Destination, Helper);
        System.out.println("Transfer disk (" + n + ") from " + Source + " to " + Destination);
        towerofHanoi(n - 1, Helper, Source, Destination);
    }

    public static void main(String[] args) {
        int n = 3;
        TowerOfHanoi.towerofHanoi(n, "S", "H", "D");
    }
}
/*
output

Transfer disk (1) from S to D
Transfer disk (2) from S to H
Transfer disk (1) from D to H
Transfer disk (3) from S to D
Transfer disk (1) from H to S
Transfer disk (2) from H to D
Transfer disk (1) from S to D

*/ 