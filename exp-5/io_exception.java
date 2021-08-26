import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadFile {

  ReadFile(String fileName) {
    this.fileName = fileName;
  }

  String fileName;

  void read() {
    try {
      File content = new File(this.fileName);
      Scanner reader = new Scanner(content);
      while (reader.hasNextLine()) {
        String data = reader.nextLine();
        System.out.println(data);
      }
      reader.close();
    } catch (FileNotFoundException e) {
      System.out.println(this.fileName + " couldn't be found");
    }
  }
}

class Main {

  public static void main(String[] args) {
      ReadFile readFile = new ReadFile("text.txt");
      readFile.read();
  }
}
