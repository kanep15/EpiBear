
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList data = InitialProcessing.main();
        ArrayList<Car> fleet = new ArrayList<Car>();
        ArrayList<Integer[]> rides = new ArrayList<Integer[]>();

        Integer[] firstRow = (Integer[]) data.get(0);


        int rowNumber = firstRow[0];
        int columnNumber = firstRow[1];
        int fleetSize = firstRow[2];
        int numRides = firstRow[3];
        int bonus = firstRow[4];
        int time =firstRow[5];

        System.out.println(firstRow[0]);

        for (int i = 0; i < fleetSize; i++) {   //Set up a fleet of cars
            Car car = new Car(i);
            fleet.add(car);
        }

        for (int i = 1; i < data.size(); i++) { //i = 1 to skip the first row.
            int currentTime = i - 1;    //I don't think this is the best way to keep time

            Integer[] processData = (Integer[]) data.get(i);
            int startRow = processData[0];
            int startColumn = processData[1];
            int finishRow = processData[2];
            int finishColumn = processData[3];
            int earliestStart = processData[4];
            int latestFinish = processData[5];
            int currentRow = startRow;
            int currentColumn = startColumn;

            int timeRequired = timeRequ(startRow, finishRow, startColumn, finishColumn);

            //need to make an array list with [rideNumber,startrow,startcol.currentrow,currentcol,endrow,endcol,earliestStart,latestFinish,timerequired]
            rides.add(new Integer[]{i,startRow,startColumn,currentRow,currentColumn,finishRow,finishColumn,earliestStart,latestFinish,timeRequired,});

            for (i = 0; i < fleetSize; i++) {

               //fleet.get(i).setCurrentRow(5);
               //System.out.println(fleet.get(i));
            }
        }
    }
    private static int timeRequ(int startRow, int finishRow, int startColumn, int finishColumn) {
        return (finishRow - startRow) + (finishColumn - startColumn);

    }


}

