public class SchlangemitRing<T> implements Schlange<T> {
    private final Ringpuffer<T> ring;

    public SchlangemitRing(int capacity) {
        this.ring = new Ringpuffer<>(capacity);
    }

    @Override
    public int size() {
        return ring.size();
    }

    @Override
    public boolean isEmpty() {
        return ring.size() == 0;
    }

    @Override
    public T first() {
        return ring.get(ring.first);
    }

    @Override
    public void insert(T e) {
        ring.addLast(e);
    }

    @Override
    public T remove() {
        return ring.removeFirst();
    }
}
