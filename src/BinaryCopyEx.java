import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopyEx {

  public static void main(String[] args) {
    File src = new File("C:\\Windows\\Web\\Wallpaper\\ThemeD\\img34.jpg");
    File destination = new File("c:\\Temp\\copy.jpg");
    int c;
    try {
      FileInputStream fi = new FileInputStream(src);
      FileOutputStream fo = new FileOutputStream(destination);
      byte buffer[] = new byte[1024 * 10]; //10kb
      while (true) {
        int n = fi.read(buffer);
        fo.write(buffer, 0, n);
        if (n < buffer.length) break;
      }
      fi.close();
      fo.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
