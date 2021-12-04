package Dao;

import net.proteanit.sql.DbUtils;

import javax.swing.table.TableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LibrarianDAO {

	
	public static int save(String name,String password,String email,String contact){
		int status=0;
		try{
			Connection con= DB.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into librarian(name,password,email,contact) values(?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,password);
			ps.setString(3,email);
			ps.setString(4,contact);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(int id){
		int status=0;
		try{
			Connection con= DB.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from librarian where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

	public static boolean validate(String name,String password){
		boolean status=false;
		try{
			Connection con= DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from librarian where name=? and password=?");
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}


	public static TableModel getLibrarianTable() {
		TableModel tableModel = null;
		try {
			Connection con = DB.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from librarian");
			tableModel = DbUtils.resultSetToTableModel(rs);
		}catch (Exception e){

		}
		return tableModel;
	}
}