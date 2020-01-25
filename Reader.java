// Program takes input of strings and parses them for the values
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Reader{
  String info;
  public static void main(String[] args) throws Exception
  {
    List<String[][]> list = new ArrayList<String[]>();
    File file = new File("/Users/alexismayers/Desktop/FILE.txt");
    Scanner s = new Scanner(file);

    while (s.hasNextLine())
      System.out.println(s.nextLine());

    }


}

