public interface Stapel<T> extends Puffer<T>{

    /**
     * funktioniert nach dem LIFO-Prinzip
     */

    // Methode, die das letzte Element des Stapels zurückgibt
    public T top();

    // Methode, die e am Ende des Stapels einfügt
    @Override
    public void insert(T e);

    // Methode, die das letzte Element des Stapels entfernt
    @Override
    public T remove();

}
