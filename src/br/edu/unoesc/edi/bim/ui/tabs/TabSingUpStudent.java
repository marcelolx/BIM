package br.edu.unoesc.edi.bim.ui.tabs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import com.j256.ormlite.dao.Dao.CreateOrUpdateStatus;

import br.edu.unoesc.edi.bim.components.JSearchField;
import br.edu.unoesc.edi.bim.db.dao.DAOManager;
import br.edu.unoesc.edi.bim.db.model.Students;
import br.edu.unoesc.edi.bim.ui.FrmMain;
import br.edu.unoesc.edi.bim.ui.JScrollBarAdder;
import br.edu.unoesc.edi.bim.util.StringReturner;

/**
 * 
 * @author Marcelo
 *
 */
public class TabSingUpStudent {

	private static JLabel lblStudentPhoto;
	private static JLabel lblStudentId;
	private static JSearchField txtName;
	private static JTextField txtMail;
	private static JTextField txtPhone;
	private static JTextField txtBirthday;
	private static JTextField txtAge;
	private static JRadioButton rbGenreMale;
	private static JRadioButton rbGenreFemale;
	private static JTextField txtWeight;
	private static JTextField txtHeight;
	private static final ButtonGroup buttonGroup = new ButtonGroup();

	// TODO
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void init(JTabbedPane mainPane) {
		JPanel pane = new JPanel();
		pane.setLayout(null);
		pane.setBackground(Color.white);

		JPanel northPane = new JPanel();
		northPane.setLayout(null);
		northPane.setBounds(1, 0, mainPane.getWidth() - 9, 50);
		northPane.setBackground(Color.white);
		northPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JLabel lblCadastroNorth = new JLabel("Cadastro de Aluno");
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

		lblStudentPhoto = new JLabel();
		lblStudentPhoto.setBounds(50, 50, 170, 180);
		lblStudentPhoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentPhoto.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblStudentPhoto.setIcon(new ImageIcon(TabSingUpStudent.class.getResource("/images/UserFilled-165.png")));
		centerPanel.add(lblStudentPhoto);

		JButton addStudentPhoto = new JButton();
		addStudentPhoto.setContentAreaFilled(false);
		addStudentPhoto.setBounds(50, 232, 85, 44);
		addStudentPhoto.setIcon(new ImageIcon(TabSingUpStudent.class.getResource("/images/AddCamera-32.png")));
		centerPanel.add(addStudentPhoto);

		JButton removeStudentPhoto = new JButton();
		removeStudentPhoto.setContentAreaFilled(false);
		removeStudentPhoto.setBounds(137, 232, 85, 44);
		removeStudentPhoto.setIcon(new ImageIcon(TabSingUpStudent.class.getResource("/images/Delete Filled-32.png")));
		centerPanel.add(removeStudentPhoto);

		JLabel lblid = new JLabel("ID ");
		lblid.setBounds(calcPaneWidthSizeToSetComponents(mainPane) + 28, 20, 30, 22);
		lblid.setHorizontalAlignment(SwingConstants.CENTER);
		lblid.setForeground(Color.gray);
		lblid.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblid);

		lblStudentId = new JLabel("0");
		lblStudentId.setBounds(calcPaneWidthSizeToSetComponents(mainPane) + 62, 20, 90, 22);
		lblStudentId.setHorizontalAlignment(SwingConstants.LEFT);
		lblStudentId.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		lblStudentId.setForeground(Color.BLACK);
		centerPanel.add(lblStudentId);

