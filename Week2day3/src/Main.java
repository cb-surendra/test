import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException{
        System.out.println("Hello World!");
        BufferedReader in = null;
        PrintWriter out = null;

        List<String> listData = new ArrayList<String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("phone.csv"));
            //out = new PrintWriter(new FileWriter("data_result.csv"));

            String line = "";

            List<PhoneDirectory> listPhone = new ArrayList<PhoneDirectory>();

            while ( (line = br.readLine()) != null){
                String[] arg = line.split(",");

                int i = 0;
                String name = "";
                String add = "";
                Integer num = 0;
                Tag t = null;
                for(String s : arg){
                    if( i == 0 ){
                        name = s;
                    }
                    else if(i == 1){
                        add = s;
                    }
                    else if(i==2){
                        num = Integer.parseInt(s);
                    }
                    else{
                        t = Tag.valueOf(s);
                    }
                    i++;
                    //System.out.print(s + " ");
                }

                Map<Integer, Tag> m = new HashMap<Integer, Tag>();
                /*Integer number = Integer.parseInt(args[2]);
                Tag t = Tag.valueOf(arg[3]);
                */

                m.put(num, t);
                PhoneDirectory p = new PhoneDirectory(name, add, m);

                listPhone.add( p );

                //out.println(list);
                // */
            }

            for( PhoneDirectory p : listPhone ){
                System.out.println( p.name + " " + p.address + " " + p.phoneNumber);
            }

        } finally {
            if (in != null) {
                in.close();
            }
            /*if (out != null) {
                out.close();
            }
             */
        }

    }
}
