package week2.danh_sach.bai_tap;

public interface MyList<E> {
   void add(int index,E e);
   Object remove(int index);
   int size();
   MyList<E> clone();
   boolean contains(E e);
   int indexOf(E o);
   boolean add(E e);
   void ensureCapacity();
   Object get(int i);
   void clear();
}
