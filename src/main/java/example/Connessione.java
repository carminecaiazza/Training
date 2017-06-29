package example;

import java.sql.Connection;

public interface Connessione {
	
	public Connection connect(String url);

}
