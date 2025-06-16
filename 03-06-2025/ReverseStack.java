import java.util.Stack;

public class ReverseStack{
    public static void main(String[] args){
        Stack<Integer>s=new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.print("Elements in a Stack before reversing:"+s);
        reverse(s);
        System.out.print("Elements in a Stack after reversing:"+s);
    }
    public static void reverse(Stack<Integer>stack){
        if(stack.isEmpty()==true) return;
        int ele=stack.pop();
        reverse(stack);
        pushBottom(stack,ele);
    }
    public static void pushBottom(Stack<Integer>stack,int val){
        if(stack.isEmpty()){
            stack.push(val);

        }
        int ele=stack.pop();
        pushBottom(stack,ele);
        stack.push(ele);
        
    }
}