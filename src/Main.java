public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        while (true) {
            try {
                bankAccount.withDraw(6000);
            }catch (LimitException limitException) {
                try {
                    bankAccount.withDraw((int) limitException.getRemainingAmount());
                }catch (LimitException a){
                    a.printStackTrace();
                }
                break;
            }
        }
    }
}