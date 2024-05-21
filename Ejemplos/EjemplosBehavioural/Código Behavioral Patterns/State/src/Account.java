public class Account {
    private State state;
    private String owner;

    // Constructor
    public Account(String owner) {
        // New accounts are 'Silver' by default
        this.owner = owner;
        this.state = new SilverState(0.0, this);
    }

    public double getBalance() {
        return state.getBalance();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void Deposit(double amount) {
        state.Deposit(amount);
        System.out.printf("Deposited %.2f --- Balance = %.2f%n", amount, getBalance());
        System.out.printf("Status = %s%n%n", this.state.getClass().getSimpleName());
    }

    public void Withdraw(double amount) {
        state.Withdraw(amount);
        System.out.printf("Withdrew %.2f --- Balance = %.2f%n", amount, getBalance());
        System.out.printf("Status = %s%n%n", this.state.getClass().getSimpleName());
    }

    public void PayInterest() {
        state.PayInterest();
        System.out.println("Interest Paid --- Balance = " + getBalance());
        System.out.println("Status = " + this.state.getClass().getSimpleName() + "\n");
    }
}
