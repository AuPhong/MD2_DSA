import javax.xml.soap.Node;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        this.head = new Node();
        head.data = data;
        head.next = null;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node() {
        }

        public Object getData() {
            return this.data;
        }
    }

    public void addLast(Object data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void addFirst(Object data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void addAt(int index, Object data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (index == 0) {
            addFirst(node);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void deleteAt(int index){
        if (index == 0){
            head = head.next;
        }
        else {
            Node temp = head;
            Node temp1 = null;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp1 = temp.next;
            temp.next = temp1.next;
        }
    }

    public void show() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
}
