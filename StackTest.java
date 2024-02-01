/** Algoritmos y Estructuras de datos -  seccion 30
 * Luis Francisco Padilla Juárez - 23663
 * Gabrein Bran Bolaños - 23590
 * HT2, Stacks and Postfix
 * 31-01-2324
 * @return Stack Tes
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
@Test
    public void testPushPop() {
        Stack<Integer> stack = new Stack<>();

        //llenar valores
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //eliminar esos valores del stack
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testTop() {
        Stack<String> stack = new Stack<>();

        //pushear objetos
        stack.push("one");

        stack.push("two");

        stack.push("three");

        //revisar que los top sean correctos
        assertEquals("three", stack.top());
        stack.pop();
        assertEquals("two", stack.top());
        stack.pop();
        assertEquals("one", stack.top());
    }

    @Test
    public void testSize() {
        Stack<Character> stack = new Stack<>();
        assertTrue(stack.isEmpty());//revisar vacio
        assertEquals(0, stack.size());

        //revisar stack llena
        stack.push('A');
        stack.push('B');
        stack.push('C');

        assertFalse(stack.isEmpty());
        assertEquals(3, stack.size());
        stack.pop();
        assertEquals(2, stack.size());

        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    public void testEmptyStackPop() {
        //revisar en caso de doubles
        Stack<Double> stack = new Stack<>();
        assertThrows(UnsupportedOperationException.class, stack::pop);
    }

    @Test
    public void testEmptyStackTop() {
        //revisar en caso de enteros
        Stack<Integer> stack = new Stack<>();
        assertThrows(UnsupportedOperationException.class, stack::top);
    }
}
