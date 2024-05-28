package bank.management.system;

import java.sql.*;

public class Conn {
   Connection connection;
   java.sql.Statement statement;
    public Conn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Abhi@1724");
            statement = connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
