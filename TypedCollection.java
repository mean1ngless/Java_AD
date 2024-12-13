import java.util.*;

/**
 * A generic collection implementation based on a singly linked list.
 * This class implements the {@link Set} interface and ensures unique elements.
 *
 * @param <T> the type of elements in this collection
 */
public class TypedCollection<T> implements Set<T> {

    /** The head node of the linked list representing the collection. */
    private Node<T> head;

    /** The size of the collection. */
    private int size;

    /**
     * Default constructor that creates an empty collection.
     */
    public TypedCollection() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Constructor that initializes the collection with a single element.
     *
     * @param element the initial element to add to the collection
     */
    public TypedCollection(T element) {
        this();
        add(element);
    }

    /**
     * Constructor that initializes the collection with elements from another collection.
     *
     * @param collection the collection whose elements are to be added
     */
    public TypedCollection(Collection<? extends T> collection) {
        this();
        addAll(collection);
    }

    @Override
    public boolean add(T element) {
        if (contains(element)) {
            return false;
        }
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object element) {
        if (head == null) {
            return false;
        }
        if (Objects.equals(head.data, element)) {
            head = head.next;
            size--;
            return true;
        }
        Node<T> current = head;
        while (current.next != null) {
            if (Objects.equals(current.next.data, element)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean contains(Object element) {
        Node<T> current = head;
        while (current != null) {
            if (Objects.equals(current.data, element)) {
                return true;
            }
            current = current.next;
        }
        return false;
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
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int index = 0;
        Node<T> current = head;
        while (current != null) {
            array[index++] = current.data;
            current = current.next;
        }
        return array;
    }

    @Override
    public <E> E[] toArray(E[] array) {
        if (array.length < size) {
            array = (E[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), size);
        }
        int index = 0;
        Node<T> current = head;
        while (current != null) {
            array[index++] = (E) current.data;
            current = current.next;
        }
        if (array.length > size) {
            array[size] = null;
        }
        return array;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        for (Object element : collection) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        boolean modified = false;
        for (T element : collection) {
            if (add(element)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        boolean modified = false;
        Node<T> current = head;
        Node<T> prev = null;
        while (current != null) {
            if (!collection.contains(current.data)) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                modified = true;
            } else {
                prev = current;
            }
            current = current.next;
        }
        return modified;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        boolean modified = false;
        for (Object element : collection) {
            if (remove(element)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * A node representing an element in the linked list.
     *
     * @param <T> the type of the element
     */
    private static class Node<T> {
        private final T data;
        private Node<T> next;

        /**
         * Constructs a node with the given data.
         *
         * @param data the data stored in the node
         */
        private Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
