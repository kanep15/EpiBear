
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Input {
    public static void main(String[] args){
        try{
            File input_file = new File("b_should_be_easy.txt");
            Scanner myScanner = new Scanner(input_file);
            while (myScanner.hasNextLine()) {
                String data = myScanner.nextLine();
                //Fuck knows what to do next, probably want an array or list not a string
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        }
    }
}
