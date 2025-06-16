
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
   
    void insertBeg(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        
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

public class insertAtBeg{
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insertBeg(10);
        list.insertBeg(20);
        list.insertBeg(30);
        list.insertBeg(40);
        list.print();
    }
}