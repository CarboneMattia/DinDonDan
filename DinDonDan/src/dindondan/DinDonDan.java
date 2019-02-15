/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindondan;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carbone_Mattia
 */
public class DinDonDan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            java.io.BufferedReader console = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
            ClasseDin th1 = new ClasseDin(false, true);
            ClasseDon th2 = new ClasseDon(false, true);
            ClasseDan th3 = new ClasseDan(false, true);
            
            th1.start();
            th2.start();
            th3.start();
            
            console.readLine();
            
            th1.interrupt();
            th2.interrupt();
            th3.interrupt();
            System.out.println("alla prossima");
        } catch (IOException ex) {
            Logger.getLogger(DinDonDan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
