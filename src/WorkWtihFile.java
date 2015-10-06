import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * Created by a.borodin on 06.10.2015.
 */
public class WorkWtihFile {

    public  String FILE_PATH = "C:\\Technotrack\\Autorization\\";
    public Charset ENCODING = StandardCharsets.UTF_8;

    void readLargerTextFileAlternate(String aFileName) throws IOException {
        Path path = Paths.get(aFileName);
        try (BufferedReader reader = Files.newBufferedReader(path, ENCODING)){
            String line = null;
            while ((line = reader.readLine()) != null) {
                //process each line in some way
               // log(line);
            }
        }
    }

}
