public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList("hj");
        list.addLast("ds");
        list.addLast("3");
        list.addLast("4");
        list.addFirst(1);
       // list.addAt(0,"ty");
        list.deleteAt(2);
        list.show();

    }

}
