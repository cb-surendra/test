import java.io.*;
import java.util.Scanner;

import static java.lang.Character.isLetter;

public class Question3 {
    public void func1() throws IOException, FileNotFoundException
    {
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader("src/xanadu.txt")));
            out = new PrintWriter( new FileWriter("src/result3.txt"));

            int[] a = new int[26];
            for(int i = 0; i < 26; i++){
                a[i] = 0;
            }
            while ( scanner.hasNext()) {
                String temp = scanner.next().toLowerCase();
                for(int i = 0; i < temp.length(); i++){
                    if( isLetter(temp.charAt(i)) )
                        a[temp.charAt(i)-'a']++;
                }
            }

            for(int i = 0; i < 26; i++){
                System.out.print(a[i] + " ");
                if(a[i] > 0){
                    out.print( (char)('a'+i) );
                    out.print(':');
                    out.println(a[i]);
                }
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
