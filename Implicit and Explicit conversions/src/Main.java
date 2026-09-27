public class Main {
    public static void main(String[] args) {
        int deposit = 7000;
        double interest_Rate = 4.5;
        Savings Account = new Savings(deposit, interest_Rate);
        Account.SavingsInterest();
        double depositAsDouble = (double) deposit;
        System.out.println("Deposit as a double: "+deposit);
        String doubleAsString = Double.toString(Account.interest);
        System.out.println("Double as text: "+doubleAsString);
    }
}
