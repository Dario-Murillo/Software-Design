/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveWorkReport {
    
    public static void saveToFile(String directoryPath, String fileName, String content) throws IOException {
        Path directory = Paths.get(directoryPath);
        if (!Files.exists(directory)) {
            Files.createDirectories(directory);
        }

        Path filePath = Paths.get(directoryPath, fileName);
        Files.write(filePath, content.getBytes());
    }

    // To be done..
    public static void UploadToCloud() {

    }
}
