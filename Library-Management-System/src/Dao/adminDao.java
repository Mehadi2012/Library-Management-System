package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class adminDao {
    public static boolean validateAdmin(String name,String password){
        boolean status=false;
        try{
            Connection con= DB.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from admin where name=? and password=?");
            ps.setString(1,name);
            ps.setString(2,password);
            ResultSet rs=ps.executeQuery();
            status=rs.next();
            con.close();
        }catch(Exception e){System.out.println(e);}
        return status;
    }
}
