public class Participant {
    private Chatroom chatroom;
    private String name;

    // Constructor
    public Participant(String name) {
        this.name = name;
    }

    // Gets participant name
    public String getName() {
        return name;
    }

    // Gets chatroom
    public Chatroom getChatroom() {
        return chatroom;
    }

    // Sets chatroom
    public void setChatroom(Chatroom chatroom) {
        this.chatroom = chatroom;
    }

    // Sends message to given participant
    public void Send(String to, String message) {
        chatroom.Send(name, to, message);
    }

    // Receives message from given participant
    public void Receive(String from, String message) {
        System.out.printf("%s to %s: '%s'\n", from, name, message);
    }
}