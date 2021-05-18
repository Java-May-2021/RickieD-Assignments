import java.util.NoSuchElementException;
public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
        this.head=null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    
    public void remove(int value) {
        Node newNode = new Node(value);

        if (head == null)
            remove(value);
        else {
            Node runner = head;
            for (int i = 0; i < value - 1; i++)
                runner = runner.next;

            runner.next = runner.next.next;
            value--;
        }
    }

    public void printValues(){
        Node current = this.head;
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}
