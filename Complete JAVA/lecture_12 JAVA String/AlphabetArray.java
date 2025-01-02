public class AlphabetArray {
    void fillCharacterArray(char[][] ch) {
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[i].length; j++) {
                if (i == 0) {
                    ch[i][j] = (char) ('a' + j);
                } else {
                    ch[i][j] = (char) ('A' + j);
                }
            }
        }

        // print array
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[i].length; j++) {
                System.out.print("'" + ch[i][j] + "', ");
            }
            System.out.println();
        }
    }

    void fillIntegerArray(char[][] in) {
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                if (i == 0) {
                    in[i][j] = (char) (97 + j);
                } else {
                    in[i][j] = (char) (65 + j);
                }
            }
        }
        // print array
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                System.out.print("'" + in[i][j] + "', ");
            }
            System.out.println();
        }
    }

    void Encrypt(char[][] character, char[][] Integer, String inputString){
        char[] charString = inputString.toCharArray();
        for (int i = 0; i < character.length; i++) {
            for (int j = 0; j < character.length; j++) { 
                
            }
        }
    }
    public static void main(String[] args) {

        AlphabetArray alpha = new AlphabetArray();

        int rows = 2;
        int columns = 26;
        char[][] characterArray = new char[rows][columns]; // 2 rows, 26 columns
        char[][] integerArray = new char[rows][columns];

        // char[][] characterArray = {
        // {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
        // 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'},
        // {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
        // 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}
        // };

        // int[][] = integerArray = {
        // {'97', '98', '99', '100', '101', '102', '103', '104', '105', '106', '107',
        // '108', '109', '110', '111', '112', '113', '114', '115', '116', '117', '118',
        // '119', '120', '121', '122'},
        // {'65', '66', '67', '68', '69', '70', '71', '72', '73', '74', '75', '76',
        // '77', '78', '79', '80', '81', '82', '83', '84', '85', '86', '87', '88', '89',
        // '90'}
        // };

        alpha.fillCharacterArray(characterArray);
        alpha.fillIntegerArray(integerArray);

    }
}
