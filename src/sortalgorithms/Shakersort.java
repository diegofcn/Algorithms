package sortalgorithms;// Ein Array wird in zwei Methoden jeweils von vorne nach hinten durchlaufen.
// Ist hierbei ein Element größer als sein Folgeelement, werden beide getauscht.
// Der Vorgang wird bei der ersten Methode mit incrementiertem unteren Index und bei der zweiten Methode
// mit decrementiertem oberen Index so lange wiederholt wie sich beide Indices unterscheiden.

public class Shakersort {

    public static int[] intArr = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19 };
    static int k;

    public static int[] sort() {

        int i = 0, l = intArr.length;
        while (i < l) {
            shaker1(i, l);
            l--;
            shaker2(i, l);
            i++;
        }
        return intArr;
    }

    private static void shaker1(int i, int l) {
        for (int j = i; j < l - 1; j++) {
            if (intArr[j] > intArr[j + 1]) {
                k = intArr[j];
                intArr[j] = intArr[j + 1];
                intArr[j + 1] = k;
            }
        }
    }

    private static void shaker2(int i, int l) {
        for (int j = l - 1; j >= i; j--) {
            if (intArr[j] > intArr[j + 1]) {
                k = intArr[j];
                intArr[j] = intArr[j + 1];
                intArr[j + 1] = k;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = sort();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ": " + arr[i]);
        }
    }
}