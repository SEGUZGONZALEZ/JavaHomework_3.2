public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();
        double high = 174; // Рост в сантиметрах
        int weight = 70; // Вес в килограммах
        double bmi = (int) (service.calculate(high, weight));

        System.out.printf("Ваш индекс массы тела равен %.0f", bmi);

    }
}