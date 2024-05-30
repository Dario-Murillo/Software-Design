import java.util.HashMap;
import java.util.Map;

public class Chatroom extends AbstractChatroom {
    private Map<String, Participant> participants = new HashMap<>();

    @Override
    public void Register(Participant participant) {
        if (!participants.containsValue(participant)) {
            participants.put(participant.getName(), participant);
        }
        participant.setChatroom(this);
    }

    @Override
    public void Send(String from, String to, String message) {
        Participant participant = participants.get(to);
        if (participant != null) {
            participant.Receive(from, message);
        }
    }
}

