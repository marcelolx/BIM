package br.edu.unoesc.edi.bim.actions;

/**
 * 
 * @author Marcelo
 * A princípio só tem a função de getters and setters
 */
public class StudentIdForProcedures {
	
	private static Integer id=0;
	
	public static Integer getId() {
		return id;
	}

	public static void setId(Integer idP) {
		id = idP;
	}
	/*
	public static void init(JTabbedPane mainPane) {
		JPanel pane = new JPanel();
		pane.setLayout(null);
		pane.setBackground(Color.white);

		JPanel northPane = new JPanel();
		northPane.setLayout(null);
		northPane.setBounds(1, 0, mainPane.getWidth() - 9, 45);
		northPane.setBackground(Color.white);
		northPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JLabel lblProcedimentos = new JLabel("Procedimentos");
		lblProcedimentos.setFont(new Font("Base 02", Font.PLAIN, 22));
		lblProcedimentos.setHorizontalAlignment(SwingConstants.CENTER);
		lblProcedimentos.setBounds(1, 1, mainPane.getWidth() - 11, 43);
		lblProcedimentos.setVisible(true);
		northPane.add(lblProcedimentos);

		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(null);
		centerPanel.setBounds(1, 48, mainPane.getWidth() - 9, mainPane.getHeight() - 88);
		centerPanel.setBackground(Color.white);
		centerPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnGuedesHomens = new JButton("Guedes Homens Específica");
		btnGuedesHomens.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TabGuedesHomens.init(mainPane);
				mainPane.setSelectedIndex(mainPane.getTabCount()-1);
			}
		});
		btnGuedesHomens.setHorizontalAlignment(SwingConstants.CENTER);
		btnGuedesHomens.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) - 110, 5, 220, 44);
		centerPanel.add(btnGuedesHomens);
		
		JButton btnGuedesMulheres = new JButton("Guedes Mulheres Específica");
		btnGuedesMulheres.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TabGuedesMulheres.init(mainPane);
				mainPane.setSelectedIndex(mainPane.getTabCount()-1);
			}
		});
		btnGuedesMulheres.setHorizontalAlignment(SwingConstants.CENTER);
		btnGuedesMulheres.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) - 110, 53, 220, 44);
		centerPanel.add(btnGuedesMulheres);
		
		JButton btnDuerenbergHomensIdosos = new JButton("Duerenberg % Gordura Homens Idosos");
		btnDuerenbergHomensIdosos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TabDuerenbergGorduraHomensIdosos.init(mainPane);
				mainPane.setSelectedIndex(mainPane.getTabCount()-1);
			}
		});
		btnDuerenbergHomensIdosos.setHorizontalAlignment(SwingConstants.CENTER);
		btnDuerenbergHomensIdosos.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) - 110, 101, 220, 44);
		centerPanel.add(btnDuerenbergHomensIdosos);
		
		JButton btnDurninWomersleyHomensIdosos = new JButton("Durnin e Womersley Homens Idosos");
		btnDurninWomersleyHomensIdosos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TabDurninWomersleyHomensIdosos.init(mainPane);
				mainPane.setSelectedIndex(mainPane.getTabCount()-1);
			}
		});
		btnDurninWomersleyHomensIdosos.setHorizontalAlignment(SwingConstants.CENTER);
		btnDurninWomersleyHomensIdosos.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) - 110, 149, 220, 44);
		centerPanel.add(btnDurninWomersleyHomensIdosos);
		
		JButton btnDurninWomersleyMulheresIdosas = new JButton("Durnin e Womersley Mulheres Idosas");
		btnDurninWomersleyMulheresIdosas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TabDurninWomersleyMulheresIdosas.init(mainPane);
				mainPane.setSelectedIndex(mainPane.getTabCount()-1);
			}
		});
		btnDurninWomersleyMulheresIdosas.setHorizontalAlignment(SwingConstants.CENTER);
		btnDurninWomersleyMulheresIdosas.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) - 110, 197, 220, 44);
		centerPanel.add(btnDurninWomersleyMulheresIdosas);
		
		JButton btnJacksonPollockHomensAtletas = new JButton("Jackson Pollock Homens Atletas 7 DC");
		btnJacksonPollockHomensAtletas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TabJacksonPollockHomensAtletas.init(mainPane);
				mainPane.setSelectedIndex(mainPane.getTabCount()-1);
			}
		});
		btnJacksonPollockHomensAtletas.setHorizontalAlignment(SwingConstants.CENTER);
		btnJacksonPollockHomensAtletas.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) - 110, 245, 220, 44);
		centerPanel.add(btnJacksonPollockHomensAtletas);
		
		JButton btnJacksonPollockMulheresAtletas  = new JButton("Jackson Pollock Mulheres Atletas 4 DC");
		btnJacksonPollockMulheresAtletas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TabJacksonPollockMulheresAtletas.init(mainPane);
				mainPane.setSelectedIndex(mainPane.getTabCount()-1);
			}
		});
		btnJacksonPollockMulheresAtletas .setHorizontalAlignment(SwingConstants.CENTER);
		btnJacksonPollockMulheresAtletas .setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) - 110, 293, 220, 44);
		centerPanel.add(btnJacksonPollockMulheresAtletas );
		
		JButton btnGonçalvesMulheresIdosas = new JButton("Gonçalves Mulheres Idosas % Gordura");
		btnGonçalvesMulheresIdosas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TabGoncalvesMulheresIdosas.init(mainPane);
				mainPane.setSelectedIndex(mainPane.getTabCount()-1);
			}
		});
		btnGonçalvesMulheresIdosas.setHorizontalAlignment(SwingConstants.CENTER);
		btnGonçalvesMulheresIdosas.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) - 110, 341, 220, 44);
		centerPanel.add(btnGonçalvesMulheresIdosas);
		
		JButton btnPetroskiHomens = new JButton("Petroski Homens");
		btnPetroskiHomens.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TabPetroskiHomens.init(mainPane);
				mainPane.setSelectedIndex(mainPane.getTabCount()-1);
			}
		});
		btnPetroskiHomens.setHorizontalAlignment(SwingConstants.CENTER);
		btnPetroskiHomens.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) - 110, 389, 220, 44);
		centerPanel.add(btnPetroskiHomens);
		
		JButton btnPetroskiMulheres = new JButton("Petroski Mulheres");
		btnPetroskiMulheres.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TabPetroskiMulheres.init(mainPane);
				mainPane.setSelectedIndex(mainPane.getTabCount()-1);
			}
		});
		btnPetroskiMulheres.setHorizontalAlignment(SwingConstants.CENTER);
		btnPetroskiMulheres.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) - 110, 437, 220, 44);
		centerPanel.add(btnPetroskiMulheres);
		
		pane.add(northPane);
		pane.add(centerPanel);
		pane.setVisible(true);

		if (mainPane.getTabCount() == 2) {
			mainPane.removeTabAt(mainPane.getTabCount() - 1);
			mainPane.addTab("Procedimentos", pane);
		} else {
			mainPane.addTab("Procedimentos", pane);
		}
	}
	*/
}
