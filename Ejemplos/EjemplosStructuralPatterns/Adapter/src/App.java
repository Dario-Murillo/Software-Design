public class App {
    public static void main(String[] args) throws Exception {
        // Non-adapted chemical compound
        Compound unknown = new Compound();
        unknown.display();

        // Adapted chemical compounds
        Compound water = new RichCompound("Water");
        water.display();
        Compound benzene = new RichCompound("Benzene");
        benzene.display();
        Compound ethanol = new RichCompound("Ethanol");
        ethanol.display();
    }
}
