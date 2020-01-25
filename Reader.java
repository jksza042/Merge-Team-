// Program takes input of strings and parses them for the values
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Reader{
  String info;
  public static void main(String[] args) throws Exception
  {
    String parsing = "";
    ArrayList<Double> r = new ArrayList<>();
    ArrayList<Double> v = new ArrayList<>();
    ArrayList<Double> x = new ArrayList<>();
    File file = new File("/Users/alexismayers/Desktop/FILE.txt");
    Scanner s = new Scanner(file);
    char[] line;
    char c;
    double addedValue;
    while (s.hasNextLine())
      parsing = s.nextLine();
      //System.out.println(parsing);
      line = parsing.toCharArray();
      for (int i = 0;i < line.length;i++) {
        c = line[i];
        if (c=='r'||c=='v'||c=='x') {
          addedValue = (double)(line[i+2] + line[i+3] + line[i+4]);
          if (c=='r'){
          r.add(addedValue);
          }
          else if (c == 'v'){
          v.add(addedValue);
          }
          else{
          x.add(addedValue);
          }
        }
      }
      //System.out.println(x);
    }

}

