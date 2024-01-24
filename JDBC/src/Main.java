import java.sql.*;

public class Main {
	public static void main(String[] args) throws Exception {
//		insertRecord(9,"padma",8.99);
		//insertUsePst(10,"sendhil",7.8);
//		deleteRecord(8);
		updateRecord(1,8.01);
		readRecord();
		
	}


	public static void readRecord() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
		String uname = "root";
		String pass = "sash";
		String query = "select * from std";

		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		}
		con.close();
	}

	public static void insertRecord(int id,String name,double gpa) throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
		String user = "root";
		String pass = "sash";
		String query = "insert into std values ("+id+",'"+name+"',"+gpa+");";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		int row = st.executeUpdate(query);
		System.out.println("Insert rows: "+row);
		con.close();
	}
	
	public static void insertUsePst(int id,String name,double gpa) throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
		String user = "root";
		String pass = "sash";
		String query = "insert into std values(?,?,?)";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1,id);
		pst.setString(2, name);
		pst.setDouble(3, gpa);
		int row = pst.executeUpdate();
		System.out.println("Insert rows: "+row);
		con.close();
	}
	
	public static void deleteRecord(int id) throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
		String user = "root";
		String pass = "sash";
	//	String query = "delete from std where id = "+id;
		String query = "delete from std where id = ?";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, id);
		int row = pst.executeUpdate();
		System.out.println("deleted rows: "+row);
		con.close();
	}
	
	public static void updateRecord(int id,double gpa) throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
		String user = "root";
		String pass = "sash";
		String query = "update std set gpa = ? where id = ?";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		PreparedStatement pst = con.prepareStatement(query);
		
		pst.setDouble(1,gpa);
		pst.setInt(2, id);
		
		int row = pst.executeUpdate();
		System.out.println("Updated rows: "+row);
		con.close();
	}

}
