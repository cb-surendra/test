import java.io.*;
import java.util.Scanner;

import static java.lang.Character.isLetter;

public class Question4 {

    public void func1() throws IOException, FileNotFoundException
    {
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));
            out = new PrintWriter( new FileWriter("result3.txt"));

            int lineNo = 1;

            String word = "man";
            while( scanner.hasNext() ){

                String str = scanner.nextLine();

                boolean flag = true;

                /*int startInd = str.indexOf(word, 0);
                while(startInd != -1 && startInd <= word.length()) {
                    if(flag){
                        System.out.print(lineNo);
                    }
                    System.out.print(" " + startInd + " " + (startInd+word.length()+1));
                    startInd = startInd + word.length();
                    flag = false;
                }
                System.out.println();
                   */

                if( str.contains(word) ){

                    System.out.print(lineNo);
                    System.out.print(" Found at index: ");
                    int fromIndex = 0;
                    while ( (fromIndex = str.indexOf(word, fromIndex)) != -1 ){
                        System.out.print( "( Start Index : " + fromIndex + " Ending Index :" + (word.length() + fromIndex) + ") " );
                        fromIndex++;
                    }
                    System.out.println();

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
