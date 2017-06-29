package example;

import java.sql.Connection;


public interface EsecuzioneQuery {
	
	public void eseguiQuery(Connection conn, String query);

}
