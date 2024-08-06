/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tour;


import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class Payment extends JFrame implements ActionListener{
	JButton pay,back;
    public Payment(){
        
        setLayout(null);
        setBounds(340, 30, 800, 750);
        
        JLabel label=new JLabel("Pay using Paytm");
        label.setFont(new Font("Raleway", Font.BOLD, 40));
        label.setBounds(50, 20, 350, 45);
        add(label);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("image/paytm.jpeg"));
        Image i8 = i7.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l4 = new JLabel(i9);
        l4.setBounds(0, 120, 800, 600);
        add(l4);
        
        pay = new JButton("Pay");
       
            /*public void actionPerformed(ActionEvent e) {
                pay.setVisible(true);
            }
        });*/
        pay.setBounds(420, 20, 80, 40);
        pay.addActionListener(this);
        add(pay);
    
        back=new JButton("Back");
        /*back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });*/
        back.setBounds(510, 20, 80, 40);
        add(back);
        
        getContentPane().setBackground(Color.cyan);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {
    	if(ae.getSource() == pay) {
    		setVisible(false);
    		Desktop d = Desktop.getDesktop();
                try {
                    d.browse(new URI("https://paytm.com/rent-payment"));
                } catch (URISyntaxException | IOException ex) {
                    Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                } 

    		setVisible(true);
    	    }
    }
    public static void main(String[] args){
        new Payment().setVisible(true);
    }
    
}