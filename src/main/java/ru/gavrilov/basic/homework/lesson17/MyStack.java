package ru.gavrilov.basic.homework.lesson17;

public class MyStack<E> {
    MyLinkedList<E> myLinkedList = new MyLinkedList<E>();

    public void push(E data){
        myLinkedList.addFirst(data);
    }
    public void pop(){
        myLinkedList.remove(0);
    }
    public void show(){
        myLinkedList.show();
    }
}
