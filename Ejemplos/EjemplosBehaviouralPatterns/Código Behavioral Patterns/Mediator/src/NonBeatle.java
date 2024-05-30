public class NonBeatle extends Participant {
    public NonBeatle(String name) {
        super(name);
    }

    @Override
    public void Receive(String from, String message) {
        System.out.print("To a non-Beatle: ");
        super.Receive(from, message);
    }
}