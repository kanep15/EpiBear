//filter out any impossible rides and return a new array?
//Input the file array?

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;



public class InitialProcessing {
    public static ArrayList main() {

        //Uncomment the file your working with

        //String fileName = "a_example.txt";
        String fileName = "b_should_be_easy.txt";

        File data = new File(fileName);
        return filter(data);
    }

    private static ArrayList filter(File file) {
        ArrayList filteredArray = new ArrayList();
        ArrayList<Integer[]> intArray = new ArrayList<Integer[]>();

        try {
            Scanner scanner = new Scanner(file);
            //filteredArray.add(scanner.nextLine());//Always add the first line

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splitLine = line.split(" ");

                int startRow = 0;
                int startColumn = 0;
                int finishRow = 0;
                int finishColumn = 0;
                int earliestStart = 0;
                int latestFinish = 0;
                Integer[] bucket = new Integer[0];

                try {
                    startRow = Integer.parseInt(splitLine[0]);
                    startColumn = Integer.parseInt(splitLine[1]);
                    finishRow = Integer.parseInt(splitLine[2]);
                    finishColumn = Integer.parseInt(splitLine[3]);
                    earliestStart = Integer.parseInt(splitLine[4]);
                    latestFinish = Integer.parseInt(splitLine[5]);




                } catch (NumberFormatException e) {
                    System.out.println("Int conversion");
                    e.printStackTrace();
                }

                int timeRequired = (finishRow - startRow) + (finishColumn - startColumn);
                int timeGiven = latestFinish - earliestStart;

                if (timeRequired > timeGiven) {
                    //do nothing
                } else {
                    //filteredArray.add(line);
                    intArray.add(new Integer[]{startRow,startColumn,finishRow,finishColumn,earliestStart,latestFinish});
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        }
        //return filteredArray;
        return intArray;
    }
}
