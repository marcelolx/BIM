package br.edu.unoesc.edi.bim.ui.tabs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import com.j256.ormlite.dao.Dao.CreateOrUpdateStatus;

import br.edu.unoesc.edi.bim.db.dao.DAOManager;
import br.edu.unoesc.edi.bim.db.model.Groups;
import br.edu.unoesc.edi.bim.db.model.Students;
import br.edu.unoesc.edi.bim.ui.FrmMain;
import br.edu.unoesc.edi.bim.ui.JScrollBarAdder;
import br.edu.unoesc.edi.bim.util.StringReturner;

/**
 * 
 * @author Marcelo
 *
 */
public class TabGroupsRegister {
	// TODO
	public static void init(JTabbedPane mainPane) {
		JPanel pane = new JPanel();
		pane.setLayout(null);
		pane.setBackground(Color.white);

		JPanel northPane = new JPanel();
		northPane.setLayout(null);
		northPane.setBounds(1, 0, mainPane.getWidth() - 9, 50);
		northPane.setBackground(Color.white);
		northPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JLabel lblCadastroNorth = new JLabel("Cadastro de Grupos");
		lblCadastroNorth.setFont(new Font("Base 02", Font.PLAIN, 22));
		lblCadastroNorth.setBackground(Color.black);
		lblCadastroNorth.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroNorth.setBounds(1, 1, mainPane.getWidth() - 11, 40);
		lblCadastroNorth.setVisible(true);
		northPane.add(lblCadastroNorth);

		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(null);
		centerPanel.setBounds(1, 52, mainPane.getWidth() - 9, mainPane.getHeight() - 94);
		centerPanel.setBackground(Color.white);
		centerPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JLabel lblName = new JLabel("Nome*");
		lblName.setBounds((mainPane.getWidth() / 4), 50, 60, 22);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(Color.gray);
		lblName.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblName);

		JTextField txtGroupName = new JTextField();
		txtGroupName.setBounds((mainPane.getWidth() / 4) + 62, 50, 380, 22);
		txtGroupName.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtGroupName.setForeground(Color.gray);
		centerPanel.add(txtGroupName);

		JPanel listStudentsPanel = new JPanel();
		listStudentsPanel.setLayout(new BorderLayout(0, 0));
		listStudentsPanel.setBounds(calcPaneSize(mainPane, 6), 82, 300, 290);
		listStudentsPanel.setBackground(Color.white);
		listStudentsPanel.setVisible(true);
		listStudentsPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		listStudentsPanel.add(JScrollBarAdder.getScrollPaneStudents(), BorderLayout.CENTER);
		centerPanel.add(listStudentsPanel);
		JScrollBarAdder.listStudents();

