package Stack.arrayList;

import Stack.linkedList.StackinLinkedList;

import javax.swing.*;
import java.util.ArrayList;

public class StackinArrayList {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(isEmpty()){return -1;}
            int top = list.get(list.size()-1);
            list.remove(top);
            return top;
        }
        public static int peek(){
            if(isEmpty()){return -1;};
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        StackinLinkedList.Stack s = new StackinLinkedList.Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}



