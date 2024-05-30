public class CharacterA extends Character {
    public CharacterA() {
        symbol = 'A';
        height = 100;
        width = 120;
        ascent = 70;
        descent = 0;
    }

    @Override
    public void display(int pointSize) {
        this.pointSize = pointSize;
        System.out.println(symbol + " (pointsize " + this.pointSize + ")");
    }
}
