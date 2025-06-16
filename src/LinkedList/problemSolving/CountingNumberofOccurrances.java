package LinkedList.problemSolving;

/*
Print the number of occurrences of a given number in a linked list.
Input                                   Output
1->2->1->2->1->3->1, num = 1            4
*/

public class CountingNumberofOccurrances {
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

    public int occurrenceCount(int number){
        int count = 0;
        Node currnent = head;

        while(currnent != null){
            if(currnent.data == number){
                count++;

            }
            currnent = currnent.next;
        }
        return count;

    }

    public static void main(String[] args) {

        CountingNumberofOccurrances list = new CountingNumberofOccurrances();
        list.addingItems(45);
        list.addingItems(46);
        list.addingItems(47);
        list.addingItems(47);
        list.addingItems(47);
        list.addingItems(47);
        list.addingItems(47);
        list.addingItems(48);
        list.addingItems(49);
        list.addingItems(49);
        int num = 47;
        int occurrences = list.occurrenceCount(num);
        System.out.println(occurrences);



    }



}
