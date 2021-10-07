package Learning;
    public class Queue {
        //public static void main(String[] args) {
        int queue[] = new int[5];
        int size;
        int front;
        int rear;

        public void enQueue(int data) {
            queue[rear] = data;
            rear = rear++;
        }

        public void show() {
            for (int i = 0; i < size; i++) {
                System.out.println(queue[i]);
            }
        }

        public class Rahulqueue {
            public static void main(String[] args) {
                Learning.Queue r = new Learning.Queue();
                r.enQueue(8);
                r.enQueue(1);
                r.enQueue(2);
                r.show();

            }

        }
    }

