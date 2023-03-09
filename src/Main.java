public class Main {
    public static void main(String[] args) {

        int money_account = 100; // Денег на счете
        int replenishment_amount = 1200; // Сумма пополнения
        int bonus = replenishment_amount / 100;
        if (replenishment_amount > 1000) {
            System.out.println("Итоговая сумма:" + (money_account + replenishment_amount + bonus));
            ;
        } else {
            System.out.println("Итоговая сумма:" + (money_account + replenishment_amount));
        }
    }
}