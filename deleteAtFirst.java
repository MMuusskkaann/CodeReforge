import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class LinkedList{
    Node head;
    Node tail;

    void insertLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail= newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    void removeFirst(){
        if(head == null){
            System.out.println("Linked list is an Empty.");
            return;
        }

        if(head == tail){
            head = tail = null;
            return;
        }

        head = head.next;
    }

    void printLL(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class deleteAtFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();

        System.out.print("Enter the number of elements to insert : ");
        int n = sc.nextInt();

        for(int i = 0;i<n;i++){
            ll.insertLast(sc.nextInt());
        }

        ll.printLL();

        ll.removeFirst();

        ll.printLL();

        sc.close();
        
    }
}
