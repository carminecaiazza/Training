package example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class Query implements EsecuzioneQuery {
	
	final static Logger logger = Logger.getLogger(Query.class);
	//final static String USER_INFO = "SELECT s.name,c.ram,c.cpu,d.size FROM smartphone s JOIN caratteristiche c ON c.idcaratteristiche = s.caratteristiche_idcaratteristiche JOIN display_info d ON s.display_info_iddisplay_info = d.iddisplay_info";
	

	public void eseguiQuery(Connection conn, String query) {
		// TODO Auto-generated method stub
		
		try{
			
			
			PreparedStatement stmtUserInfo = conn.prepareStatement(query);
			//stmtUserInfo.setString(1,"Android");
			
			ResultSet rsUserInfoSet = stmtUserInfo.executeQuery();
			
			while(rsUserInfoSet.next()){
				
				logger.info(String.format("name: %s ram: %s cpu: %s", rsUserInfoSet.getString("s.name"),rsUserInfoSet.getString("c.ram"),rsUserInfoSet.getString("c.cpu")));
			}
			
			
		}
		 catch (SQLException e) {
			logger.info(e);
		}
		
		
	}

}
