package com.boshko.geekjunior.hw2.task1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList <T> implements Iterable<T>{

    private class MyLinkedListIterator implements Iterator<T> {

        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = current.t;
            current = current.next;
            return t;
        }
    }

    public Iterator<T> iterator() {
        return new MyLinkedListIterator();
    }


    private class Node {
        T t;
        Node next;
        Node previous;

        public Node(T t, Node next, Node previous) {
            this.t = t;
            this.next = next;
            this.previous = previous;
        }
    }

    private int size = 0;
    private Node first = null;
    private Node last = null;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insertFirst(T t) {
        Node oldFirst = first;
        first = new Node(t, oldFirst, null);
        if (isEmpty()) {
            last = first;
        } else oldFirst.previous = first;
        size++;
    }

    public T deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T t = first.t;
        first = first.next;
        first.previous = null;
        size--;
        if (isEmpty()) {
            last = null;
        }
        return t;
    }

    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T t = first.t;
        return t;
    }

    public void insertLast(T t) {
        Node oldLast = last;
        last = new Node(t, null, oldLast);
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        size++;
    }

    public T deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T t = (T) last.t;
        Node previous = last.previous;
        last.previous = null;
        last = previous;
        size--;
        if (isEmpty()) {
            first = null;
        } else {
            last.next = null;
        }
        return t;
    }

    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T t = (T) last.t;
        return t;
    }

    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        int currentIndex = 0;
        Node current = first;
        while (currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        return current.t;
    }

    public void set(int index, T t) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        int currentIndex = 0;
        Node current = first;
        while (currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        current.t = t;
    }

    public boolean find(T t) {
        Node current = first;
        while (current != null && !current.t.equals(t)) {
            current = current.next;
        }
        return current != null;
    }

    public T delete(T t) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Node current = first;
        while (current != null && !current.t.equals(t)) {
            current = current.next;
        }
        if (current == null) {
            return null;
        } else if (current == first) {
            return deleteFirst();
        } else if (current == last) {
            return deleteLast();
        }
        current.next.previous = current.previous;
        current.previous.next = current.next;
        size--;
        current.previous = null;
        current.next = null;
        return current.t;
    }

    public void insert(int index, T t) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        int currentIndex = 0;
        Node current = first;
        if (index == 0) {
            insertFirst(t);
            return;
        } else if (index == size) {
            insertLast(t);
            return;
        }
        while (currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        Node newNode = new Node(t, current, current.previous);
        current.previous.next = newNode;
        current.previous = newNode;
        size++;
    }

}
