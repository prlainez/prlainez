// you may use this file to wrote and run code to test your MyArrayList class

import java.util.*;
import java.lang.*;

public class Main {
   public static void main(String[] args) {
      
      MyArrayList myList = new MyArrayList();

      // Adding Elements
      myList.append(1);
      myList.append(2);
      myList.append(3);
      System.out.printf("ArrayList Size => %d\n", myList.getSize());

      // Fetching Elements
      Object objectFound = myList.getAt(1);
      System.out.printf("ArrayList Element => %d\n", objectFound);

      // Removing Elements
      myList.removeAt(1);
      System.out.printf("ArrayList Size => %d\n", myList.getSize());
   }
}