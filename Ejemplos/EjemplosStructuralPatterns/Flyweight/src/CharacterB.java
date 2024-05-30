public class CharacterB extends Character {
    public CharacterB() {
        symbol = 'B';
        height = 100;
        width = 140;
        ascent = 72;
        descent = 0;
    }

    @Override
    public void display(int pointSize) {
        this.pointSize = pointSize;
        System.out.println(symbol + " (pointsize " + this.pointSize + ")");
    }
}
