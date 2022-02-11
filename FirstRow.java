import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FirstRow {
    int rowNum;
    int colNum;
    int fleetSize;
    int ridesNum;
    int bonus;
    int time;

    private ArrayList firstRow() {

        ArrayList row = new ArrayList();

        try {
            File data = new File("b_should_be_easy.txt");
            Scanner scanner = new Scanner(data);
            String firstLine = scanner.nextLine();
            String[] splitLine = firstLine.split(" ");

            try {
                rowNum = Integer.parseInt(splitLine[0]);
                colNum = Integer.parseInt(splitLine[1]);
                fleetSize = Integer.parseInt(splitLine[2]);
                ridesNum = Integer.parseInt(splitLine[3]);
                bonus = Integer.parseInt(splitLine[4]);
                time = Integer.parseInt(splitLine[5]);

                row.add(rowNum);
                row.add(colNum);
                row.add(fleetSize);
                row.add(ridesNum);
                row.add(bonus);
                row.add(time);

            } catch (NumberFormatException e) {
                System.out.println("Int conversion");
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        }
        return row;
    }
}
