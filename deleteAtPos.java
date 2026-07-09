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

    void deleteAtPos(int pos){
        if(head == null){
            return;
        }

        if(pos == 0){
            head = head.next;
            if(head == null){
                tail = null;
            }
            return;
        }

        Node temp = head;
        int i = 0;

        while(i < pos - 1 && temp != null && temp.next != null){
            temp = temp.next;
            i++;
        }

        if(temp.next == null){
            return;
        }

        temp.next = temp.next.next;

        if(temp.next == null){
            tail = temp;
        }
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


public class deleteAtPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();

        System.out.print("Enter the number of elements to insert : ");
        int n = sc.nextInt();

        for(int i = 0;i<n;i++){
            ll.insertLast(sc.nextInt());
        }

        ll.printLL();

        ll.deleteAtPos(3);

        ll.printLL();
        sc.close();
        
    }
}
