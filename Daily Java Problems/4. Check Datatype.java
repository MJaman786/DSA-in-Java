// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int a = 10;
        float b = 10;
        System.out.println("Value of a: "+a+"\nValue of b: "+b);
        if(a==b){
            System.out.println(" - Value of the variables are equal.");
            if(((Object)a).getClass() == ((Object)b).getClass()){
                System.out.println(" - datatype of the variables are also same.");
            }
            else{
                System.out.println(" - Value of the variables are equal but datatype is different.");
            }
        }else{
            System.out.println(" - Value of the variables are noy equal.");
        }
    }
}

Value of a: 10
Value of b: 10.0
 - Value of the variables are equal.
 - Value of the variables are equal but datatype is different.

=== Code Execution Successful ===