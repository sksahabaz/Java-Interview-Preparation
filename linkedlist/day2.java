import java.util.Scanner;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    void add(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    void insertAtPosition(int element, int pos) {

        Node newNode = new Node(element);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int count = 0;

        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    void print() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }

        System.out.print("null");
    }
}

public class day2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        LinkedList ll = new LinkedList();

        for (int i = 0; i < n; i++) {
            ll.add(scanner.nextInt());
        }

        int element = scanner.nextInt();
        int pos = scanner.nextInt();

        ll.insertAtPosition(element, pos);

        ll.print();
    }
}