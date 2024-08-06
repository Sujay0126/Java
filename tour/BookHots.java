package tour;

import java.awt.*;


import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import static tour.Dashboard.username;

public class BookHots extends JFrame implements ActionListener ,ItemListener{
	
		JComboBox c1,c2,c3;
                JLabel l5,l,lu1;

	 	JButton b0,b1,b5,bk;	JTextField t,t1,pn1,el1,tp1,dl1 ;	static JLabel image;
	
		String []s1 = {"Alibaug","Mahad","Chiplun","Dapoli","Malvan"};	
		String []s2 = {"AC","Non/AC"}; 		
		String []s3 = {"Hotel Pride","Konkan Dreams","Malvan Heritage","Konark Residencies","Hotel Blue Bird","River view point"};
			
	
		Login lg;
                
                
    

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
                
                
                
                
                
                String ss;
		
		BookHots (){
		
                lg = new Login();
                
		lg.setVisible(false);
                
                ss =lg.t1.getText();
                this.setBounds(-10,-30,1900,1000);
//		this.setExtendedState(MAXIMIZED_BOTH);
		
		
		JPanel p1 = new JPanel();
		
			p1.setLayout(new FlowLayout());
			p1.setBackground(new Color(240,0,180));
	
		JPanel p2 = new JPanel();
			
			p2.setBounds(270,50,1000,700);
			p2.setLayout(null);
			add(p2);
			
			add(p1);	
			
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/goa.jpg"));
			
		Image i2 = i1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT );
		ImageIcon i3 = new ImageIcon(i2);
			
		image = new JLabel(i3);
			
		image.setBounds(0,0,1000,700);
			
		p2.add(image);
			
		JLabel l1 = new JLabel("	\t        Hotels");
		
			l1.setBounds(320,50,350,50);
			l1.setForeground(Color.WHITE);
			l1.setFont(new Font("",Font.BOLD,52));
			
		image.add(l1);
                
            JLabel lu = new JLabel("username       :");
                lu.setBounds(40, 150, 300, 50);
                lu.setForeground(Color.WHITE);
                lu.setFont(new Font("",Font.BOLD,28));

		image.add(lu);
             
             l = new JLabel("");
                l.setBounds(300, 150, 300, 50);
                l.setForeground(Color.WHITE);
                l.setFont(new Font("",Font.BOLD,28));
                
                l.setText(ss);

		image.add(l);
                
                
                
                 lu1 = new JLabel(username);
		lu1.setBounds(340, 150, 300, 50);
                lu1.setForeground(Color.WHITE);
               	lu1.setFont(new Font("",Font.BOLD,28));
                
		image.add(lu1);
                
                /*JLabel id1 = new JLabel("ID :");
		id1.setBounds(550, 150, 300, 50);
                id1.setForeground(Color.WHITE);
               id1.setFont(new Font("",Font.BOLD,30));

		//image.add(id1);
                   
                
                    JLabel idl = new JLabel();
		idl.setBounds(750, 150, 300, 50);
                idl.setForeground(Color.WHITE);
               	idl.setFont(new Font("",Font.BOLD,30));
                
		//image.add(idl);*/
                
                JLabel la3 = new JLabel("Total Persons  :");
		la3.setBounds(550, 150, 300, 50);
                la3.setForeground(Color.white);
               la3.setFont(new Font("",Font.BOLD,28));

		image.add(la3);
                
                  t1 = new JTextField("");
                
		t1.setBounds(800, 165, 150, 25);
                t1.setForeground(Color.black);
               t1.setFont(new Font("",Font.BOLD,20));

		image.add(t1);
                
                JLabel tp = new JLabel("Date of Arrival: :");
		tp.setBounds(550, 200, 300, 50);
                tp.setForeground(Color.white);
               tp.setFont(new Font("",Font.BOLD,28));

		image.add(tp);
                
                 tp1 = new JTextField("YY/MM//DD");
                tp1.setText("");
		tp1.setBounds(800, 215, 150, 25);
                tp1.setForeground(Color.black);
               tp1.setFont(new Font("",Font.BOLD,20));

