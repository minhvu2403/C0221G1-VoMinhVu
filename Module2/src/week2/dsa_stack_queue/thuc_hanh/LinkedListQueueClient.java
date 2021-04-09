package week2.dsa_stack_queue.thuc_hanh;

import week2.danh_sach.thuc_hanh.MyLinkedList;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue =new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        int te=queue.dequeue().key;
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
