/**
 * 
 */
package br.edu.unoesc.edi.bim.db.dao;

import java.sql.SQLException;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

/**
 * @author Marcelo
 *
 */
public class Connection {
	private static final String DB_URL = "jdbc:sqlite:db/bim.db";
	private static ConnectionSource connectionSource = null;
	
	private Connection() {
		
	}
	/**
	 * Create a connection source with database
	 * @return Conexão
	 */
	public static ConnectionSource getConection(){
		if(connectionSource == null){
			try{
				try{
					Class.forName("org.sqlite.JDBC");
				}catch(ClassNotFoundException e){
					e.printStackTrace();
				}
				connectionSource = new JdbcConnectionSource(DB_URL);
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return connectionSource;
	}
}
