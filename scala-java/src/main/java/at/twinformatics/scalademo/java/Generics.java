package at.twinformatics.scalademo.java;

public class Generics {

    interface Iterator<T> {
        boolean hasNext();
        T next();
    }

    Iterator<String> strings = null;
    Iterator<? extends Object> objects = strings;
    Iterator<Integer> integers = null;

    void iterate(Iterator<? extends Number> it) {}
    <T extends Number> void iterate2(Iterator<T> it) {}

    { iterate(integers); }
    { iterate2(integers); }

}
