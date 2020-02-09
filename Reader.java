// Program takes input of strings and parses them for the values
import java.util.ArrayList;
import java.nio.file.*;

public class Reader{

  String info;
  public static void main(String[] args) throws Exception{

    String fileName = "FILE.txt";
    ArrayList<Double> listR = new ArrayList<Double>();
    ArrayList<Double> listV = new ArrayList<Double>();
    ArrayList<Double> listX = new ArrayList<Double>();

    Path path = Paths.get("./" + fileName);
    String fileContents = Files.readString(path);

    
    String[] contList = fileContents.split(",");
    String[] processingList;

    for (int i = 0; i < contList.length; i++){
      
      processingList = contList[i].split("=");
      processingList[0] = processingList[0].strip();

      if (processingList[0].equals("r")){
        listR.add(Double.parseDouble(processingList[1]));
      }

      if (processingList[0].equals("v")){
        listV.add(Double.parseDouble(processingList[1]));
      }

      if (processingList[0].equals("x")){
        listX.add(Double.parseDouble(processingList[1]));
      }

    }

    System.out.println("R:" + listR);
    System.out.println("V:" + listV);
    System.out.println("X:" + listX);

  }
}

