public class Savings {
    int deposit;
    double interest_Rate;
    double interest;
    double total_Amount;
    public Savings (int D, double R) {
        deposit= D;
        interest_Rate= R;
    }
    public void SavingsInterest () {
        interest= deposit * interest_Rate/100;
        total_Amount= deposit + interest;
    }
    public void SummaryReport() {
        System.out.println("Deposit: " + deposit);
        System.out.println("Interest Rate: " + interest_Rate + "%");
        System.out.println("Interest: " + interest);
        System.out.println("Total Amount: " + total_Amount);
    }
}
