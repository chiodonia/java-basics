package ch.chiodonia.foo;

/**
 * Servizio per il calcolo statistico.
 */
public class StatisticalService {

    /**
     * Calcola la media aritmetica.
     *
     * @param numbers numeri sui quali viene calcolata la media
     * @return media matematica, 0 se numbers è vuoto
     */
    public double average(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Non è possibile calcolare perchè nessun numero è stato passato");
        }
        double sum = 0;
        for (double number : numbers) {
            sum = sum + number;
        }
        return sum / numbers.length;
    }

}
