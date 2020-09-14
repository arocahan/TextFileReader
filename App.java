import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class App {

    public static void main(String[] args) throws IOException {

        ReadTemps primerintento = new ReadTemps();



        //One way to read the document
/*        Scanner inFile1 = new Scanner(new File("C:\\Users\\CHARROC\\Desktop\\20200826.log")).useDelimiter("2020.08.26");

        for (String s : primerintento.Read(inFile1)) {
            System.out.println(s);
        }


 */



        //Another way to read the document
        FileReader fr=new FileReader("C:\\Users\\CHARROC\\Desktop\\20200826.log");
        BufferedReader br=new BufferedReader(fr);

        primerintento.bufferR(br);

//        System.out.println(primerintento.bufferR(br));


        //Saving every line of the Document in an Array and printing it
        String[] stringArr = (primerintento.bufferR(br)).toArray(new String[0]);

        for (String s : stringArr) {
            System.out.println(s);
        }


//------------------------------------------------------------------------------




//        JFrame f = new JFrame("Hello");
//        f.setSize(300, 300);
//        f.setVisible(true);


        ShowList lista = new ShowList(stringArr);



        int value1, value2, value3, value4, value5, value6;




        value1 = lista.executeforthechar("DATAIN");
        value2 = lista.executeforthechar("NEEDLE ALIGNING");
        value3 = lista.executeforthechar("007");
        value4 = lista.executeforthechar("702");
        value5 = lista.executeforthechar("switch and remove a cassette");

//        value6 = lista.executeforthechar("heater temp.,103");
        value6 = lista.executeforthechar("heater temp.,32");
//        value6 = lista.executeforthechar("heater temp.,38");


        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);
        System.out.println(value6);




        BarChart chart = new BarChart();

        lista.getContentPane().add(chart);

//        f.getContentPane().add(chart);




        chart.addBar(Color.ORANGE, value1);
        chart.addBar(Color.gray, value2);
        chart.addBar(Color.pink, value3);
        chart.addBar(Color.CYAN, value4);
        chart.addBar(Color.LIGHT_GRAY, value5);
        chart.addBar(Color.magenta, value6);


        lista.showValue(value2);


 //       lista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lista.pack();
        lista.setVisible(true);





    }
}
