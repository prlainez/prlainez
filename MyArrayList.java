// Complete the implementation of your MyArrayList class in this file
import java.util.*;
import java.io.*;

public class MyArrayList implements MyList {
    // Implement the required fields and methods here
    // a private field named currentCapacity of type int, initialized to 8
    // a private field named size of type int, initialized to 0
    // a private field named storage of type Object[], initialized to an Object array of 8 elements
    private int currentCapacity = 8;
    private int size = 0;
    private Object[] array = new Object[8];
   /*
    a public method named append that takes an Object argument and returns nothing
    a public method named insertAt that takes an int argument and an Object argument and returns nothing
    a public method named removeAt that takes an int arguments and returns nothing
    a public method named getAt that takes an int argument and returns an Object
    a public method named getSize that takes no arguments and returns an int
    a public method named makeCapacity that takes an int argument and returns nothing
    a public method named trimExcess that takes no arguments and returns nothing
   */
  
    public void append(Object o){
       array.add(o);// is it the array or the MyList implemented??
    }
    
    public void insertAt(int index, Object o){
    }
    
    public void removeAt(int index){
       array.remove(index);// is it the array or the MyList implemented??
    }
    
    public Object getAt(int index){
      return o;
    }
    
    public int getSize(){
      return index;
    }
    
    public void makeCapacity (int minCapacity){
      if(minCapacity < size || minCapacity == currentCapacity){
      } else if(minCapacity>8){
         currentCapacity = minCapacity;
      } else{
         currentCapacity = 8;
      }
         
    }
    
    public void trimExcess(){
      makeCapacity(size);
    }

   
    // Do not alter the code below 
    @Override
    public MyListIterator getIterator() {
        return new MyArrayListIterator();
    }
    
    private class MyArrayListIterator implements MyListIterator {
        int currentIndex = -1;

        @Override
        public Object next() {
            ++currentIndex;
            return storage[currentIndex];
        }

        @Override
        public boolean hasNext() {
            return currentIndex < size - 1;
        }
    }   
}