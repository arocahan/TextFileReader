import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws IOException {


        TextDocumentReader objectForExample = new TextDocumentReader();


//One way to read the document.
        File document = new File("C:\\Users\\CHARROC\\Desktop\\20200826.log");
        Scanner inFile = new Scanner(document);
        Scanner inFileSeparate = inFile.useDelimiter("2020.08.26");


        for (String s : objectForExample.Read(inFileSeparate)) {
            System.out.println(s);
        }


//Another way to read the document.
        FileReader fr = new FileReader("C:\\Users\\CHARROC\\Desktop\\20200826.log");
        BufferedReader br = new BufferedReader(fr);

        objectForExample.bufferR(br);

        String[] stringArr = (objectForExample.bufferR(br)).toArray(new String[0]);  //Saving every line of the Document in an Array and printing it

        for (String s : stringArr) {
            System.out.println(s);
        }
    }
}
