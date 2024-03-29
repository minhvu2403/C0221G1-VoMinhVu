package week2.dsa_stack_queue.thuc_hanh;


import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public  MyGenericStack(){
        stack = new LinkedList();
    }

   public  boolean isEmpty(){
        if (stack.size()==0){
            return  true;
        }
        return  false;
   }
   public int size(){
        return  stack.size();
   }
   public T pop(){
        if (isEmpty()){
            throw  new EmptyStackException();
        }
        return stack.removeFirst();
   }
   public void push(T element){
        stack.addFirst(element);
   }

}
