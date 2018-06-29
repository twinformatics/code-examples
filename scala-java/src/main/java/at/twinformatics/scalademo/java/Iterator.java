package at.twinformatics.scalademo.java;

/**
 * Defining a simple interface in Java, including use of default method.
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
    default void remove() {
        throw new UnsupportedOperationException();
    }
}
