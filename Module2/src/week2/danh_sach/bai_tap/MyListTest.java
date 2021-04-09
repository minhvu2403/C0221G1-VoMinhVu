package week2.danh_sach.bai_tap;

import java.util.Arrays;

public class MyListTest<E> implements MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyListTest() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyListTest(int capacity) {
        element = new Object[capacity];
    }


    @Override
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index:" + index + ",Size" + index);
        } else if (index == size) {
            ensureCapacity();
            element[index] = e;
            size++;
        } else {
            for (int i = size - 1; i >= index; i--) {
                element[i + 1] = element[i];
            }
            this.size++;
            element[index] = e;
        }
    }

    @Override
    public Object remove(int index) {
        Object e;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ",Size" + index);
        } else {
            e = element[index];
        }
        for (int i = index + 1; i < size; i++) {
            element[i - 1] = element[i];
        }
        this.size--;

        return e;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object[] clone() {
        Object[] clone = new Object[size];
        for (int i = 0; i < this.size; i++) {
            clone[i] = element[i];
        }
        return clone;
    }

    @Override
    public boolean contains(E e) {
        for (int i = 0; i < this.size; i++) {
            if (element[i] == e) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(E o) {
        for (int i = 0; i < this.size; i++) {
            if (o == element[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean add(E e) {
        ensureCapacity();
        this.size++;
        element[size - 1] = e;
        return true;
    }

    @Override
    public void ensureCapacity() {
        if (size >= DEFAULT_CAPACITY) {
            int newSize = element.length * 2;
            element = Arrays.copyOf(element, newSize);
        }
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index:" + index + ",Size" + index);
        }
        return element[index];
    }

    @Override
    public void clear() {
        element = new Object[0];
        this.size = 0;
    }

    public static void main(String[] args) {
        MyListTest<Integer> myList = new MyListTest<>();
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 4);
        myList.add(4, 16);
        myList.add(20);
        for (int i = 0; i < myList.size; i++) {
            System.out.println("MylistTest[" + i + "]=" + myList.get(i));
        }

        System.out.println("Remove=" + myList.remove(2));
        myList.add(2, 8);
        for (int i = 0; i < myList.size; i++) {
            System.out.println("MylistTest[" + i + "]=" + myList.get(i));
        }
        System.out.println("size:" + myList.size());
        System.out.println("index Of 8 :" + myList.indexOf(8));
        myList.clear();
        System.out.println("size:" + myList.size());
        System.out.println("index Of 8 :" + myList.indexOf(1));

    }
}