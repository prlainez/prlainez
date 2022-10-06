// you may use this file to wrote and run code to test your MyArrayList class

import java.util.*;
import java.lang.*;

public class Main {
   public static void main(String[] args) {
      
      MyArrayList myList = new MyArrayList();

      // Adding Elements
      myList.append(100);
      myList.append(200);
      myList.append(300);
      myList.append(400);
      myList.append(500);
      myList.append(600);
      myList.append(700);
      myList.append(800);
      myList.append(900);
      myList.append(1000);
      myList.print();
      System.out.printf("ArrayList Size => %d\n", myList.getSize());

      // Fetching Elements
      Object objectFound = myList.getAt(1);
      System.out.printf("ArrayList Element => %d\n", objectFound);

      // Removing Elements
      myList.removeAt(1);
      myList.print();
      System.out.printf("ArrayList Size => %d\n", myList.getSize());

      // Inserting Elements
      myList.insertAt(1, 999);
      myList.insertAt(2, 888);
      myList.print();
      System.out.printf("ArrayList Size => %d\n", myList.getSize());

      // Make capacity call
      myList.makeCapacity(10);
      myList.print();
      System.out.printf("ArrayList Size => %d\n", myList.getSize());

      // Trim Excess
      myList.trimExcess();
      myList.print();
      System.out.printf("ArrayList Size => %d\n", myList.getSize());


   }
}