package ch.chiodonia.foo;

/**
 * Programma principale.
 */
public class Foo {
    public static void main(String[] args) {
        StatisticalService statisticalService = new StatisticalService();
        try {
            System.out.printf("Media: %1$,.2f%n", statisticalService.average(toNumbers(args)));
        } catch (IllegalArgumentException exception) {
            System.err.printf("Devi passare dei numeri...");
        }
    }

    private static double[] toNumbers(String[] strings) {
        double[] numbers = new double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            numbers[i] = Double.parseDouble(strings[i]);
        }
        return numbers;
    }
}
