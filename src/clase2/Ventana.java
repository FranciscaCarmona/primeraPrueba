/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Ventana extends JFrame{
    
    public Ventana (){
        
        this.setLayout(new FlowLayout() );
        this.setSize(300, 100);
        
        JButton btn1 = new JButton ("Boton 1");
        JButton btn2 = new JButton ("Boton 2");
        JButton btn3 = new JButton ("Boton 3");
        
        btn1.addActionListener((e) -> {
          accionUno(e);  
        });
        
        btn2.addActionListener((e) -> {
          accionDos(e);  
        });
        
        btn3.addActionListener((e) -> {
          accionTres(e);  
        });
        
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
    }
    
    private void accionUno (ActionEvent e) {
        System.out.println("Se ha presionado el boton 1");
    }
    
    private void accionDos (ActionEvent e) {
        System.out.println("Se ha presionado el boton 2");
    }
    
    private void accionTres (ActionEvent e) {
        System.out.println("Se ha presionado el boton 3");
    }
}
