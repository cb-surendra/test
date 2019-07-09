import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Question5 {
    public void func1() throws IOException, FileNotFoundException {

        BufferedReader in = null;
        PrintWriter out = null;

        List<String> listData = new ArrayList<String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/data.csv"));
            out = new PrintWriter(new FileWriter("src/data_result.csv"));

            String line = "";

            while ( (line = br.readLine()) != null){
                String[] arg = line.split(",");

                List<String> list = new ArrayList<String>();
                for(String s : arg){
                    list.add(s);
                }
                out.println(list);
            }

        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
