public class CharacterZ extends Character {
    public CharacterZ() {
        symbol = 'Z';
        height = 100;
        width = 100;
        ascent = 68;
        descent = 0;
    }

    @Override
    public void display(int pointSize) {
        this.pointSize = pointSize;
        System.out.println(symbol + " (pointsize " + this.pointSize + ")");
    }
}
