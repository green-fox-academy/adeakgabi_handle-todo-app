import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Tasks {


    public static void getMyFile (String pathOfFile){
        try{
            Path filePath = Paths.get(pathOfFile);
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println("File not found");
        }
    }
}
