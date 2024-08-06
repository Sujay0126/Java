
package tour;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static tour.Dashboard.username;

public class KonkanDivision extends JFrame implements ActionListener {
    JPanel p1,p2; JScrollPane sp;
	
	//JLabel l1,l3;
	
	JButton bt,b2;
    KonkanDivision(){
        /*setSize(1800,900);
        setLocation(0,0);
                setLayout(null);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                JPanel p = new JPanel();
		
                p.setBounds(0,0,1800,900);
		p.setBackground(Color.white);
		p.setLayout(null);
                add(p);
			
                //add(p);
                /*but1 = new JButton();
                but1.setBounds(0,0,500,500);
                but1.setBackground(Color.cyan);
        
        
       
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("image/vengurala.JPG"));
        Image i1 = c1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel l1 = new JLabel(i2);
        l1.setBounds(480,100,500,300);
        p.add(l1);*/
        
        
        p1 = new JPanel();
		
			p1.setBackground(Color.white);
			p1.setLayout(new GridLayout(3,0,0,0));
			
		b2 = new JButton();
		
		sp = new JScrollPane(p1);
		
			sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			//sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                        sp.setBackground(Color.CYAN);
			sp.setBounds(0,30,1530,1200);
	
		
		 p2 = new JPanel();
			
			p2.setLayout(null);			
			p2.setBackground(Color.WHITE);		
			p2.setPreferredSize(getMaximumSize());		
			p2.add(sp);		p2.add(b2);
			
			
		
                
                        
			
			
			
			ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/KonkanMap.jpg"));			
			Image i2 = i1.getImage().getScaledInstance(700,1000,Image.SCALE_DEFAULT );
			ImageIcon i3 = new ImageIcon(i2);									
			JLabel image0 = new JLabel(i3);
                        
			p1.add(image0);
			
			
			
			JTextArea txt1 = new JTextArea("""
                                                                                                                                   
                                                         \t                                                                            Konkan Division
                                                       
                                                                                                Extending from Bordi in the north to Redi Jetty and Shiroda in the south, the Konkan
                                                                                                region in Maharashtra is a shoreline of astounding natural beauty.
                                                                                                                          
                                                                                                A coastal strip of land bounded by Sahyadri hills on the east and Arabian Sea on the west, 
                                                                                                it is rich in mineral resources, and offers long stretches of clean, sandy beaches and bustling 
                                                                                                seaside towns such as Ratnagiri and Ganapatipule. If you are historically minded and willing to 
                                                                                                explore the might of the Maratha power under Chhatrapati Shivaji, then Sindhudurg lying on the shore
                                                                                                of Malvan town should be your port of call. For those that are more inclined towards adventure, Sindhudurg
                                                                                                offers some exciting snorkelling and scuba diving opportunities.Ratnagiri is the best place to base 
                                                                                                yourself while exploring the Konkan coast.This charming port town is famous for Alphonso mangoes, coconuts, 
                                                                                                jackfruits and a long stretch of black sandy beach with a backdrop of a 15th century fort
                                                                                                   
                                                                                                There have been changes in the names of districts and has seen also the addition of newer districts after India
                                                                                                gained Independence in 1947 and also after the state of Maharashtra was formed:
                                                                                            
                                                                                                Since 1947, the east-west tracts of Thane district on Salsette Island, starting with the City of Bandra, then Andheri,
                                                                                                then finally Borivali to Dahisar were carved out and added to the former Bombay, now 'Mumbai,' district. Recently, the
                                                                                                'Mumbai' district was bifurcated into the Mumbai & Mumbai Suburban districts; the latter covers Salsette Island.
                                                                                                In 1961, the Konkan region became a part of the newly formed state of Maharashtra. Prior to this it was a part of Bombay 
                                                                                                Presidency which was split to form Gujarat and Maharashtra.
                                                                                                Creation of the Sindhudurg from the southern areas of the Ratnagiri district.
                                                                                                The erstwhile Kolaba district was renamed as Raigad.
                                                                                                In 2014, Palghar district was carved out of Thane district with the inclusion of the northern parts of Thane district which
                                                                                                district which include Palghar, Vada, Vikramgad, Jawhar, Mokhada, Dahanu, and Talasari Vasai talukas in the new district
                                                                                                The Konkan Division is one of the six administrative divisions of Maharashtra state in India. It comprises the
                                                                                                northern and central portions of the greater Konkani region, which were absorbed into Maharashtra owing to the 
                                                                                                States Reorganisation of India. Konkan Division is the western section of present-day Maharashtra, along the west 
                                                                                                coast of India. The two districts of the state capital Mumbai (formerly Bombay) also fall into this division.The most
                                                                                                spoken language is Marathi, which is also the sole official language of the region. Due to the presence of large number 
                                                                                                of migrants in the Mumbai Metropolitan Region and other parts of Konkan; Hindi, Urdu and regional languages are 
                                                                                                are also spoken by a significant portion of the population as their first language.""");
			
			
				txt1.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt1.setEditable(false);
                                
                                
                        bt = new JButton("Home");
			
			bt.setBounds(0,0,80,40);
			bt.addActionListener((ActionListener) this);
			p2.add(bt); 
                        p1.add(txt1);
		
				
                                
                                this.pack();	
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setContentPane(p2);
		
       
        
    
            setVisible(true);
    }
    
    
    public void demo(){
    
        setVisible(false);
    
    }
    @Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()== bt) {
			
		KonkanDivision kd = new KonkanDivision();
                kd.demo();
			
		}
                
		
	}



    public static void main(String[] args){
        
        new KonkanDivision();
    }
    }

