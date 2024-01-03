package ru.gavrilov.basic.homework.lesson17;

public class MyLinkedList<E> {
    Node<E> head;
    Node<E> tail;

    public void addFirst(E data) {
        if (head == null) {
            Node<E> newNode = new Node<>(data);
            head = newNode;
            tail = newNode;
            return;
        }
        Node<E> newNode = new Node<>(data);
        head.prevNode = newNode;
        newNode.nextNode = head;
        head = newNode;
        head.prevNode = null;
    }

    public void addLast(E data) {
        if (head == null) {
            Node<E> newNode = new Node<>(data);
            head = newNode;
            tail = newNode;
            return;
        }
        Node<E> newNode = new Node<>(data);
        tail.nextNode = newNode;
        newNode.prevNode = tail;
        tail = newNode;
        tail.nextNode = null;
    }

    public E getLast() {
        System.out.println(tail.data);
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

    public void add(int position, E data) {
        Node<E> newNode = new Node<>(data);
        if (position == 0) {
            newNode.nextNode = head;
            head = newNode;
            return;
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
        if (position == 0) {
            head = head.nextNode;
            return head.data;
        }
        for (int i = 0; i < position - 1 && currentNode != null; i++) {
            currentNode = currentNode.nextNode;
        }
        if (currentNode == null) {
            throw new IndexOutOfBoundsException("Позиция больше размера списка");
        }
        currentNode.nextNode = currentNode.nextNode.nextNode;
        return currentNode.data;
    }

    public int getSize() {
        int length = 0;
        Node<E> currentNode = head;
        while (currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
            length++;
        }
        return length;
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
