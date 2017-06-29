package example;

import java.sql.Connection;

import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class ConnessioneDB implements Connessione{


	public Connection connect(String url) {
		// TODO Auto-generated method stub
		
		MysqlDataSource dataSource = new MysqlDataSource(); //TODO spring bean
		
		dataSource.setUser("root");
		dataSource.setPassword("");
		dataSource.setUrl("jdbc:mysql://localhost:3306/phone1");
		
		Connection conn = null;
		
		try{
			conn = dataSource.getConnection();
				
			
			
		}
		 catch (SQLException e) {
			
		}
		
		
		return conn;
	}

}
