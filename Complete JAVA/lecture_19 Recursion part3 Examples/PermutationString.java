class PermutationString {
    void printPermutation(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, permutation + currChar);
        }
    }

    public static void main(String[] args) {
        PermutationString obj = new PermutationString();
        obj.printPermutation("abc", "");
    }
}

/*
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 */
/*
printPermutation("abc", "")                      <-- Initial call
   |
   |-- i = 0: currChar = 'a'
   |   newStr = "bc"
   |   --> printPermutation("bc", "a")
   |       |
   |       |-- i = 0: currChar = 'b'
   |       |   newStr = "c"
   |       |   --> printPermutation("c", "ab")
   |       |       |
   |       |       |-- i = 0: currChar = 'c'
   |       |       |   newStr = ""
   |       |       |   --> printPermutation("", "abc")    <-- Base case: prints "abc"
   |       |
   |       |-- i = 1: currChar = 'c'
   |           newStr = "b"
   |           --> printPermutation("b", "ac")
   |               |
   |               |-- i = 0: currChar = 'b'
   |                   newStr = ""
   |                   --> printPermutation("", "acb")    <-- Base case: prints "acb"
   |
   |-- i = 1: currChar = 'b'
   |   newStr = "ac"
   |   --> printPermutation("ac", "b")
   |       |
   |       |-- i = 0: currChar = 'a'
   |       |   newStr = "c"
   |       |   --> printPermutation("c", "ba")
   |       |       |
   |       |       |-- i = 0: currChar = 'c'
   |       |           newStr = ""
   |       |           --> printPermutation("", "bac")    <-- Base case: prints "bac"
   |       |
   |       |-- i = 1: currChar = 'c'
   |           newStr = "a"
   |           --> printPermutation("a", "bc")
   |               |
   |               |-- i = 0: currChar = 'a'
   |                   newStr = ""
   |                   --> printPermutation("", "bca")    <-- Base case: prints "bca"
   |
   |-- i = 2: currChar = 'c'
       newStr = "ab"
       --> printPermutation("ab", "c")
           |
           |-- i = 0: currChar = 'a'
           |   newStr = "b"
           |   --> printPermutation("b", "ca")
           |       |
           |       |-- i = 0: currChar = 'b'
           |           newStr = ""
           |           --> printPermutation("", "cab")    <-- Base case: prints "cab"
           |
           |-- i = 1: currChar = 'b'
               newStr = "a"
               --> printPermutation("a", "cb")
                   |
                   |-- i = 0: currChar = 'a'
                       newStr = ""
                       --> printPermutation("", "cba")    <-- Base case: prints "cba"

*/ 
