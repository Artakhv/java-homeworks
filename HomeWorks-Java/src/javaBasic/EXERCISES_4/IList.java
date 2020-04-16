package javaBasic.EXERCISES_4;

public interface IList<E> {
    int size();
    boolean isEmpty();
    boolean contains(E element);
    boolean containsAll(IList<E> list);
    E[] toArray();
    void add(E element);
    void add(int index, E element);
    boolean remove(E element);
    E remove(int index);
    void addAll(IList<E> element);
    void addAll(int index, IList<E> list);
    boolean equals(Object o);
    int hashCode();
    E get(int index);
    E set(int index, E element);

}
