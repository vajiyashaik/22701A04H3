
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        this.head=null;
    }
   
    void insertEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        var temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void print(){
        var temp=head;
        System.out.println("elements in a list are:");
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
}

public class insertAtEnd{
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.print();
    }
}