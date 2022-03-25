import java.util.*;
public class delFromMid {
    public static void main(String args[]) {
       Deque<Integer> stack = new ArrayDeque<Integer>();
       stack.push(1);
       stack.push(7);
       stack.push(-2);
       stack.push(6);
       stack.push(9);
       stack.push(-3);
       System.out.println(stack);
       delete(stack, 4);
       System.out.println(stack);
    }
    
    static void delete(Deque<Integer> stack, int n){
        if(n==1)
        {
            stack.pop();
            return;
        }
        int temp = stack.pop();
        delete(stack, n-1);
        stack.push(temp);
    }
    
}