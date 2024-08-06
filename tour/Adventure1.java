package tour;

import java.awt.event.*;
import java.awt.*;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.*;
import static tour.Dashboard.username;

public class Adventure1 extends JFrame implements ActionListener {
	
	JPanel p1,p2; JScrollPane sp;
	
	//JLabel l1,l3;
	
	JButton bt,b2;
	
	Adventure1(){
		
		
		
		 p1 = new JPanel();
		
			p1.setBackground(Color.LIGHT_GRAY);
			p1.setLayout(new GridLayout(10,0,10,0));
			
		b2 = new JButton();
		
		sp = new JScrollPane(p1);
		
			sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                        sp.setBackground(Color.CYAN);
			sp.setBounds(0,30,1530,800);
	
		
		 p2 = new JPanel();
			
			p2.setLayout(null);			
			p2.setBackground(Color.WHITE);		
			p2.setPreferredSize(getMaximumSize());		
			p2.add(sp);		p2.add(b2);
			
			
		
                
                        
			JLabel txt = new JLabel("Adventures");
			txt.setFont(new Font("Artifakt Element Heavy",Font.BOLD,24));
                        txt.setBounds(700,0,150,40);
				//txt.setEditable(false);
		
				p2.add(txt);
			
			
			ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/scuba.PNG"));			
			Image i2 = i1.getImage().getScaledInstance(700,500,Image.SCALE_DEFAULT );
			ImageIcon i3 = new ImageIcon(i2);									
			JLabel image0 = new JLabel(i3);
                        
			p1.add(image0);
			
			
			
			JTextArea txt1 = new JTextArea("""
                                                                                                                                   
                                                         \t                                                                       1).   Scuba Diving at Tarkarli
                                                       
                                                                                          Scuba Diving is a must for sure!
                                                                                          Tarkarli Scuba Diving is one of the most reliable and reputable scuba diving organizers with 
                                                                                          years of experience in offering a wide array of water sports in Malvan.
                                                                                          
                                                                                          your safety is our prime concern. We make sure everyone is ideally trained and mentored by M.T.D.C
                                                                                          before stepping in to this an amazing water sport. All the equipment used are fully assured by 
                                                                                          respective authorities, before you move to enjoy the thrilling world under the water.
                                                                                          
                                                                                          We have three boats to assist you have amazing time and you can relish this in your Tarkarli 
                                                                                          vacation through:                                             
                                                                                                            Dolphin spotting rides
                                                                                                            Jet-ski rides
                                                                                                            Banana rides and so on.
                                                                                          Tarkarli and Malvan are surely among the several gorgeous places in India to appreciate the 
                                                                                          exclusive fun of Scuba Diving. With abundant natural beauty, Tarkarli is one of the most beautiful 
                                                                                          beaches for your weekend trip. Our Scuba Diving service will let you explore exotic fishes, coral 
                                                                                          reefs, dolphins, sea plants and more. You will feel safe and secure with our professional driver.
                                                                                          Malvan will greet you with its exceptional picturesque surrounding, with several places to take 
                                                                                          selfies and photographs. You will love the enticing and tempting cuisine here!
                                                                                          
                                                                                          While engaged in scuba diving in Achare or underwater diving in Tarkarli, you will be using underwater 
                                                                                          breathing appliance, which helps you breathe underwater. To explore the world underwater, you need to
                                                                                          take assistance of the below mentioned equipment:                                                                                        
                                                                                                                                            Scuba Masks,
                                                                                                                                            Breathing Regulators,
                                                                                                                                            Fins And Gauges
                                                                                          Scuba diving at Tarkarli is a modern form of scuba diving, which is extremely simple and easy to learn.
                                                                                          All the general skills required to learn scuba diving at Tarkarli can be learned in couple of hours.
                                                                                          """);
			
			
				txt1.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt1.setEditable(false);
		
				p1.add(txt1);
		

			
		
			
			
		
		
			ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("image/flyboding.jpg"));		
			Image a2 = a1.getImage().getScaledInstance(900,700,Image.SCALE_DEFAULT );
			ImageIcon a3 = new ImageIcon(a2);						
			JLabel image1 = new JLabel(a3);
			p1.add(image1);	
			
			
			JTextArea txt2 = new JTextArea("""
                                                       
                                                       
                                                       \t                                                                   2). Flyboarding          
                                                       
                                                                                      Flyboarding in Malvan is relatively a new water sport that includes a combination of jet-ski and jetpack. The
                                                                                      hydro-flight gadget is attached to a jet ski that launches the rider as high as 15 metres in the air. Once you 
                                                                                      get the basics of the activity, you can flip, scoop, fly, and dive the way you want to. It’s best to team up
                                                                                      flyboarding with other activities like banana boat rides, parasailing, etc while opting for a reasonable Malvan 
                                                                                      water sports package.
                                  
                                                                                      Where to try: Malvan Beach, Tarkarli Beach
                                                                                      Average cost: ₹2500
                                                                                      Age limit: 16 and above
                                                                    
                                                                                     """);
			
