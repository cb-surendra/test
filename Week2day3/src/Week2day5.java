import org.json.simple.JSONObject;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Week2day5 {
    public void show() throws IOException {
        System.out.println("Hello World!");
        BufferedReader in = null;
        PrintWriter out = null;

        List<String> listData = new ArrayList<String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/input.csv"));
            out = new PrintWriter(new FileWriter("src/output.csv"));


            String headlines = "Customer Id\tSubscription Id\tInvoice Id\tInvoice Date\tStart Date\tAmount\tStatus\tPaid On\tNext Retry\tRefunded Amount\tRecurring\tFirst Invoice\tTax Total\tCustomer Details\t";

            out.println(headlines);
            /*String line = "";
            while ( (line = br.readLine()) != null){


                String[] arg = line.split(",");
                JSONObject object = new JSONObject();
                object.put( "FirstName", arg[12]);
                object.put( "LastName", arg[13]);
                object.put( "Email", arg[14]);
                object.put("Company", arg[15]);

                String str = "";
                str = arg[0];
                str += arg[1];str += arg[2];str += arg[3];str += arg[4];str += arg[5];
                str += arg[6];str += arg[7];str += arg[8];str += arg[9];str += arg[10];
                str += arg[11];str += arg[16];

                str += object.toString();

                out.print( str );
            }

             */
            String res = "Sub_001\t";
            res += "Inv_001\t";
            res += "2015-05-25T10:55:22.820Z\t";
            res += "2015-05-25T10:55:22.820Z\t";
            res += "1025\t";
            res += "Paid\t";
            res += "2015-05-25T10:55:22.820Z\t";
            res += "56\t";
            res += "TRUE\t";
            res += "FALSE\t";
            res += "125\t";
            JSONObject obj = new JSONObject();
            obj.put("FirstName", "John");
            obj.put("LastName", "Doe");
            obj.put("Email", "john@test.com");
            obj.put("Company", "My BigCamp");

            out.print( res += obj.toString() );
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
