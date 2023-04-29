import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//there are 3 main interface collections: 1. List    2. Set    3. Queue
//in this section. Using collectibles the object
public class Students implements Comparable<Students> {
    private String firstName;
    private String lastName;
    private int mark;

    public static void main(String[] args) {
        //Create ArrayList student names,
        ArrayList<String> studentNames = new ArrayList<>();
        //add some,
        addStudents(studentNames);
       //Display them
        displayStudents(studentNames); //
        //sort them and display the result
        Collections.sort(studentNames);
        displayStudents(studentNames);

        System.out.println("\n\nThe following is using the Students object \n");
        //Create object studentsAsObject
        ArrayList<Students> studentsAsObject = new ArrayList<>();

        //Add some
        studentsAsObject.add(new Students("Marcus", "Ramirez", 95));
        studentsAsObject.add(new Students("Selene", "Cruz", 85));
        studentsAsObject.add(new Students("Joerg", "Balluff", 70));

        //display them
        System.out.println("\n\nbefore sorting");
        displayStudentsAsObject(studentsAsObject);

        // sort them and display the result
        Collections.sort(studentsAsObject);
        System.out.println("\n\nafter sorting");
        displayStudentsAsObject(studentsAsObject);
    }


    public static void addStudents(ArrayList<String> students) {
        students.add("Bob");
        students.add("Ryan");
        students.add("Raul");
    }

    static void displayStudents(ArrayList<String> studentNames) {
        for (String student : studentNames)
            System.out.println("Student name: " + student);
    }


    public Students(String firstName, String lastName, int mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String toString() {
        return "Student Details: " + firstName
                + " " + lastName + " " + mark;
    }
/*
    //if you wanted to sort by name
    @Override
    public int compareTo(Students student) {
        if(lastName.compareTo(student.getLastName())<0){
            return -1;
        }if(lastName.compareTo(student.getLastName())==0){
            return 0;
        }
        return 1;
    }*/

    /*if you wanted to sort by grade
because primitives cannot be used for compare to. before this an Integer instance must be creted
     based on the value of the primitive with "valueOf" */
    @Override
    public int compareTo(Students student) {
        if (Integer.valueOf(mark).compareTo(student.getMark()) < 0) {
            return -1;
        }
        if (Integer.valueOf(mark).compareTo(student.getMark()) == 0) {
            return 0;
        }
        return 1;
    }


    static void displayStudentsAsObject(ArrayList<Students> studentObject){
        for(Students student : studentObject){
            System.out.println(student);
        }
    }
}