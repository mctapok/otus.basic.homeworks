package ru.gavrilov.basic.homework.lesson17;

public class MyQueue<E> {
    MyLinkedList<E> linkedList = new MyLinkedList<>();

    public E offer(E data){
        return linkedList.addFirst(data);
    }

    public E poll(){
        return linkedList.remove(linkedList.getSize() - 1);
    }
    public void show(){
        linkedList.show();
    }
}
