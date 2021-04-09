package week2.dsa_stack_queue.bai_tap.su_dung_queue;

public class Node {
    private int data;
    private  Node link;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
