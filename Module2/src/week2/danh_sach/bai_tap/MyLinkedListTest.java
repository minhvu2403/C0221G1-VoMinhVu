package week2.danh_sach.bai_tap;

public class MyLinkedListTest<E> implements LinkedList<E> {
    Node head;
    private static int numNodes = 0;

    public MyLinkedListTest() {
    }


    @Override
    public void add(int index, E e) {
        if (index < 0 | index > size()) {
            throw new IndexOutOfBoundsException("Index:" + index + ",Size" + size());
        } else if (index == 0) {
            Node temp = new Node(e);
            temp.next = head;
            head = temp;
            this.numNodes++;
        } else {
            Node temp = head;
            Node holder;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(e);
            temp.next.next = holder;
            numNodes++;

        }
    }

    @Override
    public void addFirst(E e) {
        Node temp = new Node(e);
        temp.next = head;
        head = temp;
        numNodes++;
    }

    @Override
    public void addLast(E e) {
        Node temp = new Node(e);
        Node newNode = new Node(e);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        numNodes++;
    }

    @Override
    public Object remove(int index) {
        Node temp = head;
        Node newNode;
        if (index < 0 || index >= this.numNodes) {
            return null;
        } else if (index == 0) {
            newNode = head;
            head = head.next;
            numNodes--;
            return newNode.data;
        }
        for (int i = 0; i < numNodes; i++) {
            if (i == index) {
                newNode = temp.next;
                temp.next = temp.next.next;
                numNodes--;
                return newNode.data;
            } else {
                temp = temp.next;
            }
        }
        numNodes--;
        return temp.next.data;

    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public int size() {
        return this.numNodes;
    }

    @Override
    public Object[] clone() {
        Object[] objects = new Object[this.numNodes];
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            objects[i] = temp.data;
            temp = temp.next;
        }
        return objects;
    }

    @Override
    public boolean contains(E o) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(o)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public int indexOf(E e) {
        Node temp=head;
        for (int i = 0; i <numNodes ; i++) {
            if(temp.data.equals(e)){
                return i;
            }
            temp=temp.next;
        }
         return -1;
        }

        @Override
        public boolean add (E e){
            return false;
        }

        @Override
        public void ensureCapacity ( int minCapacity){

        }

        @Override
        public Object get ( int i){
        Node temp= head;
            for (int j = 0; j <numNodes ; j++) {
                if (i==j){
                    return temp.data;
                }
                temp=temp.next;
            }
            return null;
        }

        @Override
        public Object getFirst () {
            return head.data;
        }

        @Override
        public Object getLast () {
         Node temp =head;
            for (int i = 0; i < numNodes; i++){
                if (temp.next == null){
                    return temp.data;
                }
                temp = temp.next;
            }
            return null;
        }

        @Override
        public void clear () {
            for (int i = 0; i <numNodes ; i++) {
                remove(i);
            }
        }

    @Override
    public void display() {
        for (int i = 0; i < numNodes; i++) {
            System.out.println("object[" + i + "] :" + get(i));
        }
    }

    @Override
    public Object removeLast() {
        Object newNode = remove(this.numNodes - 1);
        return newNode;
    }


    public static void main(String[] args) {
        MyLinkedListTest<Integer> myLinkedListTest = new MyLinkedListTest<Integer>();
        myLinkedListTest.add(0, 5);
        myLinkedListTest.addFirst(2);
        myLinkedListTest.addLast(3);
        myLinkedListTest.add(2, 4);
        myLinkedListTest.display();
        System.out.println(myLinkedListTest.remove(3));
        myLinkedListTest.display();
        System.out.println("NumNodes is :" + myLinkedListTest.size());
        Object newNode = myLinkedListTest.removeLast();
        System.out.println(newNode);
        System.out.println("NumNodes is :" + myLinkedListTest.size());
        myLinkedListTest.display();
    }
}

