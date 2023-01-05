package sortalgorithms;// Das zu sortierende Array wird von hinten nach vorne durchlaufen.
// Bei jedem Durchlauf wird eine weitere Schleife initialisiert, die die Arrayindices bis zur Höhe der
// um eins decrementierten Zählvariablen der ersten Schleife durchläuft.
// Das heißt, dass der noch nicht durchlaufene Teil des Arrays vom Beginn bis zum Index der Zählvariablen geprüft wird.
// Ist der Wert des durch den Index der äußeren Schleife repräsentierten Elementes größer oder gleich
// dem der inneren 'kleinen Rest-Schleife', werden beide Elemente getauscht.

public class Simplesort {

    public static int[] intArr = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19 };

    public static int[] sort() {
        int k;
        for (int i = intArr.length-1; i > 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (intArr[j] >= intArr[i]) {
                    k = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = k;
                }
            }
        }
        return intArr;
    }

    public static void main(String[] args) {
        int[] arr = sort();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ": " + arr[i]);
        }
    }
}