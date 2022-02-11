
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Input {
    public static void main(String[] args){
        ArrayList problemStats = FirstRow.Row();
        ArrayList data = Filter.main();

        Object rowNum = problemStats.get(0);
        Object colNum = problemStats.get(1);
        Object fleetSize = problemStats.get(2);
        Object ridesNum = problemStats.get(3);
        Object bonus = problemStats.get(4);
        Object time = problemStats.get(5);

        for (int i = 1; i < data.size(); i++) { //i = 1 to skip the first row.
            System.out.println(data.get(i));
        }
    }
}
