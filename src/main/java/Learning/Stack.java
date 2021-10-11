package Learning;
class Stack {
    int Stack[] = new int [5];
    int top=0;
    public void push (int data) {
            Stack [top] = data;
            top++;
    }
    public int pop(){
        int data;
        top--;
        data = Stack [top];
        Stack[top]=0;
        return data;
    }
    public int peek(){
        int data;
        data = Stack[top-1];
        return data;
    }
    public void show(){
        for(int r:Stack){
            System.out.print(r + " " );
        }
    }
}