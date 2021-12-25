package Dao;

import net.proteanit.sql.DbUtils;

import javax.swing.table.TableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	protected static Component frame;
	public static String save(String name,String email,String contact){
		int status=0;
		String fl = "";
		try{
			Connection con= DB.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into student(studentname,email,studentcontact,fine) values(?,?,?,0)");
			ps.setString(1,name);
			ps.setString(2,email);
			ps.setString(3,contact);

			status=ps.executeUpdate();
			fl = String.valueOf(status);
			con.close();
		}catch(Exception e){System.out.println(e);}
		return fl;
	}
	public static int delete(int id){
		int status=0;
		try{
			Connection con= DB.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from student where studentid=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

	public static TableModel getStd(){
		TableModel tableModel = null;
		try {
			Connection con = DB.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select studentid, studentname, email, studentcontact, fine from student");
			tableModel = DbUtils.resultSetToTableModel(rs);
		}catch (Exception e){

		}
		return tableModel;
	}

	public static boolean checkstud(int studentid) {
		boolean status=false;
		try{
			Connection con= DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from student where studentid=?");
			ps.setInt(1,studentid);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

	public static int finer(int studentId, int fi) {
		int status=0;
		int f = fi;
		int id = studentId;



		try{
			Connection con= DB.getConnection();

			PreparedStatement ps2=con.prepareStatement("update student set fine=? where studentid=?");
			ps2.setInt(1,f);
			ps2.setInt(2,id);



			status=ps2.executeUpdate();
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return status;



	}

}