/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindondan;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carbone_Mattia
 */
public class ClasseDan extends Thread {

    private boolean uy, us;

    public ClasseDan(boolean uye, boolean use) {
        uy = uye;
        us = use;
    }

    @Override
    public void run() {
        boolean r = false;

        try {
            while (r == false) {

                System.out.println("DAN");
                if (uy == true) {
                    Thread.yield();
                }
                if (us == true) {
                    Thread.sleep(1000);
                }

                if (Thread.currentThread().isInterrupted()) {  //questo serve per lo yeld
                    break;
                }
            }
        } catch (InterruptedException ex) { //questo serve per lo sleep
            r = true;
        }

    }

}
