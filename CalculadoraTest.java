/** Algoritmos y Estructuras de datos -  seccion 30
 * Luis Francisco Padilla Juárez - 23663
 * Gabrein Bran Bolaños - 23590
 * HT2, Stacks and Postfix
 * 31-01-2324
 * @return Calculadora Test
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testPosfix() {
        Calculadora calculadora = new Calculadora();
        calculadora.leer("archivo_prueba.txt");  // Asegúrate de tener un archivo de prueba válido

        int resultado = calculadora.posfix();
        // Inserta aquí el valor esperado después de evaluar la expresión en tu archivo de prueba
        int valorEsperado = 0;

        assertEquals(valorEsperado, resultado, "El resultado de la expresión posfija no es el esperado.");
    }

    @Test
    void testCalculadoraOperaciones() {
        Calculadora calculadora = new Calculadora();

        assertEquals(5, calculadora.add(2, 3), "La suma no es correcta.");
        assertEquals(-1, calculadora.dif(2, 3), "La resta no es correcta.");
        assertEquals(6, calculadora.mult(2, 3), "La multiplicación no es correcta.");

        // Asegúrate de no dividir por cero en tus pruebas
        assertThrows(ArithmeticException.class, () -> calculadora.div(2, 0), "No se lanzó una excepción por división por cero.");
        assertEquals(2, calculadora.div(6, 3), "La división no es correcta.");
    }
}