public class CellCollection {
    /*This class is a simple data structure to
    * store multiple cell occurrences */
    //Holds an array of cell objects
    Cell[] cells;
    int index=0;

    // Constructor to generate a new object of the input size
    public CellCollection(int size){
        cells = new Cell[size];
    }

    //Method that adds the latest cell object to the next empty location in Cell[]
    public void add(Cell c){
        cells[index]=c;
        index++;
    }
    //Retrieves the cell object in the input position
    public Cell get(int i){
        return cells[i];
    }

}