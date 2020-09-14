import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadTemps {

    String token1 = "";
    List<String> list = new ArrayList<String>();
    List<String> temps = new ArrayList<String>();
    String str;

    public ReadTemps() throws FileNotFoundException {
    }

    public String[] Read(Scanner inFile1) {
        while (inFile1.hasNext()) {
            // find next line
            token1 = inFile1.next();
            temps.add(token1);
        }
        inFile1.close();
        String[] tempsArray = temps.toArray(new String[0]);
        return tempsArray;
    }

//-----------------------------------------------------------------------------


    int i;
/*
    public String bufferR(BufferedReader br) throws IOException {
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }
        br.close();
       // fr.close();
        return String.valueOf(((char) i));
    }

 */


    public List<String> bufferR(BufferedReader br) throws IOException {
        while ((str = br.readLine()) != null) {
            list.add(str);
        }

        return list;
    }



}




