package sortalgorithms;// Ein Array wird von vorne nach hinten durchlaufen.
// Bei jedem Durchlauf wird das Array wiederum in der entgegengesetzten Richtung, von hinten nach vorne durchlaufen.
// Ist der Wert eines niedrigeren Elementes höher als derjenige eines höheren Elementes, werden beide Elemente getauscht.
// Nach Durchlauf der äußeren Schleife sind alle Werte überprüft worden und das Array ist aufsteigend sortiert.

public class Insertsort {

    public static int[] intArr = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19 };

    public static int[] sort() {
        int k;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = intArr.length-1; j > 0; j--) {
                if (intArr[j-1] > intArr[j]) {
                    k = intArr[j];
                    intArr[j] = intArr[j - 1];
                    intArr[j - 1] = k;
                }
            }
        }
        return intArr;
    }

    public static void main(String[] args) {
        int[] arr = Insertsort.sort();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ": " + arr[i]);
        }
    }
}