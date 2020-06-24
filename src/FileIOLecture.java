import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileIOLecture {

    public static void main(String[] args) {
        Path myDirectory = Paths.get("src");
        Path myFile = Paths.get("src","Dish.java");
        Path myGitignore = Paths.get(".gitignore");

        //finding files that exists or do not exists

        System.out.println(Files.exists(myDirectory));
        System.out.println(Files.exists(myFile));
        System.out.println(Files.exists(myGitignore));

        String directory = "test";
        Path myTest = Paths.get(directory); //be specific where you want directory
        //adds directory


        Path helloFile = Paths.get(directory, "hello.txt");
        //add file in said directory

        if(Files.notExists(myTest)){
            try {
                Files.createDirectory(myTest); //creates directory
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(Files.notExists(helloFile)) {
            try {
                Files.createFile(helloFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //Writing to hello.text
      //

        List<String> students = new ArrayList<>();
        students.add("Laura");
        students.add("Andrew");
        students.add("Mark");
        students.add("Aaron");
        students.add("Jay");
        try {
            Files.write(helloFile, students); //two parameters
        } catch (IOException e) {
            e.printStackTrace();
        }

        //first read all lines - assuming we don't have a copy r know what is inside that list

        try {
            List<String> myStudents = Files.readAllLines(helloFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        List<String> newClass = new ArrayList<>



    }
}
