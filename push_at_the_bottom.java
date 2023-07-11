package collectionframework;
import java.util.*;
public class push_at_the_bottom {
    public  static void pustAtBottom(int data, Stack<Integer>s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();//remove
        pustAtBottom(data,s);
        s.push(top);//
    }
    public static void main(String args[]){
        Stack<Integer>s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pustAtBottom(4,s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
