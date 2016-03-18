/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Config_Pack.Config;
import controller.Thread1;

/**
 *
 * @author umarmukhtar
 */
public class MainView {
    
    public static void main(String[] args) {
        
        String host = "ecss.utem.edu.my";
        int port = 1099;
        
        try {
            host = args[0];
        } catch (Exception e) {
        }
        
        try {
            port = Integer.parseInt(args[1]);
        } catch (Exception e) {
        }
        
        Thread1 t1 = new Thread1(host, port);
        Thread run1 = new Thread(t1);
        run1.start();
    }
}
