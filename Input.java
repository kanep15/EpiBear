
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileReader;
import java.io.BufferedReader;

public class Input {
    public static void main(String[] args){
        Data();
    }
    public static BufferedReader Data() {
        BufferedReader data = null;
        try {
            data = new BufferedReader(new FileReader("b_should_be_easy.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        }
        return data;
    }
}
