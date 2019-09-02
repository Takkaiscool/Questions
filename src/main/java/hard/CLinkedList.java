package hard;

public class CLinkedList {
    Node head;
    static  class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public  static CLinkedList insert(CLinkedList list,int data){
        Node newNode=new Node(data);
        newNode.next=null;
        if(list.head==null){
            list.head=newNode;
        }
        else{
            Node last=list.head;
            while (last.next!=null){
                last=last.next;
            }
            last.next=newNode;
        }
        return list;
    }

    public  static void printList(CLinkedList list){
        Node currentnode=list.head;
        System.out.println("Linked List: ");
        while (currentnode!=null){
            System.out.print(currentnode.data+"");
            currentnode=currentnode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CLinkedList list=new CLinkedList();
        list=insert(list,5);
        list=insert(list,6);
        list=insert(list,7);
        list=insert(list,8);
        printList(list);
    }
}
