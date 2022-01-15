/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.promecys.iexamenparcial.main;

import com.promecys.iexamenparcial.views.MainForm;
import static java.awt.Frame.MAXIMIZED_BOTH;

/**
 *
 * @author willj
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
                 new MainForm().setLocationRelativeTo(null);
                 new MainForm().setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }

}
