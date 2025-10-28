package fondos;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Image;

public class PanelConFondo extends JPanel {

    private Image imagen;

    public PanelConFondo(String pathImagen) {
        this.imagen = new ImageIcon(pathImagen).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
