package javaapplication3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication3 {

    public static void main(String[] args) throws InterruptedException {

        isimyaz iy = new isimyaz();
        soyadyaz sy = new soyadyaz();
        iy.start();
        sy.sleep(100);
        sy.start();

    }

}

class isimyaz extends Thread {

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("SERHAN");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(isimyaz.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}

class soyadyaz extends Thread {

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("UÇAR");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(soyadyaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
