package br.edu.unoesc.edi.bim.util;

/**
 * @author Jonathan
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import javax.swing.WindowConstants;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class ReportGenerator {

	private static final String url = "jdbc:sqlite:db/bim.db";
	private static final String driver = "org.sqlite.JDBC";
	private static final String login = "";
	private static final String pwd = "";

	public static void gerador(String layout, String query) throws ClassNotFoundException, SQLException, JRException {
		
		//estabelece conexão
		HashMap<String, Object> hm = new HashMap<String, Object>();
		Class.forName(driver);
		Connection con = (Connection) DriverManager.getConnection(url, login, pwd);
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(query);

		// implementação da interface JRDataSource para DataSource ResultSet
		JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

		//executa o relatório
		try {
			JasperPrint print = JasperFillManager.fillReport("src/reports/"+layout, hm, jrRS);
			JasperViewer viewer = new JasperViewer(print, true);
			viewer.setVisible(true);
			viewer.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		}

		catch (Exception e) {
		}
	}
}