package Learning;

public class RunStack {
    public static void main(String[] args) {
        Stack r = new Stack();
        r.push(12);
        r.push(18);
        r.push(24);
        System.out.println(r.peek());

        r.push(12);
        r.push(10);
        r.show();
        System.out.println();
        System.out.println( + r.pop());
        r.show();

    }
}
