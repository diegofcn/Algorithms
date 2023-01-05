package sortalgorithms;// Ein Array (oder ein Teilbereich eines Arrays) wird durch Übergabe des unteren Start- und oberen Schlussindex
// in zwei Teilfelder aufgeteilt und der Wert des die Mitte markierenden Elementes gespeichert.
// Das erste Teilfeld wird von unten nach oben, das zweite von oben nach unten durchlaufen und es wird geprüft,
// ob der Wert des jeweiligen Elementes kleiner bzw. größer als derjenige des mittleren Elementes ist.
// Ist dies nicht der Fall, werden die Elemente im Feld getauscht.
// Der Index des zweiten Teilfeldes wird dann als oberer Index an die rekursive Wiederholung des Ablaufs übergeben.

public class Quicksort {

    public static int[] intArr = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19 };

    public static int[] sort(int l, int r) {
        int q;
        if (l < r) {
            q = partition(l, r);
            sort(l, q);
            sort(q + 1, r);
        }
        return intArr;
    }

    private static int partition(int l, int r) {
        int i, j, x = intArr[(l + r) / 2];
        i = l - 1;
        j = r + 1;

        do {
            i++;
        } while (intArr[i] < x);

        do {
            j--;
        } while (intArr[j] > x);

        if (i < j) {
            int k = intArr[i];
            intArr[i] = intArr[j];
            intArr[j] = k;
        } else {
            return j;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = sort(0, intArr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ": " + arr[i]);
        }
    }
}