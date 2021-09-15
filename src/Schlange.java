public interface Schlange<T> extends Puffer<T> {

    /**
     * funktioniert nach dem FIFO-Prinzip
     */

    // Methode, die nur das erste Element der Schlange liefert
    public T first();

    // Methode, die e am Ende der Schlange einfügt
    @Override
    public void insert(T e);

    // Methode, die das erste Element der Schlange entfernt
    @Override
    public T remove();

}
