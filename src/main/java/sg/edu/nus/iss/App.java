package sg.edu.nus.iss;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {

        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) { //to loop through the argument

                System.out.println("Argument " + i + ": " + args[i]);
            }

        } else {
            System.out.println("You did not pass in arguments");
        }

        String dirPath = args[0];
        String fileName = args[1];
        String dirPathFileName = dirPath + File.separator + fileName;
        //Use file object to check if dir exists
        //create dir if it doesnt exist
        //Slide 3
        File newDirectory = new File(dirPath);
        if(newDirectory.exists()){
            System.out.println("The directory exists.");
        }else{
            newDirectory.mkdir();
            System.out.println("Directory has been created.");
        }

        //check if file exists in directory
        //if doesnt exist, create the file

        File fileData = new File (dirPathFileName);
        if (fileData.exists()){
            System.out.println("The file exists.");
        }else{
            fileData.createNewFile();
            
        }

    }
}
