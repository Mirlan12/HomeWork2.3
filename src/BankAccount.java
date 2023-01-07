public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }


    public void deposit(double sum) {
        amount +=sum;
        System.out.println("Пополнение счета прошла успешно." + sum);

    }

    public void withDraw( int sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("Недостаточно средств", amount);
        } else {
            amount -= sum;
            System.out.println("Вы сняли деньги:  " + sum);
        }
    }
}