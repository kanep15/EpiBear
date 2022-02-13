
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

        for (int i = 0; i < fleetSize; i++) {   //Set up a fleet of cars
            Car car = new Car();
            car.carNumber = i;
        }

        for (int i = 1; i < data.size(); i++) { //i = 1 to skip the first row.
            int currentTime = i - 1;
            String currentData = (String) data.get(i);
            String[] processData = currentData.split(" ");

            int startRow = Integer.parseInt(processData[0]);
            int startColumn = Integer.parseInt(processData[1]);
            int finishRow = Integer.parseInt(processData[2]);
            int finishColumn = Integer.parseInt(processData[3]);
            int start = Integer.parseInt(processData[4]);
            int finish = Integer.parseInt(processData[5]);

            int timeRequierd = timeRequ(startRow, finishRow, startColumn, finishColumn);

            //need a way of working out the cars distance to start location, and add it to the time requiered for the ride


        }
    }
    private static int timeRequ(int startRow, int finishRow, int startColumn, int finishColumn) {
        return (finishRow - startRow) + (finishColumn - startColumn);
    }
}

