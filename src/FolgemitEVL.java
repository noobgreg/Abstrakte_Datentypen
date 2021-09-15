import java.util.NoSuchElementException;

public class FolgemitEVL<T> implements Folge<T> {
    private final EVL<T> evl = new EVL<>();

    @Override
    public T get(int pos) {
        checkPosition(pos);
        return evl.get(pos);
    }

    @Override
    public void set(int pos, T e) throws NoSuchElementException {
        checkPosition(pos);
        evl.set(pos, e);
    }

    @Override
    public T remove(int pos) throws NoSuchElementException {
        checkPosition(pos);
        return evl.remove(pos);
    }

    @Override
    public void insert(int pos, T e) throws NoSuchElementException {
        if(pos != size()) {
            checkPosition(pos);
        }
        evl.add(pos, e);
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
        return evl.size();
    }

    @Override
    public boolean isEmpty() {
        return evl.size() == 0;
    }
}
