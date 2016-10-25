package br.edu.unoesc.edi.bim.components;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * Créditos ao @author Victor Stafusa que desenvolveu essa classe e disponibilizou no stackoverflow.
 * 
 */
public class JSearchField extends JTextField {

    private static final long serialVersionUID = 1L;
    private final JLabel emptyTextLabel;
    private final JImage iconImage;

    public JSearchField() {
        this.emptyTextLabel = new JLabel();
        this.iconImage = new JImage();
        this.setLayout(new BorderLayout());
        this.setForeground(Color.BLACK);
        this.add(emptyTextLabel, BorderLayout.WEST);
        this.add(iconImage, BorderLayout.EAST);
        DocumentListener listener = new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                emptyTextLabel.setVisible(getText().isEmpty());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                emptyTextLabel.setVisible(getText().isEmpty());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                emptyTextLabel.setVisible(getText().isEmpty());
            }
        };
        this.getDocument().addDocumentListener(listener);
    }

    public String getEmptyText() {
        return emptyTextLabel.getText();
    }

    public void setEmptyText(String emptyText) {
        emptyTextLabel.setText(emptyText);
    }

    public BufferedImage getIcon() {
        return iconImage.getImage();
    }

    public void setIcon(BufferedImage icon) {
        iconImage.setImage(icon);
    }

    // Você pode usar este método se precisar fazer alterações no JLabel.
    public JLabel getEmptyTextLabel() {
        return emptyTextLabel;
    }

    // Você pode usar este método se precisar fazer alterações no JImage.
    public JImage getEmptyTextImage() {
        return iconImage;
    }
}