package week2.Danh_Sach.bai_tap;

public interface MyList<E> {
   void add(int index,E e);
   Object remove(int index);
   int size();
   Object[] clone();
   boolean contains(E e);
   int indexOf(E o);
   boolean add(E e);
   void ensureCapacity();
   Object get(int i);
   void clear();

}
