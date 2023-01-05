package sortalgorithms;// Ein Array wird von vorne nach hinten durchlaufen.
// Hierbei wird geprüft, ob das jeweilige Element kleiner als sein Nachfolgeelement ist.
// Ist dies der Fall, wird die Schleife fortgesetzt.
// Falls nicht, so werden das aktuelle Element und sein Nachfolger getauscht, sodass das kleinere Element nun vor dem größeren liegt.
// Durch rekursiven Aufruf der Methode wird der Schleifendurchlauf erneut gestartet bis eine aufsteigende Sortierung vorliegt.

public class Bubblesort {

    public static int[] intArr = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19 };
    public static int[] sort() {
        int k;
        for (int i = 0; i < intArr.length - 1; i++) {
            if (intArr[i] < intArr[i + 1]) {
                continue;
            }
            k = intArr[i];
            intArr[i] = intArr[i + 1];
            intArr[i + 1] = k;
            sort();
        }
        return intArr;
    }

    public static void main(String[] args) {
        int[] arr = Bubblesort.sort();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ": " + arr[i]);
        }
    }
}