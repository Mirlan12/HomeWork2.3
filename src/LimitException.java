public class LimitException extends Exception{

    private  String message;
    private double remainingAmount;

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public LimitException(String message, double amount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }
}