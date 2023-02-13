import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class FileReaderHangul {

  public static void main(String[] args) {
    InputStreamReader in = null;
    FileInputStream fin = null;
    try {
      fin = new FileInputStream("c:\\Temp\\hangul.txt");
      in = new InputStreamReader(fin, "utf-8");
      System.out.println(in.getEncoding());
      int c;
      while ((c = in.read()) != -1) {
        System.out.print((char) c);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
