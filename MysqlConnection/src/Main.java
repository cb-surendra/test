import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class Main {

    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","cb-surendra");
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
            PreparedStatement preparedStatement = con.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Username\tpassword");
            while( resultSet.next()){
                System.out.println( resultSet.getInt(1) + "\t" + resultSet.getString(2));
            }
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
