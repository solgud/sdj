package main;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
//    ArrayList<String> strings = new ArrayList<String>();
    utility.collection.ArrayList<String> test = new utility.collection.ArrayList<String>();

    test.add(0, "first");
    test.add(1, "second");
    test.add(2, "fourth");
    test.add(3, "fifth");
    test.add(2, "third");
    test.add("sixth");
    
    System.out.println(test.indexOf("second"));
    System.out.println(test.toString());
    
    test.remove(2);
    
    System.out.println(test.toString());
  }

}
