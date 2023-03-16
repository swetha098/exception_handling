package mavenexception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class empmavexception {
	public static void main(String[] args) throws invalid_number {
		


		Scanner sc = new Scanner(System.in);

		empmav e1 = new empmav(1, "Sasi", "sasi@ust.com", "98462223687", "lakoor house pthanamthitta", "TVM", 22000);
//		System.out.println("enter name");
//		e1.setName(sc.next());
//
//		System.out.println("enter location");
//		e1.setLocation(sc.next());
//
//		System.out.println("enter salary");
//		e1.setSalary(sc.nextDouble());
		System.out.println("enter mobile number");
		e1.setMob_num("9876543211");
		try {
			if (!e1.getMob_num().matches("\\d{10}"))
				throw new invalid_number("invalid phone number");

			System.out.println("enter mail id");
			e1.setmail_id("sasi@gmail.com");

			try {
				if (!e1.mail_id.matches("^[a-zA-z0-9+-.]+@[a-zA-z0-9+-./]+$")) {
					throw new invalid_mail_id("invalid mail id");
				}
					String url = "jdbc:mysql://localhost:3306/emp";
					String username = "root";
					String password = "pass@word1";

					try {
						Connection conn = DriverManager.getConnection(url, username, password);
						Statement stmt = conn.createStatement();

						// Execute the CREATE TABLE statement
//				         String sql = "CREATE TABLE employeeexception ("
//				                    + "id INT NOT NULL AUTO_INCREMENT,"
//				                    + "name VARCHAR(255),"
//				                    + "salary INT,"
//				                    + "email_id VARCHAR(255),"
//				                    + "address varchar(200),"
//				                    +"phone_num varchar(100),"
//				                    + "PRIMARY KEY (id)"
//				                    + ")";
//				         	stmt.executeUpdate(sql);

						// Close the statement and connection objects
//				         	stmt.close();
//				         	conn.close();
////				         
						// System.out.println("Employee table created successfully!");
						String sql = "insert into employeeexception values(?,?,?,?,?,?,?);";
						PreparedStatement sasi=conn.prepareStatement(sql);
						sasi.setInt(1, e1.getEmp_id());
						sasi.setString(2, e1.getName());
						sasi.setInt(3, (int) e1.getSalary());
						sasi.setString(4, e1.getmail_id());
						sasi.setString(5, e1.getAddress());
						sasi.setString(6, e1.getMob_num());
				       sasi.executeUpdate();
						//
//						ResultSet rs = stmt.executeQuery("select * from employeeexception");
//						while (rs.next())
//							System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + " " + rs.getInt(3) + " "
//									+ rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));

					} catch (SQLException e) {
						e.printStackTrace();
					}
				
			} catch (invalid_mail_id e) {
				System.out.println(e);
			}
			
		}

		catch (invalid_number e) {
			System.out.println(e);

		}



	}

	public static class invalid_number extends Exception {
		public invalid_number(String message) {
			super(message);
		}
	}

	public static class invalid_mail_id extends Exception {
		public invalid_mail_id(String msg) {
			super(msg);
		}
	}

}
