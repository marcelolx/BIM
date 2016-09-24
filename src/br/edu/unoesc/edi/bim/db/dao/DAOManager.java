/**
 * 
 */
package br.edu.unoesc.edi.bim.db.dao;

import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.table.TableUtils;

import br.edu.unoesc.edi.bim.db.model.Users;

/**
 * @author Marcelo
 *
 */
public class DAOManager {
	/**
	 * Create table if not exists or createDao.
	 */
	public static Dao<Users, Integer> usersDAO;
	
	static {
		try {
			TableUtils.createTableIfNotExists(Connection.getConection(), Users.class);

			usersDAO = DaoManager.createDao(Connection.getConection(), Users.class);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
