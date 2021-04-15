package week2.Java_Collection_Framework.postorder_binary_search_tree;

public class TestBST {
    public static void main(String[] args) {
        BST<Integer> tree =new BST<>();
        tree.insert(60);
        tree.insert(55);
        tree.insert(100);
        tree.insert(45);
        tree.insert(57);
        tree.insert(67);
        tree.insert(107);
        tree.insert(59);
        tree.insert(101);
        System.out.println("Inorder(sorted)");
        tree.postorder();
    }

}
