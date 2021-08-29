package LoginandReg;

import java.sql.*;

public class JDBC {
    Connection con;
    Statement st;
    int val;
    ResultSet rows;

    public JDBC() {
        //registering the driver class
         try{
            Class.forName("com.mysql.jdbc.Driver");
            //creating the connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "Gionees5.1");
            if (con != null) {
                System.out.println("Database is Connected Successfully");
            }
            //creating statement
            st = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public int insert(String query){
        //execute query
        try{
            val = st.executeUpdate(query);
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return val;
    }
    public int select(String query){
        try{
            rows = st.executeQuery(query);
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }//helloooooo


    public static void main(String[] args) {
        new JDBC();
    }
}
