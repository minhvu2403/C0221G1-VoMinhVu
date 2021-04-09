package week2.danh_sach.bai_tap;

public interface LinkedList<E> {
    void add(int index,E e);
    void addFirst(E e);
    void  addLast(E e);
     Object remove(int index);
    boolean remove(Object e);
    int size();
    Object[]clone();
    boolean contains(E o);
    int indexOf(E e);
    boolean add(E e);
    void  ensureCapacity(int minCapacity);
    Object get(int i);
    Object getFirst();
    Object getLast();
    void clear();


    void display();
    Object removeLast();
}
