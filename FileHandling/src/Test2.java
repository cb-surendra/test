import java.io.*;
import java.util.Scanner;

public class Test2 {
    public void show() throws IOException {

        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("src/xanadu.txt")));

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}