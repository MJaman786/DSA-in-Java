public class OccuranceString {
    int first = -1;
    int last = -1;

    public void occuranceOfString(String str, int index, char element) {

        if (index == str.length()) {
            System.out.println("First Occurance of (" + element + ") is at index : " + first);
            System.out.println("Last Occurance of (" + element + ") is at index : " + last);
            return;
        }
        if (str.charAt(index) == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }

        occuranceOfString(str, index + 1, element);
    }

    public static void main(String[] args) {
        OccuranceString obj = new OccuranceString();
        obj.occuranceOfString("abaacdaefaah", 0, 'a');
    }
}
