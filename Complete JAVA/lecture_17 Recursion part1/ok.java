public class ok {
    void prime(int num){
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("prime");
    }
     public static void main(String[] args) {
        ok obj = new ok();
        obj.prime(4);
     }
 }