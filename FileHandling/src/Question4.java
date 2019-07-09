import java.io.*;
import java.util.Scanner;

import static java.lang.Character.isLetter;

public class Question4 {

    public void func1() throws IOException, FileNotFoundException
    {
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader("src/xanadu.txt")));
            out = new PrintWriter( new FileWriter("src/result3.txt"));

            int lineNo = 1;

            String word = "man";
            while( scanner.hasNext() ){

                String str = scanner.nextLine();

                boolean flag = true;
                int startInd = str.indexOf(word, 0);

                while(startInd != -1 && startInd < word.length()) {
                    if(flag){
                        System.out.print(lineNo);
                    }
                    System.out.println(" " + startInd + " " + (startInd+word.length()+1));
                    startInd = startInd + word.length();
                    flag = false;
                }
                lineNo++;
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
