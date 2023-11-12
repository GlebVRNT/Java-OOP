package eleventh.homework;

import java.io.File;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
//    String spec = "https://dou.ua/";
//
//    String html = "";
//
//    try {
//      html = NetworkService.getStringFromURL(spec, "UTF-8");
//    } catch (IOException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
//
//    System.out.println(html);

    String spec = "https://s.dou.ua/maxi-headers/DOU-flexible-2023.jpg";

    File folder = new File("ABC");
    folder.mkdirs();

    try {
      System.out.println(NetworkService.getFileFromURL(spec, folder));
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}