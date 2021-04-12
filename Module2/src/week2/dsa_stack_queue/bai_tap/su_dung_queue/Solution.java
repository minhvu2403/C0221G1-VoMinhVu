package week2.dsa_stack_queue.bai_tap.su_dung_queue;

public class Solution {
    static Queue queue = new Queue();

    public static void enQueue(int data) {
        if (queue.getFront()==null){
            queue.setFront(new Node(data));
            queue.setRear(queue.getFront());
            queue.getFront().setLink((queue.getRear()));
        }else{
            queue.getRear().setLink(new Node(data));
            queue.setRear(queue.getRear().getLink());
        }
        queue.getRear().setLink(queue.getFront());
    }
    public static Integer deQueue() {
        if (queue.getFront() == null) {
            return null;
        } else if (queue.getFront() == queue.getRear()) {
            Node temp = queue.getFront();
            queue.setFront(null);
            queue.setRear(null);
            return temp.getData();
        } else {
            Node temp = queue.getFront();
            queue.setFront(queue.getFront().getLink());
            queue.getRear().setLink(queue.getFront());
            return temp.getData();
        }
    }

    public static void display() {
        Node temp = queue.getFront();
        do {
            System.out.println(temp.getData());
            temp = temp.getLink();
        } while (temp != queue.getRear().getLink());

    }

    public static void main(String[] args) {
        Queue queue =new Queue();

    }
   
}
