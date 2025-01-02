import java.util.Scanner;
class Student{
    String name;
    int marks;

    void setInfo(String arg1, int arg2){
        this.name = arg1;
        this.marks = arg2;
    }
    
    void displayInfo(){
        System.out.println("Name : "+name+"Marks : "+marks);
    }

}
class ArrayOfObject{
    public static void main(String[] args) {
        // create scanner object
        Scanner sc = new Scanner(System.in);

        // size of array of object
        int size = 5;

        // Declaring an Array of Student Objects
    /*
        Creates an array named students that can hold references (addresses) to size number of Student objects.
        Initially, the array is created, but all its elements are null because no actual Student objects have been created yet.
    */ 
        Student[] studentArray = new Student[size];

        for (int i = 0; i < studentArray.length; i++) {
            System.out.println("Enter details for student "+(i+1)+" : ");
            
            // name input
            System.out.print("Enter the name : ");
            String name = sc.next();
            sc.close();

            // marks input
            System.out.print("Enter marks : ");
            int marks = sc.nextInt();

            // Creating a New Student Object
        /*
            - Creates a new Student object using new Student().
            - Places this new Student object into the i-th position of the students array.
        */ 
            studentArray[i] = new Student();
            studentArray[i].setInfo(name, marks);

        }
    }
}