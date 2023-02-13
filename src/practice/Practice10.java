package practice;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

class PhoneExplorer {

  private String fileName = "c:\\Temp\\phone.txt";
  private HashMap<String, String> phoneMap = new HashMap<>();

  private void readPhoneFile() {
    try {
      Scanner fScanner = new Scanner(new FileReader(fileName));
      while (fScanner.hasNext()) {
        String name = fScanner.next(); //이름 읽기
        String tel = fScanner.next(); //전번 읽기
        phoneMap.put(name, tel);
      }
      fScanner.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("총 " + phoneMap.size() + "개의 전화번호를 읽었습니다.");
  }

  private void processQuery() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("이름>> ");
      String name = scanner.next();
      if (name.equals("그만")) {
        break;
      }
      String tel = phoneMap.get(name);
      if (tel == null) {
        System.out.println("찾는 이름이 없습니다.");
      } else {
        System.out.println(tel);
      }
    }
  }

  public void run() {
    readPhoneFile();
    processQuery();
  }
}

public class Practice10 {

  public static void main(String[] args) {
    PhoneExplorer phoneExplorer = new PhoneExplorer();
    phoneExplorer.run();
  }
}
