package tour;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import static tour.Dashboard.username;

public class KonkanForts extends JFrame implements ActionListener {
	
	JPanel p1,p2; JScrollPane sp;
	
	//JLabel l1,l3;
	
	JButton bt,b2;
	
	KonkanForts(){
		
		
		
		 p1 = new JPanel();
		
			p1.setBackground(Color.WHITE);
			p1.setLayout(new GridLayout(10,0,10,0));
			
		b2 = new JButton();
		
		sp = new JScrollPane(p1);
		
			sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			sp.setBounds(0,30,1530,800);
	
		
		 p2 = new JPanel();
			
			p2.setLayout(null);			
			p2.setBackground(Color.WHITE);		
			p2.setPreferredSize(getMaximumSize());		
			p2.add(sp);		p2.add(b2);
			
			
		/*ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/beaches.png"));			
			Image b = i.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT );
			ImageIcon be1 = new ImageIcon(b);									
			JLabel img = new JLabel(be1);
                        img.setBounds(250,0,500,300);
			p1.add(img);*/
                
                        
			JTextArea txt = new JTextArea("Forts");
			txt.setFont(new Font("ARIAL BLACK",Font.BOLD,22));
                        txt.setBounds(700,0,150,40);
				//txt.setEditable(false);
		
				p2.add(txt);
			
			
			ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/sin5.jpg"));			
			Image i2 = i1.getImage().getScaledInstance(700,500,Image.SCALE_DEFAULT );
			ImageIcon i3 = new ImageIcon(i2);									
			JLabel image0 = new JLabel(i3);
                        
			p1.add(image0);
			
			
			
			JTextArea txt1 = new JTextArea("""
                                                       \t                                                                              Sindhudurg Fort
                                                       
                                                                                                            Sindhudurg fort, located at a small islet surrounded by the boundless Arabian sea, 
                                                                                                            was the main Maratha headquarters to prepare for wars, battles and also to provide 
                                                                                                            security to Maratha people. The fort built on the orders of Shivaji took three years
                                                                                                            to complete with almost 100 architects from Portugal and a manpower of 3000. The
                                                                                                            fort is spread over an area of 48 acres with fortified walls, 12 ft thick and 29 ft
                                                                                                            high, stretch for 2 miles. Over 4000 mounds of iron were used in the casting and
                                                                                                            foundation stones were firmly laid down in lead.
                                                                                                                
                                                                                                            Sindhudurg fortress lies on the shore of Malvan town of Sindhudurg district in the 
                                                                                                            Konkan region of Maharashtra which is 450 kilometres south of Mumbai. The fort lies
                                                                                                            on a rocky island just off the coast of Malvan which is accessible by a boat from
                                                                                                            mainland. The district is named after the fort of Sindhudurg which means 'Fort in 
                                                                                                            the Sea'. Sindhudurg has 37 forts, the highest number of forts in Maharashtra as 
                                                                                                            well as all types of forts Jaldurg ( fort on Sea) , Bhuikot (fort on land) and Giri
                                                                                                            (fort on hilltop).
                                                                                                                                                                                                                        
                                                                                                            How to reach: Sindhudurg district's bus stand is well connected to all major cities
                                                                                                            in India via government operated buses. From there, direct buses are 
                                                                                                            available to reach Malvan Jetty.
                                                                                                                                                                                                                        
                                                                                                            Accommodation : Since Sindhudurg is a major tourist attraction, hotels are available
                                                                                                            in and around Malvan town.
                                                                                                                                                                                                                       
                                                                                                            Entry fee and timings : You can visit the fort everyday during day time from 10 am to
                                                                                                            5:30 pm. The entry fee for Indian tourists is 50 per person 
                                                                                                            while for tourists from outside India, it is 200 per person.                                                                                                         
                                                                                                                """);
			
			
				txt1.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt1.setEditable(false);
		
				p1.add(txt1);
		

			
		
			
			
		
		
			ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("image/vij1.PNG"));		
			Image a2 = a1.getImage().getScaledInstance(900,700,Image.SCALE_DEFAULT );
			ImageIcon a3 = new ImageIcon(a2);						
			JLabel image1 = new JLabel(a3);
			p1.add(image1);	
			
			
			JTextArea txt2 = new JTextArea("""
                                                       
                                                       
                                                       \t                                                                             Vijaydurg Fort
                                                       
                                                                                                     Vijaydurg fort is located in Devgad district. This fort was built by King Bhoj in 1205 and was 
                                                                                                     known as “Gheria”. Later Chatrapati Shivaji Maharaj took over this fort and named it “Vijaydurga”. 
                                                                                                     Vijaydurg fort was also known as “Eastern Gibraltar” as this fort was impregnable for a long time 
                                                                                                     like the fort “Gibraltar” in Europe. A dilapidated board at the entrance of the fort relates its 
                                                                                                     history. One of the best views of the fort is from the jetty. The fort stretches out into the sea and
                                                                                                     a walk inside its precincts is worthwhile. The earlier fort covered area of 5 acres and was surrounded by
                                                                                                     sea on all the 4 sides. Over the years the eastern trench was reclaimed and the road was constructed thereon.
                                                                                                     
                                                                                                     Chatrapati Shivaji Maharaj added triple rows of huge walls, umpteen towers and spacious inner buildings to
                                                                                                     it and strengthened it in the 17th century. Vijaydurg’s beach is a stretch of about a kilometer with good views 
                                                                                                     of the fort at the right and a small plateau with a hut to the left. Once naval bases, Vijaydurg fort and Sindhudurg 
                                                                                                     fort bear testimony to Maharashtra’s martial supremacy during Shivaji’s reign.
                                                                                                     
                                                                                                     This is only one of the two forts of the Maratha kingdom, where Chatrapati Shivaji Maharaj personally hoisted the 
                                                                                                     saffron flag. The other fort is “Torana”. This impregnable fort has advantage due to its location. One such advantage 
                                                                                                     is 40 km long waghotan/kharepatan Creek. The large size ships can not enter the shallow water of this creek and hence 
                                                                                                     Maratha warships were anchored in this creek. These ships were invisible from deep sea.""");
                                                                                              
                                                                                              
                                                                                               
                                                                  
                                                                                                                
                                  
			
