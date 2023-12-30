package ru.gavrilov.basic.homework.lesson17;

public class MyQueue<E> {
    MyLinkedList<E> linkedList = new MyLinkedList<>();

    public void offer(E data){
        linkedList.addFirst(data);
    }

    public void poll(){
        linkedList.remove(linkedList.getSize());
    }
    public void show(){
        linkedList.show();
    }
}
