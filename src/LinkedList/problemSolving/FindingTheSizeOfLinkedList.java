package LinkedList.problemSolving;

/*
input
----------
34->12->55->42->11
output
----------
5
*/
public class FindingTheSizeOfLinkedList {

    Node head;
    class Node{
        private String Data ;
        Node next;

        public Node(String data) {
            this.Data = data;
            this.next = null;
        }
    }
    public int getSize(){
        int count = 0;
        Node currentNode = head;
        while(currentNode!= null){
            count++;
            currentNode=currentNode.next;
        }
        return count;
    }
    public void addingItems(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode= head;
        while(currentNode.next!= null){
            currentNode=currentNode.next;
        }

        currentNode.next = newNode;
    }
    public void printList(){
        Node currentNode = head;
        while(currentNode!= null){
            System.out.print(currentNode.Data+" -> ");
            currentNode=currentNode.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        FindingTheSizeOfLinkedList list = new FindingTheSizeOfLinkedList();
        list.addingItems("34");
        list.addingItems("35");
        list.addingItems("36");
        list.addingItems("37");
        list.addingItems("38");
        list.addingItems("39");
        list.printList();
        System.out.println();
        System.out.println("The size of the linkedList: "+list.getSize());
    }


}
