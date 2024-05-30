public class Beatle extends Participant {
    public Beatle(String name) {
        super(name);
    }

    @Override
    public void Receive(String from, String message) {
        System.out.print("To a Beatle: ");
        super.Receive(from, message);
    }
}