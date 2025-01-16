public class SubSequencing {
    void subSequence(String str, int index, String newStr) {
        if (index == str.length()) {
            System.out.print("'" + newStr + "' ");
            return;
        }
        char currChar = str.charAt(index);
        subSequence(str, index + 1, newStr + currChar);
        subSequence(str, index + 1, newStr);
    }

    public static void main(String[] args) {
        String str = "abcd";
        SubSequencing obj = new SubSequencing();
        obj.subSequence(str, 0, "");
    }
}

/*
output : 'abc' 'ab' 'ac' 'a' 'bc' 'b' 'c' ''

              printSubseq("", idx=0)
                /        \
            choose      don't choose
          "a"               ""  (id=1)
         /   \            /    \
     "ab"     "a"       "b"     "" (id=2)
    /  \     /  \      /   \    /   \
 "abc" "ab" "ac" "a" "bc"  "b" "c"  "" (id=3)

*/ 