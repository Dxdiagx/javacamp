package javaapplication3;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class Odev2 extends JApplet implements MouseMotionListener, MouseListener {

    int nx, ny = -10;
    String s = "";
    Color a;

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(500, 500);

    }

    public void paint(Graphics g) {
        g.setColor(a);
        g.drawString(s, nx, ny);

    }

    public void degerleriGir(String e, int x, int y, Color a) {
        this.a = a;
        s = e;
        nx = x;
        ny = y;
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent me) {
    }

    @Override
    public void mouseMoved(MouseEvent me) {
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getButton() == MouseEvent.BUTTON3) {
            System.exit(0);
        } else if (me.getButton() == MouseEvent.BUTTON1) {
            degerleriGir("Serhan", me.getX(), me.getY(), Color.WHITE);
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        if (me.getButton() == MouseEvent.BUTTON3) {
            System.exit(0);
        } else {
            degerleriGir("Serhan", me.getX(), me.getY(), Color.BLUE);
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

}
