package tour;


import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
	
	
	JButton b1, b2, b3, bt;
	JTextField t1;
	JPasswordField t2;
	
	Login(){
//		setSize(1900,800);
		//setVisible(true);
//		setLocation(0,0);
                setBounds(-10,-30,1900,1000);
		
		getContentPane().setBackground(Color.gray);
                setLayout(null);
 
                JLabel lbe=new JLabel("Konkan Tourism");
		lbe.setBounds(550,20,700,80);
		lbe.setFont(new Font("Century",Font.BOLD,50));
                lbe.setForeground(Color.blue);
                add(lbe);
                
                JLabel lbe1=new JLabel("\n \n\n \n- Journey to Haven");
		lbe1.setBounds(900,60,700,80);
		lbe1.setFont(new Font("Century",Font.BOLD,25));
                lbe1.setForeground(Color.blue);
		add(lbe1);
		
                 

//		setExtendedState(JFrame.MAXIMIZED_BOTH);
		JPanel p1= new JPanel();
		//p1.setBackground(new Color(255,204,204));
		p1.setBackground(Color.gray);
		//p1.setBackground( Color(255,230,230));
		p1.setBounds(230,150,480,500);
		add(p1);
		
		//p1.setLayout(null);
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("image/ragadv.png"));
		Image i2 = i1.getImage().getScaledInstance(480, 520, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
                l1.setBounds(230,50,480,520);
		l1.setLocation(230,50);
                p1.add(l1);
		
		JPanel p2 =new JPanel();
		p2.setLayout(null);
		p2.setBackground(new Color(200,250,200));
		p2.setBounds(800,150,430,500);
		add(p2);
                
                JLabel lb2=new JLabel("Login");
		lb2.setBounds(170,30,140,30);
		lb2.setFont(new Font("Century",Font.BOLD,25));
                lb2.setForeground(Color.blue);
		p2.add(lb2);
		
		
		JLabel l2=new JLabel("1.Username:");
		l2.setBounds(50,100,140,25);
		l2.setFont(new Font("Arial Black",Font.BOLD,18));
		p2.add(l2);
		
	    t1 = new JTextField();
		t1.setBounds(80,140,250,25);
		t1.setBorder(BorderFactory.createEmptyBorder());
		p2.add(t1);		
		
		JLabel l3=new JLabel("2.Password:");
		l3.setBounds(50,200,140,25);
		l3.setFont(new Font("Arial Black",Font.BOLD,18));
		p2.add(l3);
		
		 t2 = new JPasswordField();
		t2.setBounds(80,240,250,25);
		t2.setBorder(BorderFactory.createEmptyBorder());
		p2.add(t2);		
		
	    b1 = new JButton("Login");
	    b1.addActionListener(this);
		//b1.setBackground(new Color(255,204,204));
		//b1.setForeground(Color.black);
		b1.setForeground(Color.white);
		b1.setBackground(Color.blue);
		
		b1.setBorder(BorderFactory.createEmptyBorder());
		b1.setBounds(80,320,100,25);
		p2.add(b1);
		
	    b2 = new JButton("Signup");
	    b2.addActionListener(this);
		//b2.setBackground(new Color(255,204,204));
		b2.setForeground(Color.white);
		b2.setBackground(Color.blue);
		b2.setBorder(BorderFactory.createEmptyBorder());
		b2.setBounds(230,320,100,25);
		p2.add(b2);
		
		
	    b3 = new JButton("Forget Password");
	    b3.addActionListener(this);
		//b3.setBackground(new Color(255,204,204));
		//b3.setForeground(Color.black);
		b3.setForeground(Color.white);
		b3.setBackground(Color.blue);
		
		b3.setBorder(BorderFactory.createEmptyBorder());
		b3.setBounds(130,380,130,25);
		p2.add(b3);
		
		JLabel l4=new JLabel("Trouble in login...");
		l4.setForeground(Color.RED);
		l4.setBounds(240,350,140,25);
		l4.setFont(new Font("SAN_SERIF",Font.PLAIN,12));
		p2.add(l4);
                
              	
//		      bt = new JButton("Home");
//			
//			bt.setBounds(0,0,80,40);
//			bt.addActionListener(this);
//			add(bt);
		
             
                    setVisible(true);
                
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			try {
				String username = t1.getText();
				String password = t2.getText();
				
				if(t1.getText().equals(null) || t2.getText().equals(null)) {
					
					JOptionPane.showMessageDialog(null,"Incorrect username or password");
					System.exit(0);
				}
				
				String query = "select * from account where userName = '"+username+"' AND pass = '"+password+"'";
				Conn c= new Conn();
				ResultSet rs = c.s.executeQuery(query);
				if(rs.next()) {
					setVisible(false);
//					new Loading(username).setVisible(true);
			new Dashboard(username).setVisible(true);

				}
				else {
					JOptionPane.showMessageDialog(null,"Incorrect username or password");
				}
				
				
			}catch(HeadlessException | SQLException e) {
                         
			}
                        
			
		}
		else if(ae.getSource()==b2) {
			this.setVisible(false);
			new SignUp_1().setVisible(true);
		}
		else if(ae.getSource()==b3) {
			this.setVisible(false);
			new ForgotPassword().setVisible(true);
	
		}
                else if(ae.getSource()==bt) {
//			this.setVisible(false);
			new Dashboard(t1.getText()).setVisible(true);
                        
	
		}
		
	}
	public static void main(String [] args) {
		new Login();
		
		
		
	}

    private void setDefaultCloseOperation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	

}