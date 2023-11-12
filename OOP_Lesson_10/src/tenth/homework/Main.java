package tenth.homework;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {

  public static void main(String[] args) {

    List<Integer> listNumbers = new ArrayList<>();
    Random rn = new Random();

    for (int i = 0; i < 15; i++) {
      listNumbers.add(rn.nextInt(10));
    }

    System.out.println(listNumbers);

    Map<Integer, Integer> stat = new HashMap<>();

    for (Integer number : listNumbers) {
      stat.put(number, stat.getOrDefault(number, 0) + 1);
    }
    System.out.println(stat);
  }
}