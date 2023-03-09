public class Main {
    public static void main(String[] args) {

        int moneyAccount = 100; // Денег на счете
        int replenishmentAmount = 1200; // Сумма пополнения
        int bonus = replenishmentAmount / 100;
        if (replenishmentAmount > 1000) {
            System.out.println("Итоговая сумма:" + (moneyAccount + replenishmentAmount + bonus));
            ;
        } else {
            System.out.println("Итоговая сумма:" + (moneyAccount + replenishmentAmount));
        }
    }
}