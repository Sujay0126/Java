package tour;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import static tour.Dashboard.username;

public class Beaches extends JFrame implements ActionListener {
	
	JPanel p1,p2; JScrollPane sp;
	
	//JLabel l1,l3;
	
	JButton bt,b2;
        
        public static void main(String[] args) {
		
		new Beaches();
	}
	
	Beaches(){
		
		
		
		 p1 = new JPanel();
		
			p1.setBackground(Color.WHITE);
			p1.setLayout(new GridLayout(5,0,0,0));
                     
			b2 = new JButton();
		
		
		sp = new JScrollPane(p1);
		
			sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			sp.setBounds(0,30,1530,800);
                        sp.setAutoscrolls(false);
                        sp.createVerticalScrollBar();
                        

                     
    
        
                        


		
                SwingUtilities.invokeLater(new Runnable() {
            
            public void run() {
 

            }
        });
                
                 
		 p2 = new JPanel();
			
			p2.setLayout(null);			
			p2.setBackground(Color.WHITE);	
                        p2.setLocation(0,0);
			p2.setPreferredSize(getMaximumSize());		
			p2.add(sp);		p2.add(b2);
			
	        
                        
			JLabel txt = new JLabel("Beaches");
			txt.setFont(new Font("ARIAL BLACK",Font.BOLD,22));
                        txt.setBounds(700,0,150,40);
				//txt.setEditable(false);
		
				p2.add(txt);
			
			
			ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/devgad.jpg"));			
			Image i2 = i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT );
			ImageIcon i3 = new ImageIcon(i2);									
			JLabel image0 = new JLabel(i3);
                        image0.setBounds(600, 100, 600,300 );
                        
			p1.add(image0);
			
			
			
			JTextArea txt1 = new JTextArea("""
                                                       \t                                                                              Devbaug Beach
                                                       
                                                                                                            devbaug beach is a very beautiful beach in Sindhudurg district. the
                                                                                                            white sand makes it much beautiful it is just 15 km long from malvan
                                                                                                            city. it is famous for its thrilling water sports, scuba diving, boating
                                                                                                            deep sea fishing & for its amazing fresh sea food .
                                                                                                                                                 
                                                                                                            At a distance of 30 km from Vijaydurg Fort and 101 km from Ratnagiri,
                                                                                                            Devgad Beach is a serene beach situated in Devgad town of Sindhudurg district.
                                                                                                                                                 
                                                                                                            Devgad is located on the Arabian Sea coast in the Konkan region of Maharashtra.
                                                                                                            The Devgad Beach is a popular picnic spot and lies just 1 km away from Devgad
                                                                                                            Bus Stand. The beach is sandwiched between the two small hills and there are 
                                                                                                            some windmills located on a cliff on one end. The greenery on the beach side 
                                                                                                            is marvelous. Activities like swimming and sunbathing can be enjoyed at this beach.
                                                                                                                                                 
                                                                                                            Devgad Beach is a very clean, nice and relaxing beach. It has an ancient temple
                                                                                                            on its shores. Close to the Devgad Beach is the famous Devgad Fort. 
                                                                                                            The beach also has a big harbor and a lighthouse. From the top of the lighthouse,
                                                                                                            one can enjoy the view of the passing by ships. Devgad is globally famous for its 
                                                                                                            delicious saffron colored Alphonso Mangoes.
                                                                   
                                                                                                            How to reach :
                                                                                                                         1}. Nearest Bus Stand - Malvan(12 km south)
                                                                                                                         2]. Nearest Railway Station - Kudal(35 km)
                                                                                                                         3]. nearest Airport - Chipi airport(20km )""");
			
			
				txt1.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt1.setEditable(false);
		
