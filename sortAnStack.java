import java.util.Stack;

public class sortAnStack {
    public static Stack<Integer> sortStack(Stack<Integer> sample){
        // Base condition to check if stack contains only 1 element
        if(sample.size() == 1){
            return sample;
        }
        //take the last element from stack and find it's
        //correct position in order to insert
        int eleToSort=sample.pop();

        sortStack(sample); // calling till we seperate every element  from stack and only 1 elements remain
        
        //to put the element at its correct position happens in a chain order...
        return insertStack(sample, eleToSort);
    }

    public static Stack<Integer> insertStack(Stack<Integer> st, int ets){
        //Stack is empty or top element is less or equal push the element right away
        if(st.size()==0 || st.peek()<=ets){
            st.push(ets);
            return st;
        }
        //removing element
        int top=st.pop();

        //in order to work in a much smaller size, stack to easily insert sorted ele
        insertStack(st, ets);
        //finally inserting element
        st.push(top);
        return st;
    }
    public static void main(String[] args) {
        Stack<Integer> sample=new Stack<>();
        sample.push(6);
        sample.push(8);
        sample.push(4);
        sample.push(9);

        System.out.println("Stack before sorting : ");
        for(int i: sample){
            System.out.print(i+" ");
        }
        System.out.println();

        Stack<Integer> sortedStack=sortStack(sample);
        System.out.println("Stack after sorting : ");
        for(int i: sortedStack){
            System.out.print(i+" ");
        }
    }
}
