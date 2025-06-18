package Stack.ProblemSolving;
// you have to push an element at the bottom of the stack

import java.util.Stack;

public class AddingAtTheBottomofStack {
    public static void pushAtBottom(int data, Stack<Integer> s){

        if(s.isEmpty()){s.push(data); return;}
        int top = s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        pushAtBottom(4,s);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
