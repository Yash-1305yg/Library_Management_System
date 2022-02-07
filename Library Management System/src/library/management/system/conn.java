package library.management.system;

import java.sql.*;
public class conn {
    //interfaces
    Connection c;
    Statement s;
    //constructor
    public conn(){
        try{
            //registering the driver
            //forName is a static method
            Class.forName("com.mysql.jdbc.Driver");
            //creating connection
            c=DriverManager.getConnection("jdbc:mysql:///project","root","");
            s=c.createStatement();
        }catch(Exception e){
             System.out.println(e);   
        }
    }
}
