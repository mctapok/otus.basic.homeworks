package ru.gavrilov.basic.homework.lesson17;

public class MyLinkedList<E> {
    int size = 0;
    Node<E> head;
    Node<E> tail;

    public E addFirst(E data) {
        if (head == null) {
            Node<E> newNode = new Node<>(data);
            head = newNode;
            tail = newNode;
            size++;
            return newNode.data;
        }
        Node<E> newNode = new Node<>(data);
        head.prevNode = newNode;
        newNode.nextNode = head;
        head = newNode;
        head.prevNode = null;
        size++;
        return newNode.data;
    }

    public void addLast(E data) {
        if (head == null) {
            Node<E> newNode = new Node<>(data);
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        Node<E> newNode = new Node<>(data);
        tail.nextNode = newNode;
        newNode.prevNode = tail;
        tail = newNode;
        tail.nextNode = null;
        size++;
    }

    public E getLast() {
        return tail.data;
    }

    public E getFirst() {
        System.out.println(head.data);
        return head.data;
    }

    public void show() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.data + " | ");
            current = current.nextNode;
        }
        System.out.println();
    }

    public E add(int position, E data) {
        Node<E> newNode = new Node<>(data);
        if (position == 0) {
            newNode.nextNode = head;
            newNode.prevNode = head.prevNode;
            head = newNode;
            size++;
            return newNode.data;
        }
        Node<E> currentNode = head;
        for (int i = 0; i < position - 1 && currentNode != null; i++) {
            currentNode = currentNode.nextNode;
        }
        if (currentNode == null) {
            throw new IndexOutOfBoundsException("Позиция больше размера списка");
        }
        newNode.nextNode = currentNode.nextNode;
        currentNode.nextNode = newNode;
        size++;
        return newNode.data;
    }
    public E get(int position){
        Node<E> currentNode = head;
        for (int i = 0; i < position-1 && currentNode != null; i++) {
            currentNode = currentNode.nextNode;
        }
        if (currentNode == null) {
            throw new IndexOutOfBoundsException("Позиция больше размера списка");
        }
        System.out.println(currentNode.data);
        return currentNode.data;
    }

    public E remove(int position) {
        Node<E> currentNode = head;
        if(getSize() == 0){
            throw new IndexOutOfBoundsException("list empty");
        }
        if(position < 0 || position > size){
            throw new IndexOutOfBoundsException("out of index");
        }
        if(position == 0){
            if(currentNode == tail){
                head = null;
                tail = null;
                size--;
                return currentNode.data;
            }
            currentNode.nextNode.prevNode = null;
            head = currentNode.nextNode;
            size--;
            return currentNode.data;
        }
        for (int i = 0; i < position && currentNode != null; i++) {
            currentNode = currentNode.nextNode;
        }
        if (currentNode == null){
            throw new IndexOutOfBoundsException("out of bounds");
        }
        if(currentNode == tail){
            currentNode.prevNode.nextNode = null;
            tail = currentNode.prevNode;
            size--;
            return currentNode.data;
        }
        currentNode.prevNode.nextNode = currentNode.nextNode;
        currentNode.nextNode.prevNode = currentNode.prevNode;
        size--;
        return currentNode.data;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (head == null){
            System.out.println("is empty");
            return true;
        }
        return false;
    }
}

class Node<E> {
    E data;
    Node<E> nextNode;
    Node<E> prevNode;

    public Node(E data) {
        this.data = data;
    }
}
