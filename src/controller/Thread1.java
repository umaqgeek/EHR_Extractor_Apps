/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author umarmukhtar
 */
public class Thread1 implements Runnable {

    public static boolean status = true;
    long sleep = 1000 * 60 * 5;
    
    public void run() {
        
        while (status) {
            
            try {
                
                Date date1 = new Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                System.out.println("["+sdf1.format(date1)+"] Extracting ...");
                
                Main m = new Main();
                m.view();
                
                Date date2 = new Date();
                SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                System.out.println("["+sdf2.format(date2)+"] Done.");
                
                Thread.sleep(sleep);
                
            } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
                status = false;
            }
        }
    }
    
}