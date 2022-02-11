
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList data = InitialProcessing.main();

        String firstRow = (String) data.get(0);
        String[] processStats = firstRow.split(" ");

        int rowNumber = Integer.parseInt(processStats[0]);
        int columnNumber = Integer.parseInt(processStats[1]);
        int fleetSize = Integer.parseInt(processStats[2]);
        int numRides = Integer.parseInt(processStats[3]);
        int bonus = Integer.parseInt(processStats[4]);
        int time = Integer.parseInt(processStats[5]);

        for (int i = 1; i < data.size(); i++) { //i = 1 to skip the first row.
            System.out.println(data.get(i));

            int currentTime = i - 1;

        }
    }
}
