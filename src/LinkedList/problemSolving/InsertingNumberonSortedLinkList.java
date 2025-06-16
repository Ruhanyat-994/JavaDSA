package LinkedList.problemSolving;
/*
Given a sorted linked list, insert a number so that after insertion, it remains
sorted.
Input                                                     Output
1->4->6->7->9->11, num = 3             1->3->4->6->7->9->11

*/

public class InsertingNumberonSortedLinkList {

    Node head;
    class Node{
        private int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addingItems(int data){
        Node newNode = new Node(data);
        Node currentNode = head;

        if(head == null){
            head = newNode;
            return;
        }
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;


    }
    public void insertOnSortedLL(int number){
        Node newNode = new Node(number);

        if(head == null || number < head.data){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null && currentNode.next.data < number){
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;

    }
    public void printList(){
        Node currentNode = head;
        while(currentNode!= null){
            System.out.print(currentNode.data +" -> ");
            currentNode=currentNode.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        InsertingNumberonSortedLinkList list = new InsertingNumberonSortedLinkList();
        list.addingItems(34);
        list.addingItems(35);
        list.addingItems(36);
        list.addingItems(38);
        list.addingItems(39);
        list.addingItems(40);
        list.printList();
        System.out.println();
        list.insertOnSortedLL(37);
        list.printList();
        System.out.println();
        list.insertOnSortedLL(12);
        list.printList();
        System.out.println();
        list.insertOnSortedLL(6789);
        list.printList();
    }


}