				txt2.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt2.setEditable(false);
		
			p1.add(txt2);
		


		
			
			ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("image/murud5.PNG"));			
			Image b2 = b1.getImage().getScaledInstance(856,600,Image.SCALE_DEFAULT );
			ImageIcon b3 = new ImageIcon(b2);		
			JLabel image2 = new JLabel(b3);			
			p1.add(image2);

			
			
			JTextArea txt3 = new JTextArea("""
                                                       
                                                       
                                                       \t                                                                                    Murud-Janjira
                                                       
                                                                                                       Murud Janjira Fort is a mighty fortification located on an island off of the coastal village 
                                                                                                       of Murud, 55 km from Alibag in Maharashtra. Towering up from a massive rock amidst the stretching
                                                                                                       azure of the Arabian Sea, this fort has stood the test of time as well as the test of resilience 
                                                                                                       in the past. This fort is a must visit if you are travelling along the Konkan coast in Maharashtra.
                                                                                                       
                                                                                                       The fort, last revamped at the end of 17th century, still has most of its significant fortifications 
                                                                                                       standing intact except a few ruins inside. The main attractions of the magnificent fort are the three 
                                                                                                       colossal canons called Kalal Bangadi, Chavri and Landa Kasam. Once it stood firm and robust in defence with
                                                                                                       572 roaring canons, but now only these three can be witnessed. Made of a mixture of five metals, the canons 
                                                                                                        could shoot as much as 12 kilometres into the sea, as word of mouth goes.
                                                                                                 
                                                         
                                                                                                                How to Reach Murud Janjira Fort:
                                                                                                                         By Road
                                                                                                                               Murud Janjira Fort is approximately a 3-hour drive from Mumbai and a 
                                                                                                                               4-hour drive from Pune.
                                                                                                                                    
                                                                                                                         By Train
                                                                                                                               The nearest railway station to Murud Janjira is Roha Railway Station,
                                                                                                                               which is approximately 50 km away.
                                                                                                                                    
                                                                                                                         By Air
                                                                                                                               The nearest airport to Murud Janjira is Chhatrapati Shivaji International Airport in Mumbai.""");                                                                                                           
			
			
				txt3.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt3.setEditable(false);
		
			p1.add(txt3);
			
				

			
			ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("image/suvarnadurg.jpg"));			
			Image c2 = c1.getImage().getScaledInstance(800,420,Image.SCALE_DEFAULT );
			ImageIcon c3 = new ImageIcon(c2);		
			JLabel image3 = new JLabel(c3);			
			p1.add(image3);

			
			
			JTextArea txt4 = new JTextArea("""
                                                       
                                                       
                                                       \t                                                                                   Suvarnadurg Fort
                                                                                                                           
                                                                                                     Suvarnadurg is one of the several naval forts that Chhatrapati Shivaji Raje conquered in his lifetime. 
                                                                                                     This fort was of high importance to the Maratha kingdom. The name itself means Gold. The Suvarnadurga fort 
                                                                                                     is on an island in the Arabian sea and accessible only through the sea. If you plan to visit this fort, here is
                                                                                                     all the information you will need.
                                                                                                  
                                                                                                     Suvarnadurg is a heavily fortified structure that has all the bells and whistles of a fort where royalty lived 
                                                                                                     back in the day. It is home to several structures, but most of them are ruins today. You will find water tanks, 
                                                                                                     temples, and even what could be offices of royalty. The entire Suvarnadurg fort has 24 bastions. It also has three 
                                                                                                     sweet-water tanks, something that we have seen in the other forts as well. These tanks ensured that the residents 
                                                                                                     of the fort had a consistent water supply in case they could not venture out. You can also see two cannons that the
                                                                                                     Marathas used during the times of war and strife. Along with the water wells, you will also see three lakes within 
                                                                                                     the Suvarnadurg fort
                                  
                                                                                                     Suvarnadurg is an island fort, and the only way to reach the fort is via a boat ride. The journey to the island, the
                                                                                                     opportunity to experience village life, and the nearby beaches make the Suvarnadurg an integral part of fort
                                                                                                     tourism in Maharashtra.
                                                                                                     
                                                                                                     If you wish to travel to Suvarnadurg via train, you will need to journey from Sewri to Khed via train. 
                                                                                                     You can take private transport
                                                                                                     to Suvarnadurg. It will take six hours to travel from Mumbai to Suvarnadurg on a train.
                                                       
                                                                                                            """);
			
				txt4.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt4.setEditable(false);
		
			p1.add(txt4);
		


			ImageIcon d1 = new ImageIcon(ClassLoader.getSystemResource("image/raigallery.jpg"));			
			Image d2 = d1.getImage().getScaledInstance(900,667,Image.SCALE_DEFAULT );
			ImageIcon d3 = new ImageIcon(d2);		
			JLabel image4 = new JLabel(d3);			
			p1.add(image4);

			
			
			JTextArea txt5 = new JTextArea("""
                                                       
                                                       
                                                       \t                                                                                   Raigad Fort  
                                                       
                                                                                                        Raigad is one of the districts in Konkan Division of Maharashtra and Arabian Sea coast forms 
                                                                                                        western boundary of the district. Most hilly places of the District are in the Sahyadri mountain range.
                                                                                                        Previously known as Kolaba, it was rechristened as Raigad District.
                                                                                                                                     
                                                                                                        Raigad is known for its scintillating historical places, pristine beaches, picturesque landscapes and 
                                                                                                        diverse flora and fauna of Western Ghats. Religious places in the district like Ashtavinayak Temples, 
                                                                                                        Elephanta caves etc. are sole testimonies to its rich cultural past. Culturally, Raigad has been the 
                                                                                                        ever vibrant community with population of different religions, dialects, ethnicity etc. Few places in 
                                                                                                        the Raigad district are historic hinterland of the Bene-Israeli Jews.
                                                                                                                                     
                                                                                                        Raigad has been bestowed with surreal & magnificent forts viz. Raigad Fort, Kolaba Fort, 
                                                                                                        Murud-Janjira Fort, Sudhagad Fort etc. Dr. Babasaheb Ambedkar Technological University in Raigad, 
                                                                                                        is the only Technological University in the State of Maharashtra. From Industrial Complexes of national
                                                                                                        importance to the internationally renowned scientific institutions, Raigad is constantly taking strides 
                                                                                                        to the forefronts of 21st century.""");
			
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

	public static void main(String[] args) {
		
		new KonkanForts();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()== bt) {
			
			setVisible(false);
                        new Dashboard(username); 
			
		}
		
	}

}
