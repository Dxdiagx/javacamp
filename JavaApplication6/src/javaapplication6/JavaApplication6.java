package javaapplication6;

import java.applet.Applet;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication6 extends Applet implements Runnable {

    Thread th = new Thread(this);
    int r = 200;
    Color c;
    Random rr = new Random();
    int x = 200;
    int y = 200;
    int sayac = 0;

    public void init() {
        th.start();
        setSize(600, 600);

    }

    public void paint(Graphics g) {
        setBackground(Color.BLACK);
        g.setColor(c);
        g.fillOval(this.x, this.y, this.r, this.r);
        g.setColor(Color.WHITE);
        

    }

    public void kucult() throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            for (this.r = 200; this.r > 0; this.r = this.r - 1) {

                this.c = new Color(rr.nextInt(256), rr.nextInt(256), rr.nextInt(256));
                if (sayac%2==0) {
                    this.x+=1;
                    this.y+=1;
                }
                sayac++;
                Thread.sleep(10);
                repaint();
                c = Color.WHITE;
                Thread.sleep(1);
                repaint();

            }
            for (this.r = 0; this.r < 200; this.r = this.r + 1) {
                this.c = new Color(rr.nextInt(256), rr.nextInt(256), rr.nextInt(256));
                if (sayac%2==0) {
                    this.x-=1;
                    this.y-=1;
                }
                sayac++;
                Thread.sleep(10);
                repaint();
                c = Color.WHITE;
                Thread.sleep(1);
                repaint();
            }
        }

    }

    @Override
    public void run() {

        try {
            kucult();
        } catch (InterruptedException ex) {
            Logger.getLogger(JavaApplication6.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
