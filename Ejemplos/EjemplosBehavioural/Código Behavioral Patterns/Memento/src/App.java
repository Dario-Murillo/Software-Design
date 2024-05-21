public class App {
    public static void main(String[] args) throws Exception {
        SalesProspect s = new SalesProspect();
        s.setName("Noel van Halen");
        s.setPhone("(412) 256-0990");
        s.setBudget(25000.0);

        // Store internal state
        ProspectMemory m = new ProspectMemory();
        m.setMemento(s.saveMemento());

        // Continue changing originator
        s.setName("Leo Welch");
        s.setPhone("(310) 209-7111");
        s.setBudget(1000000.0);

        // Restore saved state
        s.restoreMemento(m.getMemento());
    }
}