				p1.add(txt1);
		

			
		
			
			
		
		
			ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("image/Harihareshwar1.jpg"));		
			Image a2 = a1.getImage().getScaledInstance(900,700,Image.SCALE_DEFAULT );
			ImageIcon a3 = new ImageIcon(a2);						
			JLabel image1 = new JLabel(a3);
			p1.add(image1);	
			
			
			JTextArea txt2 = new JTextArea("""
                                                       
                                                       
                                                       \t                                                                             Harihareshwar beach
                                                       
                                                                                                     Harihareshwar beach is a very beautiful beach in Raigad district.Harihareshwar is
                                                                                                     a town in Raigad district, in Maharashtra,India. It is surrounded by three hills named
                                                                                                     Harihareshwar, Harshinachal and Pushpadri.The river Savitri enters the Arabian Sea 
                                                                                                     from the town of Harihareshwar.
                                                                                                     The very first and possibly the most common one of the lot has to be the Harihareshwar 
                                                                                                     beach which is considered the highlight of the town and is considered one of the 
                                                                                                     underrated beaches in Maharashtra. It is situated around the Raigad district and does 
                                                                                                     make up for one of the most beautiful spots. 
                                                                                              
                                                                                              
                                                                                               
                                                                  
                                                                                                                How to reach :
                                                                                                                              1] Harihareshwar is accessible by road and railway.
                                                                                                                                 It is connected to NH 66, Mumbai Goa Highaway.
                                                                                                                                 Maharashtra state transport buses are available 
                                                                                                                                 from mumbai, Pune and Shrivardhan to Harihareshwar. 
                                                       
                                                                                                                              2] Nearest Airport : Chhatrapati Shivaji Maharaj Airport 
                                                                                                                                                    Mumbai 189 km
                                                       
                                                                                                                              3] Nearest Railway Station : Mangaon 48 km""");
			
				txt2.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt2.setEditable(false);
		
			p1.add(txt2);
		


		
			
			ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("image/vengurala.JPG"));			
			Image b2 = b1.getImage().getScaledInstance(856,600,Image.SCALE_DEFAULT );
			ImageIcon b3 = new ImageIcon(b2);		
			JLabel image2 = new JLabel(b3);			
			p1.add(image2);

			
			
			JTextArea txt3 = new JTextArea("""
                                                       
                                                       
                                                       \t                                                                                   Vengurla beach
                                                       
                                                                                                       Vengurla is a town in Sindhudurg district ,It is just north of Goa. It is surrounded by 
                                                                                                       semi circular range of hills with lush green foliage mainly of cashew,mango,jackfruits 
                                                                                                       coconut, and different kinds of berry trees.the beach is very famous for the historic
                                                                                                       lighthouse & port .
                                                                                                       Vengurla Malvan Beach is located in the Sindhudurg district of Maharashtra at a distance
                                                                                                       of 514 km from Mumbai and 200 km from Ratnagiri. Vengurla Beach is well connected with 
                                                                                                       Ratnagiri by road and also with Kolhapur – the nearest railhead.
                                                                                                                             
                                                                                                       The history of Vengurla Beach dates back to the year of 1638 when the Dutch had a trade 
                                                                                                       settlement here and also continued their eight-month blockade of Goa from the same place.
                                                                                                
                                                                                                 
                                                         
                                                                                                            BEST TIME TO VISIT :
                                                                                                                SEP-FEB (peak season):-
                                                                                                                    *What to Expect : Plesant weather with low tempersture.
                                                                                                                    *Things you'will love : sighseeing and temple hopping.
                                                                                                                JUN-AUG(moderate season):-
                                                                                                                    *What to Expect : tropical rains along with humdity
                                                                                                                    *Things you'will love : The lush greenery.
                                                                                                                MAR-MAY(off season):-
                                                                                                                    *What to Expect : Hot and humid weather.
                                                                                                                                      and heavy offseason discount""");
			
			
				txt3.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt3.setEditable(false);
		
			p1.add(txt3);
			
				

			
			ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("image/dapoli.jpeg"));			
			Image c2 = c1.getImage().getScaledInstance(800,420,Image.SCALE_DEFAULT );
			ImageIcon c3 = new ImageIcon(c2);		
			JLabel image3 = new JLabel(c3);			
			p1.add(image3);

			
			
			JTextArea txt4 = new JTextArea("""
                                                       
                                                       
                                                       \t                                                                                   Dapoli beach
                                                                                                                           
                                                                                                     Dapoli is separated from the Sahyadri range and is bordered by the Khed taluk in the east,
                                                                                                     and is also bordered by Mandangad taluk in the north, Guhagar taluk to the south, and 
                                                                                                     Chiplun taluk to the southeast. The Arabian sea forms the sub-district's western border.
                                                                                                                            
                                                                                                     Dapoli has a seaboard of 50 km (31 mi) which stretches from Velas, Maharashtra Velas – Kelshi
                                                                                                     in the North to Dabhol in the South. The coastline differs in its general characteristics from 
                                                                                                     other parts of Konkan. It is densely covered by coconut farms. The principal rivers are Bharja 
                                                                                                     in the north and Vashishthi in the south. A small river called Jog river flows through Bandhativare, 
                                                                                                     Sarang and Tadil into the Arabian Sea. [2]
                                                                                                                            
                                                                                                     The town is located above a diamond mine located in the Earth's crust. The mine has over 900
                                                                                                     kilograms of diamond in it. It is located 8 km (5.0 mi) from the Arabian Sea. It also serves 
                                                                                                     as the headquarters of its namesake taluk and is a major centre for most villages nearby.
                                                                                                  
                                                                                                  
                                                       
                                                                                                            How to reach Dapoli:
                                                       
                                                                                                                 Road :
                                                                                                                    The NH17 connects this place to mumbai
                                                                                                                    and pune . State and priavte buses are 
                                                                                                                    available for dapoli travel from important 
                                                                                                                    cities in kokan and maharashtra.
                                                       
                                                                                                                 Railways: 
                                                                                                                     The nearest rail head ,KHED station is 
                                                                                                                     approximately 27 km from this destination
                                                                       
                                                                                                                 water :
                                                                                                                     you can also take a jetty from Ratnagiri 
                                                                                                                     and arrive here crossing Dabhol bay
                                                       
                                                                                                                 Air :
                                                                                                                     Mumbai- 300 km from Ratnagiri
                                                                                                                     Ratnagiri- Temperorily close
                                                                                                                     Chipi - 200 km away south""");
			
				txt4.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt4.setEditable(false);
		
			p1.add(txt4);
		


			ImageIcon d1 = new ImageIcon(ClassLoader.getSystemResource("image/nivati.jpg"));			
			Image d2 = d1.getImage().getScaledInstance(900,667,Image.SCALE_DEFAULT );
			ImageIcon d3 = new ImageIcon(d2);		
			JLabel image4 = new JLabel(d3);			
			p1.add(image4);

			
			
			JTextArea txt5 = new JTextArea("""
                                                       
                                                       
                                                       \t                                                                                    Nivati beach
                                                       
                                                                                                        Nivati beach had a stretch of white sand on which you will love to walk and this white 
                                                                                                        sand is being complemented with the turquoise blue sea. A combination that nature rarely 
                                                                                                        bestows upon something and Nivati beach is that lucky beach on whom nature has bestowed, 
                                                                                                        two of its brightest and eye-soothing colors.
                                                                                                                              
                                                                                                        But not only nature has made it rich, but history too has contributed to Nivati beach’s
                                                                                                        beauty and to the richness. In its proximity, you will find the Nivati Fort, which was 
                                                                                                        built by the great Maratha ruler and leader Chhatrapati Shivaji Maharaj in 1787 AD.
                                                                                                                              
                                                                                                        Shivaji Maharaj built this fort to make his naval force strong today you can find only 
                                                                                                        its ruins, covered with thorny bushes. But, the fort is still in a good condition and 
                                                                                                        from that fort, you can have the breathtaking, as well as the panoramic view of the sea 
                                                                                                        as well as of Nivati beach.
                                                       
                                                                                                                How to reach nivati? :
                                                       
                                                                                                                    By road :
                                                                                                                            1]. Kudal and Kankavli is well connected by 
                                                                                                                                MSRTC state transport buses.
                                                                                                                            2].Many private buses opertaing from munai pune.
                                                       
                                                                                                                    By Train:
                                                                                                                            1].Kankavali.
                                                                                                                            2].Kudal.
                                                                                                                    trains available:1] Sindhudurg Passenger 
                                                                                                                                     2] Poorna sf express
                                                                                                                                     3] Ernakulam Express
                                                                                                                                     4] Mumbai CST- Manguluru Express
                                                                                                                                     5] Madgaon Express""");
			
				txt5.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt5.setEditable(false);
		
			p1.add(txt5);
		


			
			
			
		bt = new JButton("Home");
			
			bt.setBounds(0,0,80,20);
			bt.addActionListener(this);
			p2.add(bt);
		
		this.pack();	
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setContentPane(p2);
		this.setVisible(true);
		
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()== bt) {
			
			setVisible(false);
                        new Dashboard(username); 
		}
		
	}

}
