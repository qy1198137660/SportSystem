package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import system.Config;

public class SMySQL {
	public static String Search(String param){
		String result = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(Config.MysqlURL,"root","qy20090725");
			Statement statement=connection.createStatement();
			
			ResultSet rSet=statement.executeQuery("select userPasswd from test.users where userId='"+param+"'");
			System.out.println("Data from input:"+param);
			while (rSet.next()) {
				result+=rSet.getString(1);
			}
			System.out.println("Data from db:"+result);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			
		}
		return result;
	}
}
