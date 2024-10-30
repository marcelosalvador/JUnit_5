package junit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculator();
    }

    @Test
    public void testSoma() {
        assertEquals(5, calculadora.soma(2, 3), "Soma de 2 e 3 deveria ser 5");
    }

    @Test
    public void testSubtrai() {
        assertEquals(2, calculadora.subtrai(5, 3), "Subtração de 5 e 3 deveria ser 2");
    }

    @Test
    public void testMultiplica() {
        assertEquals(15, calculadora.multiplica(3, 5), "Multiplicação de 3 e 5 deveria ser 15");
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculadora.divide(6, 3), "Divisão de 6 por 3 deveria ser 2");
    }

    @Test
    public void testDividePorZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.divide(5, 0), "Divisão por zero deveria lançar uma exceção");
    }
    
}