				txt2.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt2.setEditable(false);
		
			p1.add(txt2);
		


		
			
			ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("image/para.jpg"));			
			Image b2 = b1.getImage().getScaledInstance(856,600,Image.SCALE_DEFAULT );
			ImageIcon b3 = new ImageIcon(b2);		
			JLabel image2 = new JLabel(b3);			
			p1.add(image2);

			
			
			JTextArea txt3 = new JTextArea("""
                                                       
                                                       
                                                       \t                                                                                  3). Parasailing
                                  
                                                                                                    Imagine flying like a bird in the sky while viewing the serenity of the ocean — that’s exactly what 
                                                                                                    parasailing in Malvan offers. This thrilling activity includes parasail equipment that is attached 
                                                                                                    to the speedboat with a 30-40 metre long rope. As the speedboat moves, the rope pulls up and within seconds 
                                                                                                    you reach the maximum height. Since two persons can enjoy parasailing at the same time, it’s a great activity 
                                                                                                    for couples.
                                                                                                    
                                                                                                    Where to try: Achara Beach, Devbagh Beach
                                                                                                    Average cost: ₹800
                                                                                                    Age limit: 10 and above
                                                                                                                                                                                                        
                                                                                                    
                                                                                                 
                                                         
                                                                                                            """);
			
			
				txt3.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt3.setEditable(false);
		
			p1.add(txt3);
			
				

			
			ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("image/rangana2.jpg"));			
			Image c2 = c1.getImage().getScaledInstance(800,420,Image.SCALE_DEFAULT );
			ImageIcon c3 = new ImageIcon(c2);		
			JLabel image3 = new JLabel(c3);			
			p1.add(image3);

			
			
			JTextArea txt4 = new JTextArea("""
                                                       
                                                       
                                                       \t                                                                                   Trekking (Rangana)
                                                                                                                           
                                                                                                     About Rangana Fort:
                                                                                                                     Rangana fort, situated in Bhudargad taluka, dates back to the “Shilahar” dynasty 
                                                                                                    (940 AD). This fort was built by King Bhoj of Shilahar dynasty. It was conquered by rulers of the
                                                                                                    Bahamani kingdom, and later by AdilShah. Shivaji Maharaj won the fort after slaying Afzal Khan in 
                                                                                                    1659. Later the fort was built on the orders of Chhatrapati Shivaji Maharaj.
                                                                                                                     
                                                                                                          Rangana is a massive fort with 65 structures. The five gates are still intact and 
                                                                                                    there are three small lakes atop the fort, flanked by extensive forests that play host to wild animals
                                                                                                    like bears and leopards.
                                                                                                                     
                                                                                                           Three hundred years back the fort area seems to be surrounded by thick forest. Considering
                                                                                                    today's unauthorized deforestation still the thick forest is there, so the fort is not easily visible
                                                                                                    to the visitors even they reach at the foot of the fort.
                                                                                                                     
                                                                                                    How to go-
                                                                                                          Rangnagad Base Point
                                                                                                          Rangana fort has access from two sides. One from Patgaon in Kolhapur District and another from
                                                                                                    Narur in Kudal taluka of Sindhudurg district.
                                                                                                                     
                                                                                                           From Kudal it is 24km away and 29kms from Sawantwadi. Road is well maintained up to the base point. 
                                                                                                    Search Rangnagad Base Point location in google map and it will take you to the right place.
                                                                                                                     
                                                                                                           Trek difficulty is simple to medium level, if you are physically fit you can access the top within 
                                                                                                    2 hours and beginner's may take 3 hours to complete the trek.
                                                                                                                     
                                                                                                           There is so much to explore on top so keep 2-3 hours to explore the fort.
                                                                                                                     
                                                                                                    Things to take care while trekking-
                                                                                                            The complete route is dense forest so package drinks and food facility is not available so better 
                                                                                                    carry your lunch and snacks.
                                                                                                                     
                                                                                                            you can cook your food on top so prepare likewise.
                                                                                                                     
                                                                                                            There are possibilities of facing wild animals so be alert while you are trekking or exploring the fort.
                                                                                                    When we were there we saw footprints of Indian bison/gaur.
                                                                                                                     
                                                                                                    Best time to visit-
                                                                                                            Monsoon is always best time to trek but if you avoid treks during rainy season September to march will
                                                                                                    be best time for Rangana trek. Even in September -October you can enjoy waterfalls and light drizzles which 
                                                                                                    doubles the joy of trek.
                                                                                                                     
                                                                                                            This fort has lot of water bodies so you can enjoy swimming here. At the base point there is small river
                                                                                                     where you can enjoy swimming and cooldown after end of the trek.   
                                                                                                     """);
			
				txt4.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt4.setEditable(false);
		
			p1.add(txt4);
		


			ImageIcon d1 = new ImageIcon(ClassLoader.getSystemResource("image/devzip.PNG"));			
			Image d2 = d1.getImage().getScaledInstance(900,667,Image.SCALE_DEFAULT );
			ImageIcon d3 = new ImageIcon(d2);		
			JLabel image4 = new JLabel(d3);			
			p1.add(image4);

			
			
			JTextArea txt5 = new JTextArea("""
                                                       
                                                       
                                                       \t                                                                                    Devgad Zipline
                                                       
                                                                                                       Flying Konkan Devgad Zipline is the first of its kind adventure sport activity along the coastal region of India,
                                                                                                        was launched and thrown open to public earlier this year.
                                                                                                       
                                                                                                       Vaishnavi Joil and Srikant Joil introduces coastal ziplining to the India as a unique adventure activity along the coast.
                                                                                                       
                                                                                                       Speaking about the journey and the vision, Vaishnavi Joil, Co-Founder, Flying Konkan Devgad ZIpline, said, “While
                                                                                                        we were already working on the zipline idea, we decided to make it count for the local community and worked around 
                                                                                                        a plan to offer training and employment for the local youth as well as rope in local women to curate a wholesome tourist
                                                                                                        experience, needed to put Devgad on the tourist map. In line with this, we have envisioned a lot of new offerings under 
                                                                                                        Flying Konkan and the zipline is just the first of several such initiatives.”
                                                                                                       
                                                                                                       Devgad is a quaint little beautiful beach town, along the picturesque Konkan coastline, and the Zipline offers breathtaking
                                                                                                        views of the beach and the seas.
                                                                                                       
                                                                                                       Apart from Zipline, Flying Konkan also plans to launch a surfing school to further enhance the reach of water sports beyond 
                                                                                                        just a form of entertainment. Through the surfing school, she also aims to provide skills and employment to local youth who
                                                                                                        can become instructors and volunteers.
                                  
                                                                                                       Quick details
                                                                                                       
                                                                                                       Where: Near Devgad beach windmill garden
                                                                                                       Cost: Rs 500/-
                                                                                                       Safety: It is very safe and the staff is helpful.
                                                                                                       Watch my Youtube video at Devgad Zipline.
                                                                                                       Who can do it: Everyone except people who fear heights. Kids can do it too.
                                                                                                       Website to make bookings: Flying Konkan
                                                                                                       Where to stay:Find out the best Devgad home stay.
                                                                                                        .""");
			
				txt5.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt5.setEditable(false);
		
			p1.add(txt5);
		


			
			
			
		bt = new JButton("Home");
			
			bt.setBounds(0,0,80,40);
			bt.addActionListener(this);
			p2.add(bt);
		
			
		this.pack();	
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setContentPane(p2);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Adventure1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()== bt) {
			
			setVisible(false);
			new Dashboard(username);
			
		}
		
	}

}