		image.add(tp1);
                
                JLabel dl = new JLabel("Date of leaving: :");
		dl.setBounds(550, 250, 300, 50);
                dl.setForeground(Color.white);
               dl.setFont(new Font("",Font.BOLD,28));

		image.add(dl);
                
                 dl1 = new JTextField("YY/MM//DD");
                dl1.setText("");
		dl1.setBounds(800, 265, 150, 25);
                dl1.setForeground(Color.black);
               dl1.setFont(new Font("",Font.BOLD,20));

		image.add(dl1);
                
                JLabel pn = new JLabel("Phone no:");
		pn.setBounds(550, 300, 300, 50);
                pn.setForeground(Color.white);
               pn.setFont(new Font("",Font.BOLD,28));

		image.add(pn);
                
               pn1 = new JTextField();
                pn1.setText("");
		pn1.setBounds(800, 315, 150, 25);
                pn1.setForeground(Color.black);
               pn1.setFont(new Font("",Font.BOLD,20));

		image.add(pn1);
                
                 JLabel el = new JLabel("Email Id:");
		el.setBounds(550, 350, 300, 50);
                el.setForeground(Color.white);
               el.setFont(new Font("",Font.BOLD,28));

		image.add(el);
                
                 el1 = new JTextField();
                el1.setText("");
		el1.setBounds(800, 365, 150, 25);
                el1.setForeground(Color.black);
               el1.setFont(new Font("",Font.BOLD,20));

		image.add(el1);
                
               

		

                

                
              
		
		JLabel l2 = new JLabel("select city    :");
		
			l2.setBounds(40,200,350,50);
			l2.setForeground(Color.white);
			l2.setFont(new Font("",Font.BOLD,30));
		
		image.add(l2);
			
		JLabel l3 = new JLabel("select type   :");
		
			l3.setBounds(40,385,400,50);
			l3.setForeground(Color.white);
			l3.setFont(new Font("",Font.BOLD,30));
		
		image.add(l3);
		
		JLabel l4 = new JLabel("select hotel  :");
		
			l4.setBounds(40,270,400,50);
			l4.setForeground(Color.WHITE);
			l4.setFont(new Font("",Font.BOLD,30));
			
		image.add(l4);
			
		
		
		c1 = new JComboBox(s1);
		
			c1.setBounds(300,215,200,28);
			c1.setFont(new Font("",Font.PLAIN,18));
			c1.addActionListener(this);
			c1.addItemListener(this);
		
		image.add(c1);
		
			
		c2 = new JComboBox(s2);
		
		c2.setBounds(300,400,200,28);
		c2.setFont(new Font("",Font.PLAIN,18));
		c2.addActionListener(this);

		image.add(c2);
		

		
		c3 = new JComboBox(s3); //combox for select hotel
		
		c3.setBounds(300,320,200,28);
		c3.setFont(new Font("",Font.PLAIN,18));
		c3.addActionListener(this);
		
		image.add(c3);
		

	
			
		t = new JTextField();
		
			t.setBounds(490,425,200,25);
			t.setBorder(BorderFactory.createEtchedBorder());

//		image.add(t);
		
		b1 = new JButton("Home");
		
		b1.setBounds(250,550,100, 25);
		b1.setFont(new Font("",Font.PLAIN,18));
		b1.addActionListener(this);
		image.add(b1);

		
		b0 = new JButton("Show");
		
		b0.setBounds(300,285,100, 25);
		b0.setFont(new Font("",Font.PLAIN,18));
		b0.addActionListener(this);
      	
		image.add(b0);
    		
    		 
                b5 = new JButton("Book");
		
		b5.setBounds(600,550,100, 25);
		b5.setFont(new Font("",Font.PLAIN,18));
		b5.addActionListener(this);
      	
		image.add(b5);
                
                    
    		
    		
                
