package example;


import java.sql.Connection;


public class Test {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				ConnessioneDB c = new ConnessioneDB();
				Connection conn = c.connect("jdbc:mysql://localhost:3306/phone1");
				
				String query ="SELECT s.name,c.ram,c.cpu,d.size FROM smartphone s JOIN caratteristiche c ON c.idcaratteristiche = s.caratteristiche_idcaratteristiche JOIN display_info d ON s.display_info_iddisplay_info = d.iddisplay_info";
				
				Query q = new Query();
				q.eseguiQuery(conn, query);
				
				
	}

}
