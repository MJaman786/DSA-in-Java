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

subSequence("abc", 0, " ")
├── Include 'a' → subSequence("abc", 1, " a")
│   ├── Include 'b' → subSequence("abc", 2, " ab")
│   │   ├── Include 'c' → subSequence("abc", 3, " abc") → print
│   │   └── Exclude 'c' → subSequence("abc", 3, " ab")  → print
│   └── Exclude 'b' → subSequence("abc", 2, " a")
│       ├── Include 'c' → subSequence("abc", 3, " ac")  → print
│       └── Exclude 'c' → subSequence("abc", 3, " a")   → print
└── Exclude 'a' → subSequence("abc", 1, " ")
    ├── Include 'b' → subSequence("abc", 2, " b")
    │   ├── Include 'c' → subSequence("abc", 3, " bc")  → print
    │   └── Exclude 'c' → subSequence("abc", 3, " b")   → print
    └── Exclude 'b' → subSequence("abc", 2, " ")
        ├── Include 'c' → subSequence("abc", 3, " c")   → print
        └── Exclude 'c' → subSequence("abc", 3, " ")    → print


*/ 
