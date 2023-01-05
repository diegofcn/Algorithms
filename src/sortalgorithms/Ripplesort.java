package sortalgorithms;// Ein Array wird von vorne nach hinten durchlaufen.
// Ist ein Wert größer als sein Folgewert, werden beide miteinander vertauscht.
// Dies wird so lange wiederholt bis eine aufsteigende Reihenfolge eingetreten ist.

public class Ripplesort {

    public static int[] intArr = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19 };

    public static int[] sort() {
        boolean switched;
        int k;
        do {
            switched = false;
            for (int i = 0; i < intArr.length-1; i++) {
                if (intArr[i] > intArr[i + 1]) {
                    k = intArr[i];
                    intArr[i] = intArr[i + 1];
                    intArr[i + 1] = k;
                    switched = true;
                }
            }
        } while (switched == true);
        return intArr;
    }

    public static void main(String[] args) {
        int[] arr = sort();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ": " + arr[i]);
        }
    }
}