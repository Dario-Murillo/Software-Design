public class RenegadeRaider extends FortniteCharacter {
    public RenegadeRaider(int health) {
        super(health);
    }

    @Override
    protected void attack(FortniteCharacter target) {
        System.out.println(getClass().getSimpleName() + " attacked " + target.getClass().getSimpleName() + "! Target's health: " + target.health);
        target.reduceHealth(18);
    }
}