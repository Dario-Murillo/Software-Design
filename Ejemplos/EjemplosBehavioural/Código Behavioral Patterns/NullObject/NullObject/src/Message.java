public class Message {
    private String message;
    private PriorityEnum priority;

    public Message(String message, PriorityEnum priority) {
        this.message = message;
        this.priority = priority;
    }
    public Message(String message) {
        this.message = message;
    }

    public PriorityEnum getPriority() {
        return priority;
    }

    public void setPriority(PriorityEnum priority) {
        this.priority = priority;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
