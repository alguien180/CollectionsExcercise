package Queues.LinkedList;

import java.util.LinkedList;

public class LinkedListExample2 {

        public static void main(String[] args) {


            LinkedList<String> letters = new LinkedList<>();

            // adding elements to the top of the stack
            letters.add("A");
            letters.add("B");
            letters.add("C");
            letters.add("D");
//display contents of linked list
            System.out.println("Linked list : " + letters);
//display size of the linked list
            System.out.println("Queue size: " + letters.size());

            //Using a while loop to remove (pop) elements from stack display them
            //display the empty stck when it is
            while (!letters.isEmpty()) {
                System.out.println(letters.removeFirst());
            }
            System.out.println("Linked list : " + letters);

            //Stacks are FIFO slide 24

        }
    }
