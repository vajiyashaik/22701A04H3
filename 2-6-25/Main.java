class Node{
    int data;
    Node next;
    Node (int data){
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
            newNode.next=head;
            head=newNode;
            
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
        int deleteBeg(){
            if(head==null){
            System.out.println("There are no elements to delete");
            return -1;
            }
            int removed=head.data;
            head=head.next;
            return removed;
        }
        int deleteEnd(){
            int length=length();
            int removed;
            var temp=head;
            if(length==0){
                System.out.println("No elements");
                return -1;
            }
            else if(length==1){
                removed=head.data;
                head=null;
                return removed;
                
            }else{
                for(int i=1;i<=length-2;i++){
                    temp=temp.next;
                }
                removed=temp.next.data;
                temp.next=null;
                return removed;
            }
            
        }
        int length(){
            int length=0;
             var temp=head;
            while(temp!=null){
                length++;
                temp=temp.next;
            }
            return length;
        }
       
       int deletePos(int pos){
            int length=length();
           int removed=-1;
           
            if(pos>=0 && pos<=length){
            if(pos==0){
                return deleteBeg();
            }else if(pos==length){
              return deleteEnd();
            }else{
                var temp=head;
                for(int i=0;i<pos-1;i++){
                    temp=temp.next;
                }
                 removed=temp.next.data;
                temp.next=temp.next.next;
               
                }
             
        }
        return removed;
    }
    void print(){
        var temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
    }


 public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertEnd(10);
         list.insertEnd(20);
         list.insertEnd(30);
         list.insertBeg(5);
         list.insertBeg(1);
         list.print();
         System.out.println();
         int removed=list.deleteBeg();
         System.out.println("Removed Element is"+removed);
          list.print();
          System.out.println(); 
        int removed2= list.deletePos(0);
         System.out.println("Removed Element at position 0 is"+removed2);
         
         list.print();
         System.out.println();
        System.out.println("Removed Element is:"+list.deleteEnd());
        list.print();

    }
}