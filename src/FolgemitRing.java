import java.util.NoSuchElementException;

public class FolgemitRing<T> implements Folge<T> {
    private final Ringpuffer<T> ring;

    public FolgemitRing(int capacity) {
        this.ring = new Ringpuffer<>(capacity);
    }


    @Override
    public T get(int pos) {
        return ring.get(pos);
    }

    @Override
    public void set(int pos, T e) throws NoSuchElementException {
        ring.set(pos, e);
    }

    @Override
    public T remove(int pos) throws NoSuchElementException {
        return null;
    }

    @Override
    public void insert(int pos, T e) throws NoSuchElementException {

    }

    @Override
    public void insert(T e) throws UnsupportedOperationException {

    }

    @Override
    public T remove() throws UnsupportedOperationException {
        return null;
    }

    @Override
    public int size() {
        return ring.size();
    }

    @Override
    public boolean isEmpty() {
        return ring.size() == 0;
    }
}
