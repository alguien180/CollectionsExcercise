import java.util.*;
//there are 3 main interface collections: 1. Set    2. List    3. Queue
// this determined which methods can be used
public class CellGenericCollection<T> {
    T[] cells;
    int index=0;

    //Since we cannot create generic arrays in java we must
   /* public CellGenericCollection(int size){
        cells = new T[size];
    }*/

    public void add (T c){
        cells[index]=c;
        index++;
    }
    public T get(int i){
        return cells[i];
    }

}