		this.setVisible(true);
                                
	}
		
		
		
		@Override
		public void itemStateChanged(ItemEvent e) {

							
		}

				
		
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		String city,s1,s2,s3,s4,s5;
		
		city = (String)c1.getSelectedItem();
               
		if(ae.getSource()==b1) {
			
				
				setVisible (false);
				new Dashboard(username);
		}
					
	
		if(ae.getSource()== b0) {			
			
			s1 ="Sahyadri";s2 ="MoonLight";s3="Annapurna";s4="Hotel Aradhya";s5="Hotel Blue Bird";
			
					
			if(city == "Chiplun") {
				
				c3.removeAllItems();
				
				c3.addItem(s1);		c3.addItem(s2);		c3.addItem(s3);		c3.addItem(s4);
			
							
			}
			
			else if(city == "Mahad") {
				
			s1="Saisha Palace";s2="North Fort";s3="Mahad view point";s4="Hotel Pearl";	
			
			c3.removeAllItems();
			
				c3.addItem(s1);		c3.addItem(s2);		c3.addItem(s3);		c3.addItem(s4);
				
								
			}
			
			else if(city == "Alibaug") {
				
				s1="Queens Palace";s2="Vickys Guest House";s3="Hotel blue bird";s4="Kanishk Villas";s5="Coastal Bayy";	
				
				c3.removeAllItems();
				
					c3.addItem(s1);		c3.addItem(s2);		c3.addItem(s3);		c3.addItem(s4);	c3.addItem(s5);				
			
			}
			
			
			else if(city == "Dapoli") {
				
				s1="Hotel Suvarnadurg";s2="Nakshtra tower";s3="Dapoli center";s4="Spian suits";s5="Larannya palace";	
				
				c3.removeAllItems();
				
					c3.addItem(s1);		c3.addItem(s2);		c3.addItem(s3);		c3.addItem(s4);	c3.addItem(s5);				
			
			}
			
			else if(city == "Malvan") {
				
				s1="Konkan Dreams";s2="Hotel Pride";s3="Shatataraka Homestay";s4="Hotel River view point";s5="Malvan Heritage";	
				
				c3.removeAllItems();
				
					c3.addItem(s1);		c3.addItem(s2);		c3.addItem(s3);		c3.addItem(s4);	c3.addItem(s5);				
			
			}

			
		}
		
                /*if (ae.getSource() ==  b5) {
                    
                    String ct ,hot,ac,no;
                    ct = (String)c1.getSelectedItem();
                    hot = (String)c2.getSelectedItem();
                    ac = (String)c3.getSelectedItem();
                    
                    no = t.getText();
                    
                    try {
                        
                        Conn c = new Conn();                   
                        String query = "insert into cus values('"+ct+"', '"+hot+"', '"+ac+"' , '"+no+"')";
                    
                        c.s.executeQuery(query);
                    }
                    
                    catch(Exception e){
                        
                    }
                }*/
                   
        
                 
                else if(ae.getSource() == b5) {
                	
                           
                          
                            try{
                            	Conn c = new Conn();
                                
                                
	    			         String s = (String) c3.getSelectedItem(); 
                                

                                
	    			            if(lu1.getText().equals("")) {
	    			            	
	    			            	 JOptionPane.showMessageDialog(null, "Sorry! Can't Book");
	    			            }else {
                               String q1 = "insert into bookhotel values( '" +lu1.getText()+"','"+c1.getSelectedItem()+"','"+c2.getSelectedItem()+"','"+c3.getSelectedItem()+"','"+t1.getText()+"','"+tp1.getText()+"','"+dl1.getText()+"','"+pn1.getText()+"', '"+el1.getText()+"', '"+l5.getText()+"')";
                               c.s.executeUpdate(q1);
                                
	    			           JOptionPane.showMessageDialog(null, "Hotel  Booked Successfully");
                               setVisible(false);}
                            }catch(Exception ee){
	    			System.out.println(ee.getMessage());
                                JOptionPane.showMessageDialog(null, "Sorry! Can't Book\n Please fill your all infromation");
                                
                            }
                            
                	}
                	
		 

	}
		
			
		
		
	

	
	public static void main(String[] args) {
		
		new BookHots();
	}



	
}
