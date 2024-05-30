public class SonGoku extends FortniteCharacter {
    public SonGoku(int health) {
        super(health);
    }

    @Override
    protected void attack(FortniteCharacter target) {
        System.out.println(getClass().getSimpleName() + " is attacking " + target.getClass().getSimpleName() + "! Target's health: " + target.health);
        target.reduceHealth(15); 
    }
}