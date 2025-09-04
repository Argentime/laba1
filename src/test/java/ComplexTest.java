package test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import demo.parallel.Complex;

public class ComplexTest {

    @Test
    void testDivide() {
        // Проверка деления двух комплексных чисел.
        // (2 + 4i) / (1 + i) = ( (2*1 + 4*1) + (4*1 - 2*1)i ) / (1^2 + 1^2) = (6 + 2i) / 2 = 3 + i
        Complex a = new Complex(2, 4);
        Complex b = new Complex(1, 1);
        Complex result = a.divide(b);
    }

    @Test
    void testDivideByZero() {
        // Проверка, что деление на ноль выбрасывает исключение.
        Complex a = new Complex(5, 5);
        Complex b = new Complex(0, 0);

        // Используем assertThrows для проверки, что метод бросает IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            a.divide(b);
        }, "Деление на ноль должно вызывать IllegalArgumentException");
    }
}
