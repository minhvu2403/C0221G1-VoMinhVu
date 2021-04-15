package week2.Java_Collection_Framework.postorder_binary_search_tree;

public interface Tree<E> {
    public  boolean insert(E e);
    public  void inorder();
    public int getSize();
    public void postorder();
    public  void preorder();
}
