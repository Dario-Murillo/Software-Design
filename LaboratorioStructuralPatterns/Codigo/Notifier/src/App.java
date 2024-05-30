import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String message;
        var logAnalyze = new LogAnalyzer(new Notifier());
        do {
            System.out.print("Enter a string (type 'exit' to finish): ");
            message = scanner.nextLine();
            if (!message.equals("exit")) {
                logAnalyze.AnalyzeMessage(message);
            }
        } while (!message.equals("exit"));
        scanner.close();
    }
}
