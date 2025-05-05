package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class JdbcDemo {
   private static  String DRIVERNAME="org.postgresql.Driver";
    private static String USERNAME="postgres";
    private static String PASSWORD="root";
    private static  String DBNAME="KPRIT";
    private static String URL="jdbc:postgresql://localhost:5432/"+DBNAME;

    public static void main(String[] args)
    {
        try{
             // Load the driver
             Class.forName(DRIVERNAME);
                // Create a connection 
                Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
                System.out.println("Connection Established Successfully");
                //create the statement
                String query="select * from student";
                Statement stmt=con.createStatement();
                //execute the query
                
                //Retrieve the result set
                ResultSet rs=stmt.executeQuery(query);;
                while(rs.next()){
                    System.out.print(rs.getInt(1)+" ");
                    System.out.print(rs.getString(2)+" ");
                    System.out.println(rs.getString(3));
                }
                stmt.close();
                con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
