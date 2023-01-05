package sortalgorithms;// Das zu sortierende Array wird von hinten nach vorne durchlaufen.
// Eine zweite Schleife läuft innerhalb der ersten vom zweiten Index des Arrays bis zur Zählvariablen der äußeren Schleife.
// Ähnlich wie bei sortalgorithms.Simplesort wird also ein Rest-Teilbereich des Arrays von vorne her durchlaufen.
// Eine Hilfsvariable speichert den Index, falls der Wert des indizierten Elementes größer ist als der beim vorhergehenden Durchlauf indizierte.
// Der Wert des durch die äußere Schleife indizierten Elementes wird dann mit dem des neu ermittelten getauscht.

public class Selectsort {

    public static int[] intArr = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19 };

    public static int[] sort() {
        int q, k;
        for (int i = intArr.length - 1; i >= 1; i--) {
            q = 0;
            for (int j = 1; j <= i; j++) {
                if (intArr[j] > intArr[q]) {
                    q = j;
                }
            }
            k = intArr[q];
            intArr[q] = intArr[i];
            intArr[i] = k;
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