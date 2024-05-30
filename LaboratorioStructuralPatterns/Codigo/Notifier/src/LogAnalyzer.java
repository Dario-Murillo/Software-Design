public class LogAnalyzer {
    private Notifier notifier;

    public LogAnalyzer(Notifier notifier) {
        this.notifier = notifier;
    }

    public void AnalyzeMessage(String message){
        if (message.toLowerCase().contains("error")){
            notifier.send("The following message was reported as error: " + message);
        }
    }
}
