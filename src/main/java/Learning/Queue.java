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
}
