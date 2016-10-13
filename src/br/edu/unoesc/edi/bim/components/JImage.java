package br.edu.unoesc.edi.bim.components;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 * Créditos ao @author Victor Stafusa que desenvolveu essa classe e disponibilizou no stackoverflow.
 * 
 */
public class JImage extends JComponent {

    private static final long serialVersionUID = 1L;
    private BufferedImage image;

    public JImage() {
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
        Dimension d = new Dimension(image == null ? 0 : image.getWidth(), image == null ? 0 : image.getHeight());
        this.setPreferredSize(d);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (image == null) return;
        g.drawImage(image, 0, 0, null);
    }
    
    public static BufferedImage loadIcon(String src) {
        try {
            return ImageIO.read(new File(src));
        } catch (IOException e) {
            return null;
        }
    } 
}
