package Learning;
public class Run {
    public static void main(String[] args) {
        Queue r = new Queue();
        r.enqueue(7);
        r.enqueue(5);
        r.enqueue(6);
        r.enqueue(3);
        r.dequeue();
        r.dequeue();
        r.enqueue(4);
        r.enqueue(9);
        r.enqueue(1);
        r.show();

    }
}
