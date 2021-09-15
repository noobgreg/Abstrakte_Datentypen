public class SchlangemitDynArray<T> implements Schlange<T> {

    private final DynArray<T> dynArray = new DynArray<>(1);

    @Override
    public int size() {
        return dynArray.size();
    }

    @Override
    public boolean isEmpty() {
        return dynArray.size() == 0;
    }

    @Override
    public T first() {
        return dynArray.get(0);
    }

    @Override
    public void insert(T e) {
        dynArray.addLast(e);
    }

    @Override
    public T remove() {
        return dynArray.removeFirst();
    }
}
