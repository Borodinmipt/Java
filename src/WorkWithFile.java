/**
 * Created by a.borodin on 06.10.2015.
 */

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WorkWithFile {


    public String FILE_NAME = "C:\\Technotrack\\Autorization\\Users.txt";
    public Charset ENCODING = StandardCharsets.UTF_8;


    void readLargerTextFileAlternate(String aFileName) throws IOException {
        Path path = Paths.get(aFileName);
        try (BufferedReader reader = Files.newBufferedReader(path, ENCODING)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                //process each line in some way
                // log(line);
            }
        }
    }

    void writeLargerTextFile(String aFileName, List<String> aLines) throws IOException {
        Path path = Paths.get(aFileName);
        try (BufferedWriter writer = Files.newBufferedWriter(path, ENCODING)) {
            for (String line : aLines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }

    void WriteUserInFile(String aFileName, User user) {//throws IOException{


        Path path = Paths.get(aFileName);
        try (BufferedWriter writer = Files.newBufferedWriter(path, ENCODING)) {
            writer.write("Name:" + user.getName() + ";" + "Password:" + user.getPass());
            writer.newLine();
        } catch (IOException e1) {
            System.out.println("ERROR");
        }
    }


    void LoadUsersFromFile(String aFileName) throws IOException {
        Path path = Paths.get(aFileName);
        try (BufferedReader reader = Files.newBufferedReader(path, ENCODING)) {
            String line = null;
            while ((line = reader.readLine()) != null) {

                //process each line in some way
                // log(line);
            }
        }
    }
}
