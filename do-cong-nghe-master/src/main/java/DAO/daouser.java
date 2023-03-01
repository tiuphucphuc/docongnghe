package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.user;
import do_cong_nghe.connect.database;

public class daouser {
	public static user get(String name, String password) {
		user p = null;
		String sql = "SELECT *FROM tbl_use WHERE name =? AND password = ?";
		Connection connection = database.getConnection();
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				p = new user();
				p.setName(rs.getString("name"));
				p.setPassword(rs.getString("password"));
				p.setEmail(rs.getString("email"));
				p.setId_admin(rs.getInt("id_admin"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return p;
	}
	
	public static boolean insert(String name,String password,String email) {
		
		PreparedStatement ptmt=null;
		
		String sql = "insert into tbl_use(name,password,email,id_admin) values(?,?,?,0)";
		Connection connection = database.getConnection();
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, email);
			int ra=ps.executeUpdate();
			
			if(ra==0) {
				return false;
			}
			
			return true;
			
		} catch (Exception e) {
			return true;
			// TODO: handle exception
		}
		
	
	}
}
