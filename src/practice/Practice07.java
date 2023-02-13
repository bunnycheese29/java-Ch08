package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Practice07 {

  public static void main(String[] args) {
    File src = new File("a.jpg");
    File destination = new File("b.jpg");
    try {
      FileInputStream fi = new FileInputStream(src);
      FileOutputStream fo = new FileOutputStream(destination);

      System.out.println(
        src.getPath() + "를 " + destination.getPath() + "로 복사합니다."
      );
      System.out.println("10%마다 *를 출력합니다.");
      byte buffer[] = new byte[1024 * 10];
      while (true) {
        int n = fi.read(buffer);
        fo.write(buffer, 0, n);
        if (n < buffer.length) break;
        System.out.println("*");
      }
      fi.close();
      fo.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
