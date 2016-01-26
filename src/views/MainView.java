/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controller.Thread1;

/**
 *
 * @author umarmukhtar
 */
public class MainView {
    
    public static void main(String[] args) {
        
        Thread1 t1 = new Thread1();
        Thread run1 = new Thread(t1);
        run1.start();
    }
}
