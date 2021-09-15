public interface Puffer <T> {

    void insert(T e); // Methode, die Elemente zum Puffer hinzufügen sollte

    T remove(); // Methode, die Elemente aus dem Puffer entfernt und als Rückgabewert zurückgibt

    int size(); // Methode die, die Anzahl der Elemente im Puffer zurückgibt

    boolean isEmpty(); // Methode, die angibt, ob der Puffer leer ist

}
