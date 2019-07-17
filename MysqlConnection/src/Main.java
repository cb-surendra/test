import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class Main {

    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/phone_directory","root","cb-surendra");
            //here login is database name, root is username and password
            /*Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from loginDetails");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));


            String query = "select * from loginDetails";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            ResultSet rset = preparedStatement.executeQuery();
            while( rset.next() ){
                System.out.println(rset.getInt(1) + " " + rset.getString(2));
            }
            */

            String query1 = "insert into loginDetails values (?,?)";
            PreparedStatement ps = con.prepareStatement(query1);
            /*preparedStatement1.setInt(1, 125);
            preparedStatement1.setString(2, "E1");

            System.out.println( preparedStatement1.executeUpdate() );

             */
            /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            do{
                System.out.println("username:");
                int id=Integer.parseInt(br.readLine());
                System.out.println("password:");
                String pass=br.readLine();

                ps.setInt(1,id);
                ps.setString(2,pass);
                int i=ps.executeUpdate();
                System.out.println(i+" records affected");
                System.out.println("Do you want to continue: y/n");
                String s=br.readLine();
                if(s.startsWith("n")){
                    break;
                }
            }while(true);


             */

            String query = "select * from loginDetails";
            String name = "ab";
            //Retrieve the details of the person(s) matching the given name. If there are more than one person matching the given name, it should list them all.
            /*String query2 = "select userDetails.userId, userDetails.userName, phoneNumbers.phoneNumber, phoneNumbers.tag from userDetails " +
                    "inner join phoneNumbers on phoneNumbers.userId = userDetails.userId where userDetails.userName like " + "'" + name + "';";

             */
            int num = 102;
            /*String query2 = "select userDetails.userId, userDetails.userName, userDetails.userId, phoneNumbers.phoneNumber, phoneNumbers.tag from userDetails\n" +
                    "\tinner join phoneNumbers on phoneNumbers.userId = userDetails.userId where phoneNumbers.phoneNumber = " + num + ";";

             */
            //PreparedStatement preparedStatement = con.prepareStatement(query);

            //Retrieve the details of the person(s) by looking for partial match also.
            String query2 = "select userDetails.userId, userDetails.userName, userDetails.userId, phoneNumbers.phoneNumber, phoneNumbers.tag from userDetails\n" +
                    "\tinner join phoneNumbers on phoneNumbers.userId = userDetails.userId where userDetails.userName like '"+ name +"%';";

            PreparedStatement preparedStatement2 = con.prepareStatement(query2);

            ResultSet resultSet = preparedStatement2.executeQuery();
            System.out.println("userId\tuserName\tuserPhoneNo\tTag to Phone Number");
            while( resultSet.next()){
                System.out.println( resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3) + "\t" + resultSet.getString(4));
            }
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
