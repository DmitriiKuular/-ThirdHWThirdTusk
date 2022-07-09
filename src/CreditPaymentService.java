public class CreditPaymentService {
    public double calculate(int sCredit, double percent, int months) {

        double percentPeriod = percent / (100 * 12); // Временная переменная 1 для подставки в формулу
        int y = - months; // Временная переменная 2 для расчета формулы
        double x = 1 + percentPeriod; // Временная переменная 3 для расчета формулы
        double z = Math.pow(x, y); // Временная переменная 4 для расчета формулы
        double result = sCredit * (percentPeriod / ( 1 - z ));
        return result;
    }
}
