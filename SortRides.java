import java.util.ArrayList;
import java.util.function.IntFunction;

public class SortRides{
    private ArrayList<Integer[]> inputArray;
    int arrayIndex = 7;


    public ArrayList<Integer[]> getSortedArray(ArrayList<Integer[]> unsorted){
        this.inputArray = unsorted;
        sortGivenArray();
        return inputArray;
    }
    public SortRides(ArrayList<Integer[]> inputArray){
        this.inputArray = inputArray;


    }

    public void sortGivenArray(){
        divide(0,this.inputArray.size()-1);
    }
    public void divide(int startIndex, int endIndex){
        if(startIndex<endIndex && (endIndex-startIndex)>= 1){
            int mid = (endIndex+startIndex)/2;
            divide(startIndex,mid);
            divide(mid+1,endIndex);

            merger(startIndex,mid,endIndex);
        }
    }
    public void merger(int startIndex,int midIndex,int endIndex){



        ArrayList<Integer[]> mergedSortedArray = new ArrayList<Integer[]>();

        int leftIndex = startIndex;
        int rightIndex = midIndex+1;

        while(leftIndex <= midIndex && rightIndex <= endIndex){
            if(inputArray.get(leftIndex)[arrayIndex]<=inputArray.get(rightIndex)[arrayIndex]){
                mergedSortedArray.add(inputArray.get(leftIndex));
                leftIndex++;
            }else{
                mergedSortedArray.add(inputArray.get(rightIndex));
                rightIndex++;
            }
        }
        int i = 0;
        int j = startIndex;

        while(i<mergedSortedArray.size()){
            inputArray.set(j,mergedSortedArray.get(i++));
            j++;
        }

    }



}



