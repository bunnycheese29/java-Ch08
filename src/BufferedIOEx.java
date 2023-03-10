import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedIOEx {

  public static void main(String[] args) {
    FileReader fin = null;
    int c;
    try {
      fin = new FileReader("c:\\Temp\\test02.txt"); //buffer는 정해진 사이즈를 넘어야만 전송 시작 강제로 보내고 싶을 때는 flush();
      BufferedOutputStream out = new BufferedOutputStream(System.out, 20);
      while ((c = fin.read()) != -1) {
        out.write(c);
      }
      out.flush(); //다 안 차도 넘어옴
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
