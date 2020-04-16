package javaBasic.EXERCISES_4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<E> implements IList<E> {
    private E[] array ;

    public MyArrayList() {
     // default
//        array = ;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public boolean containsAll(IList<E> list) {
        return false;
    }

    @Override
    public E[] toArray() {
        return Arrays.copyOf(array, size());
    }

    @Override
    public void add(E element) {
        E[] newArray = Arrays.copyOf(array, size() + 1);
        newArray[this.array.length] = element;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public boolean remove(E element) {
        return false;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public void addAll(IList<E> element) {

    }

    @Override
    public void addAll(int index, IList<E> list) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }
}
