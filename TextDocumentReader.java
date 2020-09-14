import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TextDocumentReader {

    String temp = "";
    List<String> List1 = new ArrayList<String>();

    String str;
    List<String> list2 = new ArrayList<String>();


    String[] tempsArray = new String[0];

    //Constructor
    public TextDocumentReader() throws FileNotFoundException {
    }


    //Methode to use with Scanner
    public String[] Read(Scanner inFileSeparate) {
        while (inFileSeparate.hasNext()) {
            temp = inFileSeparate.next();
            List1.add(temp);
        }
        inFileSeparate.close();
        String[] tempsArray = List1.toArray(new String[0]);
        return tempsArray;
    }


    // Methode to use with BufferedReader
    public List<String> bufferR(BufferedReader br) throws IOException {
        while ((str = br.readLine()) != null) {
            list2.add(str);
        }
        return list2;
    }
}
