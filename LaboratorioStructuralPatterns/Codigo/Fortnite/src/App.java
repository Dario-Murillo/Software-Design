public class App {
    public static void main(String[] args) throws Exception {
        var goku = new SonGoku(100);
        var blackKnight = new BlackKnight(100);
        goku.attack(blackKnight);
        goku.attack(blackKnight);
        goku.attack(blackKnight);
        goku.attack(blackKnight);
        goku.attack(blackKnight);
        goku.attack(blackKnight);
        goku.attack(blackKnight);

    
        var spiderGwen = new SpiderGwen(100);
        spiderGwen.attack(goku);

        var mario = new MarioAdaptador(100);
        mario.attack(spiderGwen);
        mario.attack(spiderGwen);
        mario.attack(spiderGwen);
        mario.attack(spiderGwen);

    }
}
