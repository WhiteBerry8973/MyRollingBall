package Lib;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RollingBall extends JPanel implements ActionListener {
    private int startAngle = 360, arcAngle = 180, BallSize = 50;
    private int x = getWidth()/2-BallSize/2;
    private int dx = -4;

    public RollingBall() {
        Timer timer = new Timer(30, this);
        timer.start();
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(x, getHeight()/2-BallSize/2, BallSize, BallSize);
        g.fillArc(x, getHeight()/2-BallSize/2, BallSize, BallSize, startAngle, arcAngle);
    }
    public void actionPerformed(ActionEvent e) {
        
        x += dx;
        startAngle -= dx;
    
        if (x < -BallSize) {
            x = getWidth();
        }
        repaint();
    }
}