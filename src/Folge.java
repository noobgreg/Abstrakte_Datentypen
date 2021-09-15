import java.util.NoSuchElementException;

public interface Folge<T> extends Puffer<T> {

    // Methode, die das Element an der übergebenen pos zurückgibt
    T get(int pos);

    // Methode, die ein Element an der übergebenen pos einfügt
    void set(int pos, T e) throws NoSuchElementException;

    // Methode, die das Element an der übergebenen pos entfernt
    T remove(int pos) throws NoSuchElementException;

    // Methode, die das übergebene Element an der übergebenen pos einfügt
    void insert(int pos, T e) throws NoSuchElementException;

    // nicht definierte Methode für folge
    @Override
    void insert(T e) throws UnsupportedOperationException;

    // nicht definierte Methode für folge
    @Override
    T remove() throws UnsupportedOperationException;

    default void checkPosition(int pos) {
        if(!(0 <= pos && pos < size())) throw new NoSuchElementException();
    }

}
