public class SalesProspect {
    private String name;
    private String phone;
    private double budget;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name:   " + name);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        System.out.println("Phone:  " + phone);
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
        System.out.println("Budget: " + budget);
    }

    public Memento saveMemento() {
        System.out.println("\nSaving state --\n");
        return new Memento(name, phone, budget);
    }

    public void restoreMemento(Memento memento) {
        System.out.println("\nRestoring state --\n");
        setName(memento.getName());
        setPhone(memento.getPhone());
        setBudget(memento.getBudget());
    }


    public class Memento {
        private String name;
        private String phone;
        private double budget;
    
        private Memento(String name, String phone, double budget) {
            this.name = name;
            this.phone = phone;
            this.budget = budget;
        }
    
        public String getName() {
            return name;
        }
    
        public String getPhone() {
            return phone;
        }
    
        public double getBudget() {
            return budget;
        }
    }
}
