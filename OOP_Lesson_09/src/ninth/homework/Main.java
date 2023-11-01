package ninth.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<String> list1 = new ArrayList<>();

    list1.add("Hello");
    list1.add("world");

    System.out.println(list1);

    list1.add(1, "our");

    System.out.println(list1);

    list1.remove(1);

    System.out.println(list1);

    String temp = list1.get(0);

    System.out.println(temp);

    System.out.println();

    for (String element : list1) {
      System.out.println(element);
    }

    System.out.println();

    Iterator<String> itr = list1.iterator();
    for (; itr.hasNext();) {
      String element = itr.next();
      System.out.println(element);
    }

  }
}
