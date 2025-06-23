import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    // Testes de Soma
    @Test
    void somarTest() {
        assertEquals(5, calculadora.somar(2, 3)); // Soma de números positivos
        assertEquals(-1, calculadora.somar(2, -3)); // Soma com um número negativo
        assertEquals(-5, calculadora.somar(-2, -3)); // Soma de dois números negativos
        assertEquals(9, calculadora.somar(9, 0)); // Soma com 0
        assertEquals(6, calculadora.somar(2.5, 3.5)); // Soma com pontos flutuantes
    }

    // Testes de Subtração
    @Test
    void subtrairTest() {
        assertEquals(9, calculadora.subtrair(12, 3)); // Subtração de números positivos
        assertEquals(8, calculadora.subtrair(5, -3)); // Subtração com um número negativo
        assertEquals(-2, calculadora.subtrair(-5, -3)); // Subtração de dois números negativos
        assertEquals(-3, calculadora.subtrair(0, 3)); // Subtração com 0
        assertEquals(1.5, calculadora.subtrair(5, 3.5)); // Subtração com ponto flutuante
    }

    // Testes de Multiplicação
    @Test
    void multiplicarTest() {
        assertEquals(6, calculadora.multiplicar(2, 3)); // Multiplicação de números positivos
        assertEquals(-15, calculadora.multiplicar(5, -3)); // Multiplicação com um número negativo
        assertEquals(15, calculadora.multiplicar(-5, -3)); // Multiplicação de dois números negativos
        assertEquals(0, calculadora.multiplicar(8, 0)); // Multiplicação com 0
        assertEquals(16.5, calculadora.multiplicar(5.5, 3)); // Multiplicação com ponto flutuante
    }

    // Testes de Divisão
    @Test
    void dividirTest() {
        assertEquals(2.5, calculadora.dividir(5, 2)); // Divisão de números positivos
        assertEquals(-2.5, calculadora.dividir(-5, 2)); // Divisão com um número negativo
        assertEquals(2.5, calculadora.dividir(-5, -2)); // Divisão de dois números negativos
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(8, 0)); // Divisão por 0
        assertEquals(2, calculadora.dividir(5, 2.5)); // Divisão com ponto flutuante
    }
}


