package javaBasic.EXERCISES_4;


import java.util.Arrays;

public class MyArrayList<E> implements IList<E> {
    private Object[] array;

    public MyArrayList() {
        array = new Object[0];
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return array.length == 0;
    }

    @Override
    public boolean contains(Object element) {
        for (int i = 0; i < size(); i++) {
            if (element.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(IList<E> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (contains(list.get(i))) {
                count++;
            }
        }
        return count == list.size();
    }

    @Override
    public E[] toArray() {
        //noinspection unchecked
        return (E[]) Arrays.copyOf(array, size());
    }

    @Override
    public void add(E element) {
        Object[] newArray = Arrays.copyOf(array, size() + 1);
        newArray[array.length] = element;
        array = newArray;
    }

    @Override
    public void add(int index, E element) {
        try {
            Object[] newArray = Arrays.copyOf(array, size() + 1);
            newArray[index] = element;
            newArray[index + 1] = array[index];
            array = newArray;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean remove(E element) {
        for (int i = 0; i < size(); i++) {
            if (contains(element)) {
                array[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public E remove(int index) {
        //noinspection unchecked
        E tmp = (E) array[index];
        array[index] = null;
        return tmp;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void addAll(IList<E> list) {
        for (int i = 0; i < list.size(); i++) {
            add((E) list.get(i));
        }
    }

    @SuppressWarnings({"unchecked", "ManualArrayCopy"})
    @Override
    public void addAll(int index, IList<E> list) {
        try {
            Object[] tmpArray = new Object[size() - index];
            for (int i = index; i < size(); i++) {
                tmpArray[i] = array[i];
            }
            for (int i = 0; i < size(); i++) {
                if (i >= index && i <= (index + list.size())){
                    remove(i);
                }
            }
            addAll(list);
            for (Object o : tmpArray) {
                add((E) o);
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        Object element = null;
        try {
            element = this.array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        return element;
    }

    @Override
    public E set(int index, E element) {
        array[index] = element;
        return element;
    }
}
