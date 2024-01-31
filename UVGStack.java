public interface UVGStack<T> {

    void push(T x);

    int pop();

    int top();

    boolean isEmpty();
}