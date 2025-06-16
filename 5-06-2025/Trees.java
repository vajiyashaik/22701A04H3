class Node{
    int data;
   Node left;
   Node right;
   Node(int data){
       this.data=data;
       this.left=null;
       this.right=null;
   }
   }
   class Tree{
       Node root;
       int index=-1;
       Tree(int[] nodes){
           this.root=build(nodes);
       }
       public Node build(int[] nodes){
           index++;
           if(index>=nodes.length){
               return null;
           }if(nodes[index]==-1){
               return null;
           }
           Node newNode =new Node(nodes[index]);
           newNode.left=build(nodes);
           newNode.right=build(nodes);
           return newNode;
       }
       public void preOrder(){
           Node temp=this.root;
           preOrderHelper(temp);
       }
       private void preOrderHelper(Node temp ){
           if(temp==null) return ;
           System.out.print(temp.data+" ");
           preOrderHelper(temp.left);
           preOrderHelper(temp.right);
       }
   }
   
    
   
        
    

public class Trees{
    public static void main(String[] args) {
        Tree t=new Tree(new int[]{1,2,-1,-1,3,-1,-1});
        t.preOrder();
        
     
    }
}