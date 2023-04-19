package sg.edu.nus.iss;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
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
            System.out.println(dirPath + " exists.");
        }else{
            newDirectory.mkdir();
            System.out.println("Directory has been created.");
        }

        //check if file exists in directory
        //if doesnt exist, create the file

        File fileData = new File (dirPathFileName);
        if (fileData.exists()){
            System.out.println(dirPathFileName + " exists.");
        }else{
            fileData.createNewFile();
            
        }

        //type this in terminal:
        //c:\Users\tanye\OneDrive\Documents\Software Development Fundamentals\Day Three\day03_sdflecture\src\main\java\sg\edu\nus\iss>java sg.edu.nus.iss/App "c:\data" myfile.txt


        //writing into file
        String content = "I will like to go home early."; //sentence to write into file (this is input)
        String content2 = "I will like to go home now.";
        FileWriter fw = new FileWriter(dirPathFileName, true); //if write multiple times true = add on instead of replacing words in file
        fw.write(content);
        fw.write("\n");
        fw.write(content2);
        fw.flush();
        fw.close(); //to release memory


        //decorator pattern; another example to write to a file
        String content3 = "A quick brown fox jumps over the wall.\n";
        FileWriter fw2 = new FileWriter(dirPathFileName, true);
        BufferedWriter bw = new BufferedWriter(fw2);
        bw.append(content3); //take whole string and write char by char in buffer and put in file
        bw.flush();
        bw.close();//close bufferwriter
        bw.close();//close filewriter


        //another exmaple
        String content4 = "It is good to buy a macbook with 32gb for your devlopment.\n";
        FileOutputStream fos = new FileOutputStream(dirPathFileName, true); 
        byte[] byteContent = content4.getBytes(); //convert string to byte cos they can only take in BYTE ARRAY args
        fos.write(byteContent);
        fos.flush();
        fos.close();

        //another example - with decorator pattern
        String content5 = "I am going to buy Apple Air Tag this weekend.\n";
        FileOutputStream fos2 = new FileOutputStream(dirPathFileName, true);
        DataOutputStream dos2 = new DataOutputStream(fos2);
        dos2.writeBytes(content5);
        dos2.flush();
        dos2.close();
        dos2.close();



    }
}
