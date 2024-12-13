import java.util.*;

/**
 * Represents a node of a singly linked list.
 *
 * @param <T> the type of the value stored in the node
 */
class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}