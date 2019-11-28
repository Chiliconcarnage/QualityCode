public class LinkedList{

    public Node head;

    public LinkedList(){
        head = new Node(0);
    }

    public boolean addEnd(int content){
        Node end = new Node(content);
        Node current = head;

        while(current.next != null){
            current = current.next;
        }
        current.next = end;
        return true;
    }

    public boolean delete(int contentToDelete){
        Node current = head;
        while(current.next!=null){
            if(current.next.data==contentToDelete){
                current.next = current.next.next;
                System.out.println("Success! "+contentToDelete+" deleted.");
                return true;
            }
            current = current.next;
        }
        System.out.println("Delete Failed.");
        return false;
    }

    public void showList(){
        Node current = head;
        while (current.next != null){
            System.out.print(current.data+ " -> ");
            current = current.next;
        }
        System.out.println(current.data);
    }

}