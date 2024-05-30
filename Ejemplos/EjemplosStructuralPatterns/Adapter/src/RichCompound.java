public class RichCompound extends Compound {
    private String chemical;
    private ChemicalDatabank bank;

    public RichCompound(String chemical) {
        this.chemical = chemical;
    }

    @Override
    public void display() {
        // The Adaptee
        bank = new ChemicalDatabank();
        boilingPoint = bank.getCriticalPoint(chemical, "B");
        meltingPoint = bank.getCriticalPoint(chemical, "M");
        molecularWeight = bank.getMolecularWeight(chemical);
        molecularFormula = bank.getMolecularStructure(chemical);

        System.out.println("\nCompound: " + chemical + " ------ ");
        System.out.println(" Formula: " + molecularFormula);
        System.out.println(" Weight : " + molecularWeight);
        System.out.println(" Melting Pt: " + meltingPoint);
        System.out.println(" Boiling Pt: " + boilingPoint);
    }
}
