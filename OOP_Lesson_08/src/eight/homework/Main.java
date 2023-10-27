package eight.homework;

import java.lang.reflect.Field;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Cat cat1 = new Cat("Luska", 8);
    Cat cat2 = new Cat("Luska", 8);

    System.out.println(cat1);
    System.out.println(cat2);

    System.out.println(cat1 == cat2);
    System.out.println(cat1.equals(cat2));

    System.out.println(cat1.hashCode());
    System.out.println(cat2.hashCode());

    Cat cat3 = null;

    try {
      cat3 = cat1.clone();
    } catch (CloneNotSupportedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    System.out.println(cat3);

    System.out.println(cat3 == cat1);

    Class catClass = Cat.class;// cat1.getClass();

    Field[] catFields = catClass.getDeclaredFields();

    for (int i = 0; i < catFields.length; i++) {
      System.out.println(catFields[i]);
    }
    
    try {
      Field catAge = catClass.getDeclaredField("age");
      catAge.setAccessible(true);
      catAge.setInt(cat1, 12);
    } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    
    System.out.println(cat1);

  }

}
