public class Peely extends FortniteCharacter {
    public Peely(int health) {
        super(health);
    }

    @Override
    protected void attack(FortniteCharacter target) {
        System.out.println(getClass().getSimpleName() + " attacked " + target.getClass().getSimpleName() + "! Target's health: " + target.health);
        target.reduceHealth(4);
    }

    @Override
    protected void reduceHealth(int subtract) {
        health -= subtract;
    }
}