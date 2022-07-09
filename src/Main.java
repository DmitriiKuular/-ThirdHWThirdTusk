public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // int credit = 1_000_000; // Сумма кредита
        // double percent = 9.99; // Процентная ставка
        // int amountMonths = 12; // Срок кредита в месяцах
        System.out.println();
        System.out.println("Сумма кредита - 1 000 000 рублей");
        System.out.println("Процентная ставка - 9,99 %");
        System.out.println("Срок кредита - 12 месяцев");
        System.out.println("Ежемесячный платеж составит - " +
                (int) service.calculate(1_000_000, 9.99, 12) + " руб.");
        System.out.println();
        System.out.println("Сумма кредита - 1 000 000 рублей");
        System.out.println("Процентная ставка - 9,99 %");
        System.out.println("Срок кредита - 24 месяца");
        System.out.println("Ежемесячный платеж составит - " +
                (int) service.calculate(1_000_000, 9.99, 24) + " руб.");
        System.out.println();
        System.out.println("Сумма кредита - 1 000 000 рублей");
        System.out.println("Процентная ставка - 9,99 %");
        System.out.println("Срок кредита - 36 месяцев");
        System.out.println("Ежемесячный платеж составит - " +
                (int) service.calculate(1_000_000, 9.99, 36) + " руб.");
    }
}
