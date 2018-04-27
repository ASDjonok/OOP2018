import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyBrilliantList implements List<Brilliant> {
    /**
     * Init size for inside storage (default is 10)
     */
    private static final int INIT_SIZE = 10;

    private static final float INCREASE_SIZE = 0.5f;
    private Brilliant[] elements;
    private int size;

    public MyBrilliantList() {
        elements = new Brilliant[INIT_SIZE];
        size = 0;
    }

    public MyBrilliantList(Brilliant brilliant) {
//        elements = new Brilliant[INIT_SIZE];
        this();
//        elements[0] = brilliant;
        add(brilliant);
    }

    public MyBrilliantList(Collection<Brilliant> collection) {
        this();
//        elements = new Brilliant[collection.size()];
        for (Brilliant o : collection) {
            add(o);
        }
    }



    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public Iterator<Brilliant> iterator() {
        return null/*new Iterator<Brilliant>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public Brilliant next() {
                return elements[currentIndex++];
            }
        }*/;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Brilliant brilliant) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = brilliant;
        return true;
    }

    private void resize() {
        int newSize = (int)(elements.length *
                (1+INCREASE_SIZE));
        Brilliant[] newElements = new Brilliant[newSize];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Brilliant> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Brilliant> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Brilliant get(int index) {
        return null;
    }

    @Override
    public Brilliant set(int index, Brilliant element) {
        return null;
    }

    @Override
    public void add(int index, Brilliant element) {

    }

    @Override
    public Brilliant remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Brilliant> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Brilliant> listIterator(int index) {
        return null;
    }

    @Override
    public List<Brilliant> subList(int fromIndex, int toIndex) {
        return null;
    }


}
