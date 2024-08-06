package tour;

import java.awt.Choice;
import java.awt.Color;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;

import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;

public class SignUp_1 extends JFrame implements ActionListener {
	
	JButton b2,b1, bt;
	JTextField t1,t2,t3,t4, tn1, tn2;
	Choice sec;
	
	SignUp_1(){
		
		super("DEMO FRAME FOR SIGN UP");
	    //creating frame layout
		setBounds(-10,-60,1580,900);
                getContentPane().setBackground(Color.gray);
		setLayout(null);
		
		//creating panel
		JPanel p = new JPanel();
		
			p.setBounds(450,140,650,650);
			p.setBackground(Color.cyan);
			p.setLayout(null);
			
//                   bt = new JButton("Back");
//			
//			bt.setBounds(20,45,80,40);
//			bt.addActionListener(this);
//			add(bt);
//		
		JLabel l = new JLabel("WELCOME @KONKAN TOURISM");
		
			l.setBounds(520,55,600,50);
			l.setFont(new Font("forte",Font.BOLD,32));
			l.setForeground(Color.white);
		
			add(l);
			
				
               JLabel l2 = new JLabel("Enter Your Name :");
	
		l2.setBounds(150,75,300,100);
		l2.setFont(new Font("SERIA",Font.BOLD,15));
		l2.setForeground(Color.YELLOW);
			
			p.add(l2);
			
	
		JLabel l3 = new JLabel("USERNAME :");
	
			l3.setBounds(150, 123, 300, 100);
			l3.setFont(new Font("SERIA",Font.BOLD,15));
			l3.setForeground(Color.yellow);
		
			p.add(l3);
			
		JLabel l4 = new JLabel("PASSWORD :");
			
			l4.setBounds(150, 180, 300, 100);
			l4.setFont(new Font("SERIA",Font.BOLD,15));
			l4.setForeground(Color.yellow);
		
			p.add(l4);
                        
                 JLabel la3 = new JLabel("Address :");
	
			la3.setBounds(150, 235, 300, 100);
			la3.setFont(new Font("SERIA",Font.BOLD,15));
			la3.setForeground(Color.yellow);
		
			p.add(la3);
			
		JLabel la4 = new JLabel("Mobile No. :");
			
			la4.setBounds(150, 290, 300, 100);
			la4.setFont(new Font("SERIA",Font.BOLD,15));
			la4.setForeground(Color.yellow);
		
			p.add(la4);
		
			
		JLabel l5 = new JLabel("SECURITY QUESTIONS :");
			
			l5.setBounds(150, 330, 200, 100);
			l5.setFont(new Font("SERIA",Font.BOLD,15));
			l5.setForeground(Color.yellow);
		
			p.add(l5);
		
			
		JLabel l6 = new JLabel("ANSWER :");
			
			l6.setBounds(150, 380, 300, 100);
			l6.setFont(new Font("SERIA",Font.BOLD,15));
			l6.setForeground(Color.yellow);
		
			p.add(l6);
		
			
		 sec = new Choice ();
		
			sec.add("What is Your Favourite Place ?");
                        sec.add("What is Your Favourite Hill Station ? ");
			sec.add("What is Your Favourite Song ? ");
                        sec.add("What is Your Favourite Actor Name ? ");
			sec.add("What is Your Nickname ? ");
			sec.add("What is Your Birthdate ? ");
			
			sec.setBounds(787,510,200,200);
			
			add(sec);
		
		 t1 = new JTextField("",10);	
		
			t1.setBounds(290, 115, 200,20);			
                        t1.setBorder(BorderFactory.createEmptyBorder());
			p.add(t1);
	
	
		 t2 = new JTextField("",20);
	
			t2.setBounds(255,163, 200, 20);
			t2.setBorder(BorderFactory.createEmptyBorder());
			p.add(t2);
		
			
		 t3 = new JTextField("",20);
			
			t3.setBounds(255,220, 200, 20);
			t3.setBorder(BorderFactory.createEmptyBorder());
			p.add(t3);
                        
                 tn1 = new JTextField("",20);
			
			tn1.setBounds(255,275, 200, 20);
			tn1.setBorder(BorderFactory.createEmptyBorder());
			p.add(tn1);

			
		 tn2 = new JTextField("",20);
			
			tn2.setBounds(255,330, 200, 20);
			tn2.setBorder(BorderFactory.createEmptyBorder());
			p.add(tn2);
		

			
		 t4 = new JTextField("",20);
			
			t4.setBounds(255,420, 200, 20);
			t4.setBorder(BorderFactory.createEmptyBorder());
			p.add(t4);
		
			
		b2 = new JButton("CREATE");
			
			b2.setBounds(280,480,88,35);
			b2.addActionListener(this);
			p.add(b2);
			
		b1 = new JButton ("BACK");
			
			b1.setBounds(100,550,81,35);
			b1.addActionListener(this);
			
			p.add(b1);
			
			
			
		JCheckBox c1 = new JCheckBox("Save Password");
		
			c1.setBounds(500,550,120,40);
			c1.setBackground(Color.white);
                        
			p.add(c1);
	
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/dest1.jpg"));
		//image @Devbaug beach_Malvan ...
		
		Image i2 = i1.getImage().getScaledInstance(650,650,Image.SCALE_DEFAULT );
		ImageIcon i3 = new ImageIcon(i2);
		
		//JLabel t = new JLabel("KONKAN TOURISM");
		
		JLabel image = new JLabel(i3);
		
		image.setBounds(0,0,650,650);
		p.add(image);
		
		
		add(p);
		setVisible(true);
	}
	
