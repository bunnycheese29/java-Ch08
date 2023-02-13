package practice;

import java.io.File;
import java.io.FileReader;

public class Practice03 {

  public static void main(String[] args) {
    FileReader fr = null;
    File file = new File("c:\\windows\\system.ini");
    try {
      fr = new FileReader(file);
      while (true) {
        int c = fr.read();
        c = Character.toUpperCase(c);
        if (c == -1) break;
        System.out.print((char) c);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
