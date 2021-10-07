package Learning;
public class Queue {
    int queue [] = new int[5];
    int size  ;
    int front ;
    int rear  ;
    public void enqueue (int number){
        queue [rear]=number;
        rear = rear+1;
        size = size+1;
    }
    public void dequeue(){
        int data = queue [front];
        front = front+1;
        size = size-1;
    }
    public void show(){
        System.out.print("Elements :  " );
        for (int i = 0; i<size;i++){
            System.out.print(queue[front+i]+ " ");
        }
    }
        //public class Run {
        public static void main(String[] args) {
            Queue r = new Queue();
            r.enqueue(7);
            r.enqueue(5);
            r.enqueue(6);
            r.enqueue(3);
            r.dequeue();
            r.dequeue();
            r.show();

        }
    }

