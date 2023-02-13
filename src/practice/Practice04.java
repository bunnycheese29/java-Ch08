package practice;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Practice04 {

  public static void main(String[] args) {
    File file = new File("c:\\windows\\system.ini");
    FileReader fr = null;
    System.out.println(file + " 파일을 읽어 출력합니다.");
    try {
      Scanner scanner = new Scanner(new FileReader("c:\\windows\\system.ini"));
      fr = new FileReader(file);
      int lineNumber = 0;
      while (scanner.hasNext()) {
        lineNumber++;
        String line = scanner.nextLine();
        System.out.printf("%4d: ", lineNumber);
        System.out.println(line);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
