package Lib;

import java.awt.*;
import javax.swing.*;

public class RollingBall extends JPanel {
    public RollingBall() {

    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(120, 120, 50, 50);
        g.fillArc(120, 120, 50, 50, 360, 180);
    }
}