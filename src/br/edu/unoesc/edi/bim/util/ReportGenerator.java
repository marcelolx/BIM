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

public class ReportGenerator {

	private static final String url = "jdbc:sqlite:src/db/bim.db";
	private static final String driver = "org.sqlite.JDBC";
	private static final String login = "";
	private static final String pwd = "";

	public static void test(int id) throws ClassNotFoundException, SQLException, JRException {
		String fileName = "src/relatorio/TCCReporta.jasper";
		String outFileName = "test.pdf";
		HashMap<String, Object> hm = new HashMap<String, Object>();
		Class.forName(driver);
		Connection con = (Connection) DriverManager.getConnection(url, login, pwd);
		Statement stm = con.createStatement();
		String query = "select * from usuarioAluno where nUsuario = " + id;
		ResultSet rs = stm.executeQuery(query);

		// implementação da interface JRDataSource para DataSource ResultSet
		JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

		try {
			JasperPrint print = JasperFillManager.fillReport(fileName, hm, jrRS);
			System.out.println("Created file: " + outFileName);
			JasperViewer viewer = new JasperViewer(print, false);
			viewer.setVisible(true);
			viewer.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		}

		catch (Exception e) {
		}
	}
}