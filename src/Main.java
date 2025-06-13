import java.util.LinkedList;

public class Main{
    Node head;
    private int size;
    public class Node{
        private String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void  addFirst(String data){

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }
    public void addLast(String data){
        Node currentNode = head;
        Node newNode = new Node(data);
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
        }
        head = this.head.next;

    }
    public void printList(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+ " -> " );
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Main list = new Main();
        list.addFirst("Ruhanyat");
        list.addFirst("is");
        list.addFirst("Name");
        list.addFirst("My");
        list.addLast("MAR");
        list.deleteFirst();
        list.printList();

    }

}
