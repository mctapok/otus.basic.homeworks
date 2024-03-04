package ru.gavrilov.basic.homework.lesson17;

public class MyStack<E> {
    MyLinkedList<E> myLinkedList = new MyLinkedList<E>();

    public E push(E data){
        return myLinkedList.addFirst(data);
    }
    public E pop(){
       return myLinkedList.remove(0);
    }
    public void show(){
        myLinkedList.show();
    }
}
