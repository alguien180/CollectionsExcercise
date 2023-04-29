public class CellCollectionDriver {
    public static void main (String [] args){
        CellCollection cells = new CellCollection(5);

        //2 empty cell objects are added to the "cells" collection

        cells.add(new Cell());
        cells.add(new Cell());
//we can see they are populated with nulls
        System.out.println(cells.get(0));
        System.out.println(cells.get(1));
        //we assign String values to each and print them again
        cells.get(0).setValue("First Cell");
        cells.get(1).setValue("Second Cell");

        System.out.println(cells.get(0));
        System.out.println(cells.get(1));
    }
}
