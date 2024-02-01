import java.util.ArrayList;


public class Stack<T> implements UVGStack<T> {

    private ArrayList<T> stack;


    public void a(){
        System.out.println("Stack:");
            for (T num : stack) {
                System.out.println(num);
            }
    }

    public Stack() {
        this.stack = new ArrayList<>();
    }

    @Override
    public void push(T x) {
        stack.add(x);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("El Stack esta vacio");
        }
        int i = stack.size();
        T ret = this.stack.get(i-1);
        this.stack.remove(i-1);
        return ret;
    }

    @Override
    public T top() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("El Stack esta vacio");
        }
        return  stack.get(stack.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}
