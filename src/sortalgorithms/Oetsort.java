package sortalgorithms;// Der Name kommt von "Odd-Even-Transposition-Sort" (ungerade, gerade, versetzt).
// Das zu sortierende Array wird von vorne nach hinten durchlaufen.
// Für jeden Durchlauf wird eine innere Schleife initialisiert, deren Zählvariable zunächst vollständig alle
// geraden und dann alle ungeraden Indices des Arrays durchläuft.
// Für jeden Wert wird geprüft, ob er größer als sein Folgewert ist.
// Ist dies der Fall werden beide ausgetauscht.
// Es findet also ein Vergleich zwischen Werten von Elementen mit geraden und ungeraden Indices statt.

public class Oetsort {

    public static int[] intArr = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19 };

    public static int[] sort() {
        int k;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0 + (i % 2); j < intArr.length - 1; j += 2) {
                if (intArr[j] > intArr[j + 1]) {
                    k = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = k;
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