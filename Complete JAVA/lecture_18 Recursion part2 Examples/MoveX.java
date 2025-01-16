public class MoveX {
    public void moveAllX(String str, int index, String cString, String xString){
        if (index==str.length()) {
            System.out.println(cString+xString);
            return;
        }
        if(str.charAt(index)=='x'){
            xString += "x";
        }else{
            cString += str.charAt(index);
        }
        moveAllX(str, index+1, cString, xString);
    }
    public static void main(String[] args) {
        MoveX obj = new MoveX();
        obj.moveAllX("axbcxxd", 0, "", "");
    }
}
