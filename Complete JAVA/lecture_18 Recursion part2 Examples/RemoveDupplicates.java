// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class RemoveDupplicates {
    boolean[] map = new boolean[25];
   void removeDuplicates(String str, int index, String newString){
       if(index==str.length()-1){
           System.out.println("Before Removed dupplicates : "+str);
           System.out.println("After Removed dupplicates : "+ newString);
           return;
       }
       char currChar = str.charAt(index);
       if(map[currChar-'a']==true){
           removeDuplicates(str, index+1, newString);
       }else{
           newString = newString + currChar;
           map[currChar-'a']=true;
           removeDuplicates(str, index+1, newString);
       }
   }
    public static void main(String[] args) {
        RemoveDupplicates obj = new RemoveDupplicates();
        String str = "abbaacdz";
        obj.removeDuplicates(str, 0, "");
    }
}
/*
Before Removed dupplicates : abbaacdz
After Removed dupplicates : abcd

*/ 