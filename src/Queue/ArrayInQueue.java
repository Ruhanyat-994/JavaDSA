package Queue;

public class ArrayInQueue {
    public static class Queue{

         static int arrr[];
         static int size;
         static int rear = -1;


         Queue(int size){
             arrr = new int[size];
             this.size = size;

         }

         public static boolean isEmpty(){
             return rear == -1;
         }
         public static void enqueue(int data){
             if(rear == size-1){
                 System.out.println("Queue is Full");
             }
             rear++;
             arrr[rear] = data;

         }

         public static int dequeue(){
             if(isEmpty()){
                 System.out.println("Queue is Empty");
                 return -1;
             }
             int front = arrr[0];
             for(int i=0 ; i<rear ; i++){
                 arrr[i] = arrr[i+1];
             }
             rear--;
             return front;
         }
         public static int peek(){

             if(isEmpty()){
                 System.out.println("Queue is Empty");
                 return -1;
             }
             return arrr[0];
         }
    }


    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.dequeue();
        }
    }
}
