import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MyBrilliantSet implements Set<Brilliant>, Serializable{
//    final long serialVersionUID = -5161207827521945616;

    private Node head;
    private Node tail;
    private int size;

    /*private*/ class Node implements Serializable{
        private Brilliant data;
        private Node next;
        private Node previous;

        public Node(Brilliant brilliant) {
            data = brilliant;
        }

        public Brilliant getData() {
            return data;
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof Node
                    && data.equals(obj);
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public Node getNext() {
            return next;
        }
    }

    public MyBrilliantSet() {
        /*head = null;
        tail = null;
        size = 0;*/
    }

    public MyBrilliantSet(Brilliant brilliant) {
        add(brilliant);
        /*head = null;
        tail = null;
        size = 0;*/
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
//        return !isEmpty() && head.getData().equals(o);
        for (Brilliant brilliant : this) {
            if (brilliant.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Brilliant> iterator() {
        return new Iterator<Brilliant>() {
            Node current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Brilliant next() {
                Node result = current;
                current = current.getNext();
                return result.data;
            }

            /*@Override
            public void remove() {

            }*/
        };
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
        // todo contains!
        if (!contains(brilliant)) {
            Node node = new Node(brilliant);
            if (size == 0) {
                head = tail = node;
            } else {
                tail.setNext(node);
                node.setPrevious(tail);
                tail = node;
            }
            size++;
            return true;
        }
        return false;
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
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

}
