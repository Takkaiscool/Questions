package hard;

class Node{
    int data;
    Node next;
    public  Node(int data){
        this.data=data;
        next=null;
    }

    public static Node insert(int data,Node head){
        Node curr=head;
        if(head==null)
            return new Node(data);
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=new Node(data);
        return  head;
    }
    public static void printData(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}
public class CLinkedList {

    public static void main(String[] args) {
        Node head=null;
        head=Node.insert(15,head);
        head=Node.insert(20,head);
        Node.printData(head);

    }
}
