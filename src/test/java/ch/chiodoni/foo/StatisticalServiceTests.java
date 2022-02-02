package ch.chiodoni.foo;

import ch.chiodonia.foo.StatisticalService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticalServiceTests {

    private final StatisticalService statisticalService = new StatisticalService();

    @Test
    public void testAverageAverageDiDueNumeri() {
        double[] numbers = {5.0, 6.0};
        Assertions.assertEquals(5.5D, statisticalService.average(numbers));
    }

    @Test
    public void testAverageDiUnNumero() {
        double[] numbers = {5.1};
        Assertions.assertEquals(numbers[0], statisticalService.average(numbers));
    }

    @Test
    public void testAverageDiNessunNumero() {
        double[] numbers = {};
        Assertions.assertThrows(IllegalArgumentException.class, () -> statisticalService.average(numbers));
    }

    @Test
    public void testAverageDiNiente() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> statisticalService.average(null));
    }
}
