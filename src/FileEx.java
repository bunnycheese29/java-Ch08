import java.io.File;

public class FileEx {

  public static void main(String[] args) {
    File file = new File("c:\\Windows\\system.ini");
    System.out.println(file.getPath()); //파일 경로
    System.out.println(file.getParent()); //부모 경로
    System.out.println(file.getName()); //파일명

    if (file.isFile()) { //파일 타입인지 검사
      System.out.println("파일입니다.");
    } else {
      System.out.println("디렉토리입니다.");
    }

    File file02 = new File("c:\\Temp\\java"); //새로 만들고자 하는 디렉토리
    if (!file02.exists()) { //file02 디렉토리가 존재하는지 검사
      file02.mkdir(); //존재하지 않으면 디렉토리 생성
    }

    File file03 = new File("c:\\Temp");
    File subFiles[] = file03.listFiles();
    for (int i = 0; i < subFiles.length; i++) {
      File f = subFiles[i];
      System.out.println(f.getName());
      System.out.println(f.isFile() ? "파일" : "폴더");
    }
  }
}