    /**
     *
     * @param ae
     */
    @Override
	public void actionPerformed ( ActionEvent ae ) {
		
		if (ae.getSource()==b2) {
			
			String customer_Name = t1.getText();
			String userName = t2.getText();
			String pass = t3.getText();
                        String address = tn1.getText();
                        String mobile_no = tn2.getText();
			String que = sec.getSelectedItem();
			String ans = t4.getText();
			
			String query = "insert into account values('"+customer_Name+"','"+userName+"','"+pass+"','"+address+"','"+mobile_no+"','"+que+"','"+ans+"')";
                    
                       if(0 == userName.length() ){
                                      JOptionPane.showMessageDialog(null,"All Fields are required!");
                                
                       }
                        else if ( pass.length() < 8 ){
                                      JOptionPane.showMessageDialog(null,"Password should be 8 character");
                                
                                
                                }
                       else if ( que.length() == 0 ){
                                      JOptionPane.showMessageDialog(null,"All Fields are required !");
                                
                                
                       }
                        else if ( customer_Name.length() == 0 ){
                                      JOptionPane.showMessageDialog(null,"Password should be 8 character");
                                
                                
                                }
                       else if ( address.length() == 0 ){
                                      JOptionPane.showMessageDialog(null,"All Fields are required !");
                                
                                
                                }
                       else if ( mobile_no.length() != 10 ){
                                      JOptionPane.showMessageDialog(null,"Field 10 digit Mobile number !");
                                
                                
                                }
                       else if ( ans.length() == 0 ){
                                      JOptionPane.showMessageDialog(null,"All Fields are required !");
                                
                                
                                }
                        
                       else{ 
                        
			try {
				
				Conn c = new Conn();
				c.s.executeUpdate(query);
				
				JOptionPane.showMessageDialog(null,"Account created Succesfully");
				
				setVisible (false);
				new Login();
			}
			catch(HeadlessException | SQLException e) {
                            System.out.print(e);
                            
//                            JOptionPane.showMessageDialog(null," Something Went Wrong or Username Already Exists!");
                        

			}
                       }
                }
                   if (ae.getSource()==b1){
			
			setVisible ( false );
			new Login();
                      }
		
		
		
	
        }
	
	
	public static void main(String[] args) {
		
		new SignUp_1();
	}

}