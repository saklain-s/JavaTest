package com.linkedlist;

public class LLKK {

    private Node head;
    private Node tail;
    private int size;

    public LLKK() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
        }

        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            size++;
            return new Node(val, node);
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public int deleteFirst() {
        if (head == null) throw new IllegalStateException("List is empty");
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
        }

        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) return node;
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
        }

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void duplicates() {
        Node node = head;
        while (node != null && node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        if (tail != null) tail.next = null;
    }

    public static LLKK merge(LLKK first, LLKK second) {
        Node f = first.head;
        Node s = second.head;
        LLKK ans = new LLKK();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    public void bubbleSort() {
        if (size < 2) return;

        for (int i = 0; i < size; i++) {
            Node current = head;
            Node prev = null;
            while (current != null && current.next != null) {
                if (current.value > current.next.value) {
                    Node next = current.next;
                    current.next = next.next;
                    next.next = current;

                    if (prev == null) {
                        head = next;
                    } else {
                        prev.next = next;
                    }

                    prev = next;
                } else {
                    prev = current;
                    current = current.next;
                }
            }
        }

        // Fix the tail
        tail = head;
        while (tail != null && tail.next != null) {
            tail = tail.next;
        }
    }

    public void reverse() {
        if (size < 2) return;

        Node prev = null;
        Node present = head;
        Node next = null;

        tail = head;

        while (present != null) {
            next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }

        head = prev;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LLKK first = new LLKK();
        LLKK second = new LLKK();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LLKK merged = LLKK.merge(first, second);
        System.out.println("Merged List:");
        merged.display();

        LLKK list = new LLKK();
        for (int i = 7; i > 0; i--) {
            list.insertLast(i);
        }
        System.out.println("Before Sorting:");
        list.display();

        list.bubbleSort();
        System.out.println("After Sorting:");
        list.display();

        list.reverse();
        System.out.println("After Reversal:");
        list.display();
    }
}
