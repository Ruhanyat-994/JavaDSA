package LinkedList.problemSolving;

public class PrintingTheValueOfMiddleNode {
    Node head ;
    class Node{
        private String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }

    }
    public void addItem(String data){
        Node currentNode = head;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        while(currentNode.next!= null){
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;

    }

    public void printMiddle(){
        Node slow = head;
        Node fast = head;

        while (fast.next!=null && fast.next.next!= null){
            slow =slow.next;
            fast = fast.next.next;

        }
        System.out.println("The middle value is: "+slow.data);
    }

    public static void main(String[] args) {
        PrintingTheValueOfMiddleNode list = new PrintingTheValueOfMiddleNode();
        list.addItem("45");
        list.addItem("5");
        list.addItem("4");
        list.addItem("45");
        list.printMiddle();
    }

}