		JLabel lblName = new JLabel("Nome *");
		lblName.setBounds(calcPaneWidthSizeToSetComponents(mainPane) + 1, 50, 60, 22);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(Color.gray);
		lblName.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblName);

		txtName = new JSearchField();
		txtName.setBounds(calcPaneWidthSizeToSetComponents(mainPane) + 62, 50, 380, 22);
		txtName.setEmptyText("Nome completo sem abreviações");
		txtName.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtName.setForeground(Color.GRAY);
		txtName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtName.setEmptyText("");
				txtName.selectAll();
				txtName.setForeground(Color.BLACK);
			}

			@Override
			public void focusLost(FocusEvent e) {
				txtName.setEmptyText("Nome completo sem abreviações");
				txtName.setForeground(Color.GRAY);
			}
		});
		centerPanel.add(txtName);

		JLabel lblMail = new JLabel("E-mail *");
		lblMail.setBounds(calcPaneWidthSizeToSetComponents(mainPane), 92, 60, 22);
		lblMail.setHorizontalAlignment(SwingConstants.CENTER);
		lblMail.setForeground(Color.gray);
		lblMail.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblMail);

		txtMail = new JTextField();
		txtMail.setBounds(calcPaneWidthSizeToSetComponents(mainPane) + 62, 90, 380, 22);
		txtMail.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtMail.setForeground(Color.gray);
		centerPanel.add(txtMail);

		JLabel lblPhone = new JLabel("Telefone");
		lblPhone.setBounds(calcPaneWidthSizeToSetComponents(mainPane) - 2, 132, 60, 22);
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setForeground(Color.gray);
		lblPhone.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblPhone);

		/**
		 * @author 298073 Máscara para telefone
		 */
		txtPhone = new JTextField();
		try {
			javax.swing.text.MaskFormatter telefone = new javax.swing.text.MaskFormatter("(##) ####-####");
			txtPhone = new javax.swing.JFormattedTextField(telefone);
		} catch (Exception e) {
		}
		txtPhone.setBounds(calcPaneWidthSizeToSetComponents(mainPane) + 62, 130, 200, 22);
		txtPhone.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtPhone.setForeground(Color.BLACK);
		centerPanel.add(txtPhone);

		JLabel lblBirthday = new JLabel("Data Nascimento*");
		lblBirthday.setBounds(calcPaneWidthSizeToSetComponents(mainPane) - 60, 174, 120, 22);
		lblBirthday.setHorizontalAlignment(SwingConstants.CENTER);
		lblBirthday.setForeground(Color.gray);
		lblBirthday.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblBirthday);

		/**
		 * @author 298073 Máscara para aniversário
		 */
		txtBirthday = new JTextField();
		try {
			javax.swing.text.MaskFormatter birthday = new javax.swing.text.MaskFormatter("##/##/####");
			txtBirthday = new javax.swing.JFormattedTextField(birthday);
		} catch (Exception e) {
		}
		txtBirthday.setBounds(calcPaneWidthSizeToSetComponents(mainPane) + 62, 172, 170, 22);
		txtBirthday.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtBirthday.setForeground(Color.BLACK);
		centerPanel.add(txtBirthday);

		JLabel lblAge = new JLabel("Idade*");
		lblAge.setBounds(calcPaneWidthSizeToSetComponents(mainPane) + 228, 174, 60, 22);
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setForeground(Color.gray);
		lblAge.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblAge);

		txtAge = new JTextField();
		txtAge.setBounds(calcPaneWidthSizeToSetComponents(mainPane) + 290, 172, 45, 22);
		txtAge.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtAge.setForeground(Color.gray);
		centerPanel.add(txtAge);

		JLabel lblGenre = new JLabel("Gênero*");
		lblGenre.setBounds(calcPaneWidthSizeToSetComponents(mainPane), 214, 60, 22);
		lblGenre.setHorizontalAlignment(SwingConstants.CENTER);
		lblGenre.setForeground(Color.gray);
		lblGenre.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblGenre);

		rbGenreMale = new JRadioButton("Masculino");
		buttonGroup.add(rbGenreMale);
		rbGenreMale.setBounds(calcPaneWidthSizeToSetComponents(mainPane) + 62, 214, 109, 22);
		rbGenreMale.setFont(new Font("Sans Serif", Font.BOLD, 13));
		rbGenreMale.setBackground(Color.white);
		rbGenreMale.setForeground(Color.gray);
		centerPanel.add(rbGenreMale);

		rbGenreFemale = new JRadioButton("Feminino");
		buttonGroup.add(rbGenreFemale);
		rbGenreFemale.setBounds(calcPaneWidthSizeToSetComponents(mainPane) + 173, 214, 109, 22);
		rbGenreFemale.setFont(new Font("Sans Serif", Font.BOLD, 13));
		rbGenreFemale.setBackground(Color.white);
		rbGenreFemale.setForeground(Color.gray);
		centerPanel.add(rbGenreFemale);

		JLabel lblWeight = new JLabel("Peso(kg)*");
		lblWeight.setBounds(calcPaneWidthSizeToSetComponents(mainPane) - 3, 256, 60, 22);
		lblWeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeight.setForeground(Color.gray);
		lblWeight.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblWeight);

		txtWeight = new JTextField();
		txtWeight.setBounds(calcPaneWidthSizeToSetComponents(mainPane) + 62, 256, 45, 22);
		txtWeight.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtWeight.setForeground(Color.gray);
		centerPanel.add(txtWeight);

		JLabel lblHeight = new JLabel("Altura(cm)*");
		lblHeight.setBounds(calcPaneWidthSizeToSetComponents(mainPane) + 139, 256, 70, 22);
		lblHeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeight.setForeground(Color.gray);
		lblHeight.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblHeight);

		txtHeight = new JTextField();
		txtHeight.setBounds(calcPaneWidthSizeToSetComponents(mainPane) + 219, 256, 45, 22);
		txtHeight.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtHeight.setForeground(Color.gray);
		centerPanel.add(txtHeight);

		JLabel lblGroups = new JLabel("Grupos");
		lblGroups.setBounds(calcPaneWidthSizeToSetComponents(mainPane), 298, 60, 22);
		lblGroups.setHorizontalAlignment(SwingConstants.CENTER);
		lblGroups.setForeground(Color.gray);
		lblGroups.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblGroups);

		JPanel listGroupsPanel = new JPanel();
		listGroupsPanel.setLayout(new BorderLayout(0, 0));
		listGroupsPanel.setBounds(calcPaneWidthSizeToSetComponents(mainPane) + 62, 298, 380, 150);
		listGroupsPanel.setBackground(Color.white);
		listGroupsPanel.setVisible(true);
		listGroupsPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		listGroupsPanel.add(JScrollBarAdder.getScrollPaneGroupsRadioButton(), BorderLayout.CENTER);
		centerPanel.add(listGroupsPanel);
		JScrollBarAdder.listGroupsRadioButtons();

		JLabel btnReset = new JLabel("Limpar");
		btnReset.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evet0) {
				resetInputFields();
			}
		});
		btnReset.setForeground(Color.white);
		btnReset.setOpaque(true);
		btnReset.setBackground(new Color(35, 164, 240));
		btnReset.setHorizontalAlignment(SwingConstants.CENTER);
		btnReset.setBounds(calcPaneWidthSizeToSetComponents(mainPane) + 252, 452, 95, 44);
		centerPanel.add(btnReset);

		JLabel btnSave = new JLabel("Salvar");
		btnSave.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				Students students = new Students();
				students.setStudentId(Integer.parseInt(lblStudentId.getText()));
				students.setName(txtName.getText());
				students.setEmail(txtMail.getText());
				students.setPhone(txtPhone.getText());
				students.setBirthday(txtBirthday.getText());
				students.setAge(Integer.parseInt(txtAge.getText()));
				if (rbGenreFemale.isSelected() && rbGenreMale.isSelected())
					students.setGenre(rbGenreFemale.getText().charAt(0));
				else if (rbGenreMale.isSelected())
					students.setGenre(rbGenreMale.getText().charAt(0));
				else
					JOptionPane.showMessageDialog(null, "Selecione o gênero");
				students.setWeight(Float.parseFloat(txtWeight.getText()));
				students.setHeight(Float.parseFloat(txtHeight.getText()));
				students.setGroups("");
				// students.setGroups(groups);
				try {
					CreateOrUpdateStatus statusAuxiliar = DAOManager.studentsDAO.createOrUpdate(students);
					if (statusAuxiliar.isCreated()) {
						JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
						StringReturner.setSelectedGroupsOff();
						resetInputFields();
					}
					if (statusAuxiliar.isUpdated()) {
						JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");
					}
					String groups = null;
					groups = StringReturner.returnSelectedGroups();
					if (!groups.isEmpty()) {
						groups = groups.substring(0, groups.length() - 1);
						students.setGroups(groups);
					}
					CreateOrUpdateStatus status = DAOManager.studentsDAO.createOrUpdate(students);
				} catch (SQLException e) {
					// TODO Auto-generated catch block

					e.printStackTrace();

				}
			}
		});
		btnSave.setForeground(Color.white);
		btnSave.setOpaque(true);
		btnSave.setBackground(new Color(35, 164, 240));
		btnSave.setHorizontalAlignment(SwingConstants.CENTER);
		btnSave.setBounds(calcPaneWidthSizeToSetComponents(mainPane) + 349, 452, 95, 44);
		centerPanel.add(btnSave);

		pane.add(northPane);
		pane.add(centerPanel);
		pane.setVisible(true);

		System.out.println(FrmMain.firstOpenedStudents);
		if (!FrmMain.firstOpenedStudents) {
			FrmMain.firstOpenedStudents = true;
			mainPane.addTab("Novo Aluno", pane);
		} else if (mainPane.getTabCount() == 2) {
			mainPane.removeTabAt(mainPane.getTabCount() - 1);
			mainPane.addTab("Novo Aluno", pane);
		} else {
			mainPane.addTab("Novo Aluno", pane);
		}
	}

	private static int calcPaneWidthSizeToSetComponents(JTabbedPane mainPane) {
		return ((mainPane.getWidth() - 220 - 440) / 2) + 220;
	}

	private static void resetInputFields() {
		lblStudentPhoto.setIcon(new ImageIcon(TabSingUpStudent.class.getResource("/images/UserFilled-165.png")));
		lblStudentId.setText("");
		txtName.setText("");
		txtMail.setText("");
		txtPhone.setText("");
		txtBirthday.setText("");
		txtAge.setText("");
		txtWeight.setText("");
		txtHeight.setText("");
		rbGenreFemale.setSelected(false);
		rbGenreMale.setSelected(false);
		StringReturner.setSelectedGroupsOff();
	}

	public static void fillInputFields(Integer id) {
		try {
			Students student = DAOManager.studentsDAO.queryForId(id);
			lblStudentPhoto.setIcon(new ImageIcon(TabSingUpStudent.class.getResource("/images/UserFilled-165.png")));
			lblStudentId.setText(student.getStudentId().toString());
			txtName.setText(student.getName());
			txtMail.setText(student.getEmail());
			txtPhone.setText(student.getPhone().toString());
			txtBirthday.setText(student.getBirthday().toString());
			txtAge.setText(student.getAge().toString());
			txtWeight.setText(student.getWeight().toString());
			txtHeight.setText(student.getHeight().toString());

			String[] grupos = StringReturner.breakString(student.getGroups());
			StringReturner.setGroups(grupos);

			char sex = student.getGenre();
			if (sex == 'F') {
				rbGenreFemale.setSelected(true);
				rbGenreMale.setSelected(false);
			} else {
				rbGenreFemale.setSelected(false);
				rbGenreMale.setSelected(true);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
