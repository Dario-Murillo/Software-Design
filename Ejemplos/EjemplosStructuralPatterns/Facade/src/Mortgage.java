public class Mortgage {
    private Bank bank = new Bank();
    private Loan loan = new Loan();
    private Credit credit = new Credit();
    
    public boolean isEligible(Customer cust, int amount) {
        System.out.printf("%s applies for $%,d loan\n", cust.getName(), amount);
        boolean eligible = true;
        
        // Check creditworthiness of the applicant
        if (!bank.hasSufficientSavings(cust, amount)) {
            eligible = false;
        } else if (!loan.hasNoBadLoans(cust)) {
            eligible = false;
        } else if (!credit.hasGoodCredit(cust)) {
            eligible = false;
        }
        
        return eligible;
    }
}
