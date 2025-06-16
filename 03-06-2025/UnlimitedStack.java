public class UnlimitedStack
{
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.print();
        System.out.println("The popped element is: "+s.pop());
        s.print();
        System.out.println("The element at the peek is:"+s.peek());
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Stack{
    Node top;
    Stack(){
        this.top=null;
    }
    boolean isEmpty(){
        if(top==null){
            return true;
        }else{
            return false;
        }
    }
    void push(int data){
        Node newNode=new Node(data);
         newNode.next=top;
         top=newNode;
    }
    int pop(){
        if(isEmpty()){
            return -1;
        }
        int val=top.data;
        top=top.next;
        return val;
    }
    int peek(){
        if(isEmpty()){
            return -1;
        }
        int val=top.data;
        return val;
    }
    void print(){
        Node temp=top;
        System.out.println("Elements in the stack are:");
        while(temp!=null){
            System.out.println("|"+temp.data+"|");
            temp=temp.next;
        }
    }
}