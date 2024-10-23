
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
    void insertAtBeginning(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

   
    boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false; 
    }
}


public class insertion{
    public static void main(String[] args) {
        LinkedList L1 = new LinkedList();

        
        L1.insertAtBeginning(3);
        L1.insertAtBeginning(2);
        L1.insertAtBeginning(1);

        
        int searchKey = 2;
        if (L1.search(searchKey)) {
            System.out.println(searchKey + " is found in the list.");
        } else {
            System.out.println(searchKey + " is not found in the list.");
        }
    }
}
