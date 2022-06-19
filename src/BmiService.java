public class BmiService {

    public double calculate(double high, int weight) {
        double highMeters = high/100; // Перевод роста в метры

        return weight / Math.pow(highMeters, 2); // Расчёт ИМТ
    }
}