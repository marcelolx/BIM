/**
 * 
 */
package br.edu.unoesc.edi.bim.actions;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

/**
 * @author Marcelo
 *
 *	Contém as ações a ser executadas, quando o usuário clicar num grupo listado no jpanel lateral.
 */
public class ActionJlabelReports implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel group = (JLabel) e.getSource();
		System.out.println(group.getText());
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}
