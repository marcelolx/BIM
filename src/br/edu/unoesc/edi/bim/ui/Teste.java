package br.edu.unoesc.edi.bim.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class Teste extends JFrame {

	private JPanel contentPane;  
    private JPanel panel_1;  
    private JButton btnAdicionarCheckbox;  
    private JButton btnRemoverCheckbox;  
    private JButton btnRemoverTodos;  
    private List<JCheckBox> checkboxes = new ArrayList<JCheckBox>();  

    /** 
     * Launch the application. 
     */  
    public static void main(String[] args) {  
        EventQueue.invokeLater(new Runnable() {  
            public void run() {  
                try {  
                    Teste frame = new Teste();  
                    frame.setVisible(true);  
                } catch (Exception e) {  
                    e.printStackTrace();  
                }  
            }  
        });  
    }  

    /** 
     * Create the frame. 
     */  
    public Teste() {  
        setTitle("Adicionar Checkboxes Dinamicamente");  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setBounds(100, 100, 450, 300);  
        contentPane = new JPanel();  
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));  
        contentPane.setLayout(new BorderLayout(0, 0));  
        setContentPane(contentPane);
        contentPane.add(getPanel_1(), BorderLayout.SOUTH);
        contentPane.add(getScrollPane(), BorderLayout.CENTER);
    }  

    private JPanel getPanel_1() {  
        if (panel_1 == null) {  
            panel_1 = new JPanel();  
            panel_1.add(getBtnAdicionarCheckbox());  
            panel_1.add(getBtnRemoverCheckbox());  
        }  
        return panel_1;  
    }  

    private int indiceCheckbox = 0;  
    private JScrollPane scrollPane;
    private JPanel panel;

    private JButton getBtnAdicionarCheckbox() {  
        if (btnAdicionarCheckbox == null) {  
            btnAdicionarCheckbox = new JButton("Adicionar Checkbox");  
            btnAdicionarCheckbox.addActionListener(new ActionListener() {  
                public void actionPerformed(ActionEvent e) {  
                    JCheckBox checkBox = new JCheckBox();  
                    indiceCheckbox++;  
                    checkBox.setText(String.format("Combo id # %d", indiceCheckbox));  
                    panel.add(checkBox); // adiciona o componente criado ao panel...  
                    checkboxes.add(checkBox); // e à lista
                    Dimension d = new Dimension();
                    d.height = (int) (panel.getSize().getHeight() + 10);
                    d.width = (int) panel.getSize().getWidth();
                    panel.setSize(d);
                    panel.validate();  
                    panel.repaint(); // redesenha o painel para mostrar o novo checkbox  
                }  
            });  
        }  
        return btnAdicionarCheckbox;  
    }  

    private JButton getBtnRemoverCheckbox() {  
        if (btnRemoverCheckbox == null) {  
            btnRemoverCheckbox = new JButton("Remover Checkbox");  
            btnRemoverCheckbox.addActionListener(new ActionListener() {  
                public void actionPerformed(ActionEvent e) {  
                    if (checkboxes.size() > 0) {  
                        // Vamos remover o último, por exemplo  
                        // Primeiramente vamos achar o último elemento...  
                        JCheckBox checkBox = checkboxes.get(checkboxes.size() - 1);  
                        // Agora vamos removê-lo do panel...  
                        panel.remove(checkBox);  
                        // e da lista também!  
                        checkboxes.remove(checkBox);  
                        panel.validate();  
                        panel.repaint();  
                    }  
                }  
            });  
        }  
        return btnRemoverCheckbox;  
    }  

    private JScrollPane getScrollPane() {
        if (scrollPane == null) {
            scrollPane = new JScrollPane();
            scrollPane.setViewportView(getPanel());
        }
        return scrollPane;
    }
    private JPanel getPanel() {
        if (panel == null) {
            panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 
        }
        return panel;
    }
}
