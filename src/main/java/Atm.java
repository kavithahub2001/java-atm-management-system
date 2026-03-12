public class Atm {

    private double balance;
    private double withdrawalAmount;
    private double depositAmount;
    private double print;
    private double demo;

    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }
    public void setWithdrawalAmount(double withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }
    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }
}
