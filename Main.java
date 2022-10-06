// you may use this file to wrote and run code to test your MyArrayList class
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

      // Fetching Elements
      Object objectFound = myList.getAt(1);
      System.out.printf("ArrayList Element => %d\n", objectFound);
      Object objectFound2 = myList.getAt(7);
      System.out.printf("ArrayList Element => %d\n", objectFound2);

      // Removing Elements
      myList.removeAt(1);
      myList.print();
      myList.removeAt(5);
      myList.print();

      // Inserting Elements
      myList.insertAt(1, 999);
      myList.insertAt(9, 888);
      myList.print();

      // Trim Excess
      myList.trimExcess();
      myList.print();
   }
}