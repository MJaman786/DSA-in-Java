gpt sppu:
hey chatgpt i will be asking you some question related to bloackchain technology anasyer in simple and easy , technical words and also see for difference between provide answer in tabular formate 

see when my prommpt shart from Q1, Q, or question then provide answer to question for 8 marks

naruto s1 : https://pixeldrain.com/u/kuqrzyjt

https://animeacademy.in/kengan-ashura-hindi-subbed-12-12-completed/

6432605079

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int num = 5;
        // upperpart
        for(int i=1; i<=num; i++){
            for(int j=1; j<=(num-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("_________________");
        // lowerpart
        for(int i=1; i<=num; i++){
            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<=num; j++){
                System.out.print("* ");
            }
            for(int j=i; j<num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}

/*
output
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
_________________
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 

=== Code Execution Successful ===
*/ 

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int num = 5;
        // upperpart
        for(int i=1; i<=num; i++){
            for(int j=1; j<=(num-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------");
        // lowerpart
        for(int i=1; i<=num; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=i; j<=num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}

/*
output
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
----------
* * * * * 
 * * * * 
  * * * 
   * * 
    * 

=== Code Execution Successful ===
*/ 

// Insertion Sort
// Online Java Compiler
// Palindrome String using recursion 
import java.util.Scanner;
class Main {
    Scanner sc = new Scanner(System.in);
    void insertionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter ("+i+")th Element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        // sorting
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        // printing
        System.out.println("\nAfter Sorting : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Main obj = new Main();
        int[] arr = new int[5];
        obj.insertionSort(arr);
    }
}
/*
Enter (0)th Element : 5
Enter (1)th Element : 4
Enter (2)th Element : 3
Enter (3)th Element : 2
Enter (4)th Element : 1
Before Sorting : 
5 4 3 2 1 
After Sorting : 
1 2 3 4 5 
=== Code Execution Successful ===
*/ 




// Online Java Compiler
// Palindrome String using recursion 

class Main {
    void reverse(String str, int index, String newString){
        char currChar = str.charAt(index);
        if(index==0){
            newString += currChar;
            System.out.println("Original String : "+str);
            System.out.println("Reversed String : "+newString);
            return;
        }
        newString += currChar;
        reverse(str, index-1, newString);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        String str = "abbaacdz";
        obj.reverse(str, str.length()-1, "");
    }
}
/*
Original String : abbaacdz
Reversed String : zdcaabba
*/ 


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    void palindrome(String str, int index, String newStr){
        char currChar = str.charAt(index);
        if(index==0){
            newStr += currChar;
            System.out.println("Original String : "+str);
            System.out.println("Reversed String : "+newStr);
            if(str.equals(newStr)){
                System.out.println("It is palindrome");
            }else{
                System.out.println("It is't palindrome");
            }
            return;
        }
        newStr += currChar;
        palindrome(str, index-1, newStr);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Main obj = new Main();
       int count = 0;
       while(count!=3){
           System.out.print("\nEnter String : ");
           String str = sc.next();
           obj.palindrome(str, str.length()-1, "");
           count++;
       }
    }
}

/*

Enter String : MADAM
Original String : MADAM
Reversed String : MADAM
It is palindrome

Enter String : 12321
Original String : 12321
Reversed String : 12321
It is palindrome

Enter String : 
AMAMX
Original String : AMAMX
Reversed String : XMAMA
It is't palindrome

=== Code Execution Successful ===
*/ 


// Remove Duplicates

import java.util.Scanner;

class Main {
    // 0-25 for 'a-z' and 26-51 for 'A-Z'
    boolean[] map = new boolean[52];

    void removeDuplicates(String str, String newString, int index) {
        if (index == str.length()) {
            System.out.println("Removed duplicates: " + newString);
            return;
        }

        char currChar = str.charAt(index);
        int mapIndex;

        if (currChar >= 'a' && currChar <= 'z') {
            mapIndex = currChar - 'a'; // Map lowercase to 0-25
        } else if (currChar >= 'A' && currChar <= 'Z') {
            mapIndex = currChar - 'A' + 26; // Map uppercase to 26-51
        } else {
            // For non-alphabetic characters, add them directly
            removeDuplicates(str, newString + currChar, index + 1);
            return;
        }

        if (map[mapIndex]==true) {
            removeDuplicates(str, newString, index + 1);
        } else {
            map[mapIndex] = true;
            removeDuplicates(str, newString + currChar, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        obj.removeDuplicates(str, "", 0);
        sc.close();
    }
}
/*
Enter your string: AMAN MUNIR MUJAWAR
Removed duplicates: AMN UIR JW

Enter your string: aman munir mujawar
Removed duplicates: amn uir jw

Enter your string: AmAn MuNiR MuJaWaR
Removed duplicates: Amn MuNiR JaW

*/ 

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    Scanner sc = new Scanner(System.in);

    public void getData(ArrayList<Integer> list) {
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        System.out.println("Elements: ");
        System.out.println(list);
    }

    public int isPrime(int num) {
        if (num <= 1) return -1; // Not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return -1; // Not prime
            }
        }
        return num; // Prime number, return the number itself
    }

    ArrayList<Integer> evenList = new ArrayList<>();
    ArrayList<Integer> oddList = new ArrayList<>();
    ArrayList<Integer> primeList = new ArrayList<>();

    public void checkNumber(ArrayList<Integer> list, ArrayList<Integer> evenList, ArrayList<Integer> oddList, ArrayList<Integer> primeList) {
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            int primeCheck = isPrime(num);
            
            if (primeCheck != -1) {
                primeList.add(primeCheck); // Store prime numbers
            } else if (num % 2 == 0) {
                evenList.add(num); // Store even numbers
            } else {
                oddList.add(num); // Store odd numbers
            }
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        ArrayList<Integer> list = new ArrayList<>();

        // Populate list
        obj.getData(list);

        // Check numbers using isPrime()
        obj.checkNumber(list, obj.evenList, obj.oddList, obj.primeList);

        // Print results
        System.out.println("Even Numbers: " + obj.evenList);
        System.out.println("Odd Numbers: " + obj.oddList);
        System.out.println("Prime Numbers: " + obj.primeList);
    }
}
