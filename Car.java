public class Car {
    private int currentRow;
    private int currentColumn;
    private int carNumber;
    private int timeLockedUntil;

    public Car(int number) {
        currentRow = 0;
        currentColumn = 0;
        carNumber = number;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCurrentRow(int row) {
        this.currentRow = row;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentColumn(int column) {
        this.currentColumn = column;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setTimeLockedUntil(int time) {
        this.timeLockedUntil = time;
    }

    public int getTimeLockedUntil() {
        return timeLockedUntil;
    }
}
