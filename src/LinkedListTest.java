import org.w3c.dom.Node;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addEnd(1);
        list.addEnd(2);
        list.addEnd(3);
        list.showList();
        list.delete(1);
        list.delete(3);
        list.showList();

    }
}