		JLabel btnSetNewGroup = new JLabel(">>");
		btnSetNewGroup.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				JScrollBarAdder.listStudentsNewGroup();
			}
		});
		btnSetNewGroup.setForeground(Color.white);
		btnSetNewGroup.setOpaque(true);
		btnSetNewGroup.setBackground(new Color(35, 164, 240));
		btnSetNewGroup.setHorizontalAlignment(SwingConstants.CENTER);
		btnSetNewGroup.setBounds(calcPaneSize(mainPane, 6) + 304, 167, 48, 48);
		centerPanel.add(btnSetNewGroup);

		JLabel btnRemoveFromNewGroup = new JLabel("<<");
		btnRemoveFromNewGroup.setForeground(Color.white);
		btnRemoveFromNewGroup.setOpaque(true);
		btnRemoveFromNewGroup.setBackground(new Color(35, 164, 240));
		btnRemoveFromNewGroup.setHorizontalAlignment(SwingConstants.CENTER);
		btnRemoveFromNewGroup.setBounds(calcPaneSize(mainPane, 6) + 304, 219, 48, 48);
		//centerPanel.add(btnRemoveFromNewGroup);

		JPanel listNewGroupStudents = new JPanel();
		listNewGroupStudents.setLayout(new BorderLayout(0, 0));
		listNewGroupStudents.setBounds(calcPaneSize(mainPane, 6) + 356, 82, 300, 290);
		listNewGroupStudents.setBackground(Color.white);
		listNewGroupStudents.setVisible(true);
		listNewGroupStudents.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		listNewGroupStudents.add(JScrollBarAdder.getScrollPaneStudentsNewGroup(), BorderLayout.CENTER);
		centerPanel.add(listNewGroupStudents);

		JLabel btnRegister = new JLabel("Cadastrar");
		btnRegister.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				List<String> allNames = new ArrayList<String>();
				if (!txtGroupName.getText().isEmpty()) {
					Groups group = new Groups();

					Students students = new Students();
					JRadioButton[] jrb = StringReturner.returnNewGroupForStudents();
					for (int i = 0; i < jrb.length; i++) {
						if (!jrb[i].isSelected()) {
							try {
								// pega o aluno na base de dados
								Students studentHelper = DAOManager.studentsDAO
										.queryForId(Integer.parseInt(jrb[i].getToolTipText()));
								// pega a string dos groupos que esse aluno faz
								// parte
								String groups = studentHelper.getGroups();
								// adiciona-se esse grupo a string
								if (!groups.equals("")) {
									groups += "-" + txtGroupName.getText();
								} else {
									groups += txtGroupName.getText() + "-";
									groups = groups.substring(0, groups.length() - 1);
								}
								// setando os novos valores

								students.setStudentId(Integer.parseInt(jrb[i].getToolTipText()));
								students.setName(studentHelper.getName());
								students.setEmail(studentHelper.getEmail());
								students.setPhone(studentHelper.getPhone());
								students.setBirthday(studentHelper.getBirthday());
								students.setAge(studentHelper.getAge());
								students.setGenre(studentHelper.getGenre());
								students.setWeight(studentHelper.getWeight());
								students.setHeight(studentHelper.getHeight());
								students.setGroups(groups);
							} catch (NumberFormatException | SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

							try {
								CreateOrUpdateStatus groupUp = DAOManager.studentsDAO.createOrUpdate(students);
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} else {
							allNames.add(jrb[i].getText());
						}
					}
					group.setName(txtGroupName.getText());
					try {
						int t = DAOManager.groupsDAO.create(group);
						if (t == 1) {
							JOptionPane.showMessageDialog(null, "Grupo cadastrado com sucesso!");
							txtGroupName.setText("");
							JScrollBarAdder.removeStudentsForNewGroupRadioButtons();
							//Diz quais alunos não foram associados ao grupo
							if(!allNames.isEmpty()){
								String name="";
								for (Iterator iterator = allNames.iterator(); iterator.hasNext();) {
									name += "\n" + (String) iterator.next()+".";
								}
								JOptionPane.showMessageDialog(null, "Os seguintes alunos não foram associados ao grupo: \n"
										+ name );
							}
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(null, "O Campo nome não pode estar vazio");
				}
			}
		});
		btnRegister.setForeground(Color.white);
		btnRegister.setOpaque(true);
		btnRegister.setBackground(new Color(35, 164, 240));
		btnRegister.setHorizontalAlignment(SwingConstants.CENTER);
		btnRegister.setBounds(calcPaneSize(mainPane, 6) + 560, 378, 95, 44);
		centerPanel.add(btnRegister);

		pane.add(northPane);
		pane.add(centerPanel);
		pane.setVisible(true);

		if (!FrmMain.firstOpenedGroups) {
			FrmMain.firstOpenedGroups = true;
			mainPane.addTab("Novo Grupo", pane);
		} else if (mainPane.getTabCount() == 2) {
			mainPane.removeTabAt(mainPane.getTabCount() - 1);
			mainPane.addTab("Novo Grupo", pane);
		} else {
			mainPane.addTab("Novo Grupo", pane);
		}
	}

	private static int calcPaneSize(JTabbedPane mainPane, int sub) {
		int size = mainPane.getWidth() / sub;
		return size;
	}
}
