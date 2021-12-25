package Dao;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookDao {
	public static String save(String callno,String name,String author,String publisher,int quantity){
		String status="";
		try{
			Connection con= DB.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into books(callno,name,author,publisher,quantity) values(?,?,?,?,?)");
			ps.setString(1,callno);
			ps.setString(2,name);
			ps.setString(3,author);
			ps.setString(4,publisher);
			ps.setInt(5,quantity);
			int flag = ps.executeUpdate();
			status = String.valueOf(flag);
			con.close();
			System.out.println(status);
		}catch(Exception e) {
			status = "Duplicate entry"+" "+callno+" "+"for column callno";
		}
		return status;
	}

	public static TableModel getBookTable() {
		TableModel tableModel = null;
		try {
			Connection con = DB.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from books");
			tableModel = DbUtils.resultSetToTableModel(rs);
		}catch (Exception e){

		}
		return tableModel;
	}
}
