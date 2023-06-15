package ss10_dsa.exercise.array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(E e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }

    public E get(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index : " + index + ", Size " + index);
        }
        return (E) element[index];
    }

    public double size() {
        return size;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(element[i])) {
                return i;
            }
        }
        return -1;
    }
}
