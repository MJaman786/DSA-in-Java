import java.util.ArrayList;

public class subsetOfSet {
    public static void printSubset(ArrayList<Integer> subsets) {
        for (int i = 0; i < subsets.size(); i++) {
            System.out.print(subsets.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subsets) {
        if (n == 0) {
            printSubset(subsets);
            return;
        }
        // add
        subsets.add(n);
        findSubset(n - 1, subsets);

        subsets.remove(subsets.size() - 1);
        findSubset(n - 1, subsets);
    }

    public static void main(String[] args) {
        ArrayList<Integer> subsets = new ArrayList<>();
        findSubset(3, subsets);
    }
}
/*
 * 3 2 1
 * 3 2
 * 3 1
 * 3
 * 2 1
 * 2
 * 1
 */
/*
findSubset(3, [])
  ├── findSubset(2, [3])
  │      ├── findSubset(1, [3, 2])
  │      │      ├── findSubset(0, [3, 2, 1]) → Prints: [3, 2, 1]
  │      │      └── findSubset(0, [3, 2]) → Prints: [3, 2]
  │      └── findSubset(1, [3])
  │             ├── findSubset(0, [3, 1]) → Prints: [3, 1]
  │             └── findSubset(0, [3]) → Prints: [3]
  └── findSubset(2, [])
         ├── findSubset(1, [2])
         │      ├── findSubset(0, [2, 1]) → Prints: [2, 1]
         │      └── findSubset(0, [2]) → Prints: [2]
         └── findSubset(1, [])
                ├── findSubset(0, [1]) → Prints: [1]
                └── findSubset(0, []) → Prints: []

*/ 