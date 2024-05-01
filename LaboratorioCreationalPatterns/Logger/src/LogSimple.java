// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.PrintWriter;

// public class LogSimple implements ILog {
//     private static final String ArchivoDeLog = "C:\\Temp\\Log.txt";

//     public void writeMessage(String message) {
//         try {
//             var writer = new PrintWriter(new FileWriter(ArchivoDeLog, true));
//             writer.println(java.time.LocalDateTime.now() + " " + message);
//             writer.flush();
//             writer.close();
//             System.out.println("File write complete.");
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     @Override
//     public void close() throws Exception {
//         
//         throw new UnsupportedOperationException("Unimplemented method 'close'");
//     }    
// }

