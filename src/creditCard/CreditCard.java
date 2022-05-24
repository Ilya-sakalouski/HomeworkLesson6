package src.creditCard;

public class CreditCard {
    int bankAccount;
    int currentSum;

    public CreditCard(int bankAccount, int currentSum) {
        this.bankAccount = bankAccount;
        this.currentSum = currentSum;
    }

    public int addMoney(int currentSum, int addDum) {
        this.currentSum += addDum;
        return currentSum;
    }

    public int withdrawMoney(int currentSum, int withdrawSum ) {
        this.currentSum-= withdrawSum;
        return bankAccount;
    }

    public void accountCurrentValue(){
        System.out.println("Current value for bankAccount number : " + bankAccount + " = " + currentSum);
    }

}
