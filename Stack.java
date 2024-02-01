import java.util.ArrayList;


public class Stack<T> implements UVGStack<T> {

    private ArrayList<T> stack;

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
        T ret = this.stack.get(i);
        this.stack.remove(i-1);
        return ret;
    }

    @Override
    public T top() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("El Stack esta vacio");
        }
        return stack.get(stack.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
