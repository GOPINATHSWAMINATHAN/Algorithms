public class StackDemo {


    int[] stack = new int[1000];
    int top;

    int max = stack.length;


    StackDemo() {
        top = -1;
    }

    boolean push(int data) {
        if (top >= max) {
            System.out.println("Stack Overflow!");
            return false;
        } else {
            stack[++top] = data;
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = stack[top--];
            return x;
        }
    }
    void getElements()
    {
        for (int i=0;i<stack.length;i++)
        {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        StackDemo sd=new StackDemo();
        sd.push(33);
        sd.push(34);
        int b=sd.pop();
        System.out.println(b);
        sd.getElements();
    }

}
