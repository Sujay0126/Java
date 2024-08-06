
package tour;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import travel.management.systen.ImageOnJButton;
public class Maps extends JFrame implements ActionListener{
    JButton ViewMap,Back;
    JTextField T1;
    Choice sec;
    
    Maps()
    {
        setSize(1000, 450);
        setLocation(350, 200);
        setLayout(null);
       // getContentPane().setBackground(Color.WHITE);
        /*JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dest1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(550,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,0 ,450,420);
        p1.add(image);*/
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,30,1000,500);
        add(p2);
        
        JLabel txt = new  JLabel("Konkan Tourism");
			txt.setFont(new Font("Bauhaus 93",Font.BOLD,24));
                        txt.setBounds(340,0,180,30);
                        txt.setForeground(Color.red);
                        
                        p2.add(txt);
        
               ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/google1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(550,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,60 ,550,300);
        p2.add(image);

        JLabel yl = new JLabel("Your Location:- ");
         yl.setBounds(60,80,150,25);
         yl.setFont(new Font("ARIAL BLACK",Font .PLAIN, 14));
        p2.add(yl);
        T1 = new JTextField();
        T1.setBounds(60, 120, 300, 20);
        T1.setBorder(BorderFactory.createEmptyBorder() );
        p2.add(T1);
        setVisible(true);
        
        JLabel d = new JLabel("Destination:-  ");
        d.setBounds(60,170,150,25);
        d.setFont(new Font("ARIAL BLACK",Font .PLAIN, 14));
        p2.add( d);
        
        /*T2 = new JTextField();
        T2.setBounds(60, 150, 300, 30);
        T2.setBorder(BorderFactory.createEmptyBorder() );
        p2.add(T2);*/
        
        sec = new Choice ();
		
			sec.add("Devgad");
			sec.add("Alibaug");
                        sec.add("Ratnagiri");
                        sec.add("Chiplun");
                        sec.add("Sindhudurg");
                        sec.add("Malvan");
                        sec.add("Dapoli");
                        sec.add("Ganpatipule");
                        sec.add("Vengurala");
                        sec.add("Amboli");
                        sec.add("Guhagar");
                        sec.add("Khed");
                        sec.add("Kankavli");
                        sec.add("Kudal");

			sec.setBounds(60,210,300,150);
			
			p2.add(sec);
                        
         
		
        
       

        
        ViewMap = new JButton("View Map");
        ViewMap.setBounds(60,260,130,30);
        ViewMap.setBackground( new Color(133,193,233));
        ViewMap.setForeground(Color.WHITE);
        
        
        ViewMap.setBorder(new LineBorder(new Color(133,193,233)));
        ViewMap.addActionListener((ActionListener) this);
        p2.add(ViewMap);
        
        Back = new JButton("Home");
        Back.setBounds(230,260,130,30);
        Back.setBackground( new Color(133,193,233));
        Back.setForeground(Color.WHITE);
        
        Back.setBorder(new LineBorder(new Color(133,193,233)));
        Back.addActionListener((ActionListener) this);
        p2.add(Back);
        
        setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae)
    {
            if (ae.getSource()== Back)
            {
                    setVisible(false);
                    
                  
            }
            if (ae.getSource()== ViewMap)
            {
                 String yourLocation = T1.getText();
                 String Destination = sec.getSelectedItem();
                
                 setVisible(false);
                    Desktop d = Desktop.getDesktop();
                try {
                    d.browse(new URI("https://www.google.co.in/maps/dir/"+yourLocation+",+Maharashtra/"+Destination+",+Maharashtra/"));
                } catch (URISyntaxException | IOException ex) {
                    Logger.getLogger(ImageOnJButton.class.getName()).log(Level.SEVERE, null, ex);
                } 
                
                
            
                setVisible(true);
                
            }
            
    
    }
    public static void main(String[] args)
    {
            new Maps ();
    }
    
}







/*

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import static tour.Dashboard.username;
public class Maps extends JFrame implements ActionListener{
    JButton ViewMap,Back;
    JTextField T1;
    Choice sec;
    
    Maps()
    {
        setSize(1800, 800);
        setLocation(0, 0);
        setLayout(null);
       // getContentPane().setBackground(Color.WHITE);
        /*JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dest1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(550,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,0 ,450,420);
        p1.add(image);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,30,1800,800);
        p2.setBackground(Color.pink);
        add(p2);
        
        JLabel txt = new JLabel("***Konkan Tourism***");
			txt.setFont(new Font("Bauhaus 93",Font.BOLD,30));
                        txt.setBounds(610,20,500,30);
                        
                        p2.add(txt);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/google1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700,400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(700,100 ,700,400);
        p2.add(image);

        JLabel yl = new JLabel("1.Your Location:- ");
         yl.setBounds(130,200,300,33);
         yl.setFont(new Font("ARIAL BLACK",Font.BOLD, 22));
        p2.add(yl);
        T1 = new JTextField();
        T1.setBounds(130, 250, 300, 30);
        T1.setBorder(BorderFactory.createEmptyBorder() );
        p2.add(T1);
        setVisible(true);
        
        JLabel d = new JLabel("2.Destination:-  ");
        d.setBounds(130,300,250,33);
        d.setFont(new Font("ARIAL BLACK",Font .PLAIN, 22));
        p2.add( d);
        
        /*T2 = new JTextField();
        T2.setBounds(60, 150, 300, 30);
        T2.setBorder(BorderFactory.createEmptyBorder() );
        p2.add(T2);
        
        sec = new Choice ();
		
			sec.add("Devgad");
			sec.add("Alibag");
                        sec.add("Ratnagiri");
                        sec.add("Chiplun");
                        sec.add("Sindhudurg");
                        sec.add("Malvan");
                        sec.add("Dapoli");
                        sec.add("Ganpatipule");
                        sec.add("Vengurala");
                        sec.add("Amboli");
                        sec.add("Guhagar");

			sec.setBounds(130,350,300,1000);
			
			p2.add(sec);
                        
         
		
        
       

        
        ViewMap = new JButton("View Map");
        ViewMap.setBounds(350,400,130,30);
        ViewMap.setBackground( Color.BLACK);
        ViewMap.setForeground(Color.WHITE);
        
        
        ViewMap.setBorder(new LineBorder(new Color(133,193,233)));
        ViewMap.addActionListener((ActionListener) this);
        p2.add(ViewMap);
        
        Back = new JButton("Home");
        Back.setBounds(130,400,130,30);
        Back.setBackground( Color.BLACK);
        Back.setForeground(Color.WHITE);
        
        Back.setBorder(new LineBorder(new Color(133,193,233)));
        Back.addActionListener((ActionListener) this);
        p2.add(Back);
        
        setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae)
    {
            if (ae.getSource()== Back)
            {
                    setVisible(false);
                    new Dashboard(username);
                  
            }
            if (ae.getSource()== ViewMap)
            {
                 String yourLocation = T1.getText();
                 String Destination = sec.getSelectedItem();
                
                 setVisible(false);
                    Desktop d = Desktop.getDesktop();
                try {
                    d.browse(new URI("https://www.google.co.in/maps/dir/"+yourLocation+",+Maharashtra/"+Destination+",+Maharashtra/"));
                } catch (URISyntaxException | IOException ex) {
                    Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                } 
                
                
            
                setVisible(true);
                new Dashboard(username);
            }
            
    
    }
    public static void main(String[] args)
    {
            new Maps ();
    }
    
}*/