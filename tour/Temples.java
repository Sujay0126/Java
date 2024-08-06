package tour;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import static tour.Dashboard.username;

public class Temples extends JFrame implements ActionListener {
	
	JPanel p1,p2; JScrollPane sp;
	
	//JLabel l1,l3;
	
	JButton bt,b2;
	
	Temples(){
		
		
		
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
			
			
		
                
                        
			JLabel txt = new JLabel("Temples");
			txt.setFont(new Font("Artifakt Element Heavy",Font.BOLD,24));
                        txt.setBounds(700,0,120,40);
				//txt.setEditable(false);
		
				p2.add(txt);
			
			
			ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/ganpatipule.jpeg"));			
			Image i2 = i1.getImage().getScaledInstance(700,500,Image.SCALE_DEFAULT );
			ImageIcon i3 = new ImageIcon(i2);									
			JLabel image0 = new JLabel(i3);
                        
			p1.add(image0);
			
			
			
			JTextArea txt1 = new JTextArea("""
                                                                                                                                   
                                                         \t                                                                            Ganpatipule Mandir
                                                       
                                                                                          Beach town on the Konkan coastline, Ganpatipule has temples of Lord Ganesha as major attractions 
                                                                                          apart from the beautiful virgin beaches.
                                                                                                                         
                                                                                          Ganpatipule is a small town in the Ratnagiri district in Konkan region with a long stretch of  
                                                                                          pristine beaches, Ganpatipule is a perfect idyllic getaway in the slip of nature. Confluence of  
                                                                                          beach with river could be witnessed along with a hill shaped like Ganpati, the Hindu God of worship.
                                                                                          The village of Ganapatipule is famous for its 400-year-old Ganesha temple. The idol is said to be a 
                                                                                          self-created monolith of Lord Ganesha, allegedly discovered 1600 years ago. Untouched by commercialism 
                                                                                          Ganapatipule makes for a great destination for peace-seekers, beach lovers and pilgrim alike. 
                                                                                          also has water sports to offer between the months of November-May. Ganpatipule is typically clubbed 
                                                                                          with Ratnagiri and other smaller villages like Velneshwar, Malgund and Pawas for a perfect 2-3 day trip.
                                                                                          Ganpatipule town is situated approximately 375 km. south of Mumbai city, along the Konkan Coast. 
                                                                                          It is situated in a small town which have about 100 houses. The beach present near the town is a popular 
                                                                                          tourist destination.
                                     
                                                                                          The Ganpatipudhe temple has Swayambhu murti. Every year thousands of devotees across Maharashtra visit 
                                                                                          the temple. The murti is facing West,[5] Ganapatipule town is rich in flora, it have plenty of mangroves 
                                                                                          and coconut trees.
                                     
                                                                                          The town is governed by the Ganapatipule Grampanchayat.With the development of tourism, a number of 
                                                                                          resorts and hotels have opened in this small town, the most significant of which is the Maharashtra 
                                                                                          Tourism Development Corporation resort near the beach.[6] Other resorts and spas include Greenleaf Resort, 
                                                                                          Abhishek Beach Resort and Spa, Areopagus Spa, and The Blue Ocean Resort and Spa, Hotel Heramb in Ganpatipule
                                                                                          and also a few smaller hotels also Bhakt Nivas available for tourist in this town.""");
			
			
				txt1.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt1.setEditable(false);
		
				p1.add(txt1);
		

			
		
			
			
		
		
			ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("image/kunkeshwar.jpg"));		
			Image a2 = a1.getImage().getScaledInstance(900,700,Image.SCALE_DEFAULT );
			ImageIcon a3 = new ImageIcon(a2);						
			JLabel image1 = new JLabel(a3);
			p1.add(image1);	
			
			
			JTextArea txt2 = new JTextArea("""
                                                       
                                                       
                                                       \t                                                                             Kunkeshwar Mandir
                                                       
                                                                                      Kunkeshwar is a village on the bank of the Arabian Sea. The village is known for Kunkeshwar Temple
                                                                                    which is dedicated to Lord Shiva. Kunkeshwar is also famous for producing Alphonso mangoes.
                                                                                                     
                                                                                    Known to be a perfectly peaceful and tranquil place, the highlight of the hamlet is the revered Shiva temple.
                                                                                    Besides, the chiming of the temple bells along with the crashing of waves on the golden sunlit shores makes 
                                                                                    the place even more enticing, even more meditative. People visit here mostly to pay respect to the gods but 
                                                                                    other than that, you can also find tourists.
                                  
                                                                                    This temple is one of the 12 Jyotirlingas in. An idol of Nandi is seen at the entrance and there is also shrine
                                                                                    for Ganpati. This temple is built on the banks of Arabian Sea in the 12th century. The temple has eight stories 
                                                                                    and is octagonal in shape. The crowning holds the temple Kalash. The Shivaling is placed in the main sanctum. 
                                                                                    behind the main temple is a smaller temple structure for the Kailash temple. It has a sabhamandap and is decorated 
                                                                                    with chandeliers. The Shivpanchayatan (Shiv, Parvati, Nandi, Shree Deo Manglik and Shree Ganesh) are drawn on the walls.
                                                                                    There is also a Vishnu temple in the vicinity. There are caves near the temple. The walls of these caves are decorated 
                                                                                    by warrior paintings having male and female forms. The temple foundation also has a 4 storied hostel called "Bhakta Niwas" 
                                                                                    for devotees/tourists. Kunkeshwar being a coastal town is home to many mango and coconut plantations.
                                                                                              
                                                                                   The story of this temple is very interesting. It is said that this temple was built by a muslim sailor. 
                                                                                   Once, this sailor was sailing through the Arabian Sea. Suddenly the waves were uncontrollable and his ship 
                                                                                   was sure to capsize. At a distance, he saw a lamp and prayed to it saying "I do not know who you are but if I live,
                                                                                   I will build a shrine for you" Suddenly, the ship held steady and the sailor landed at Kunkeshwar shore. He searched for 
                                                                                   the lamp and found a shivaling. True to his promise, he built a temple. The sailor knew that his community will never accept
                                                                                    him for building a Hindu temple and worshiping there. He was ostracized by his community. In fact, his king had already decided
                                                                                   the death penalty for such an act. So he committed suicide after jumping from the temple roof. His tomb is still situated nearby 
                                                                                    and he is honored as a great devotee. """);
			
				txt2.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt2.setEditable(false);
		
			p1.add(txt2);
		


		
			
			ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("image/parshuram.jpg"));			
			Image b2 = b1.getImage().getScaledInstance(856,600,Image.SCALE_DEFAULT );
			ImageIcon b3 = new ImageIcon(b2);		
			JLabel image2 = new JLabel(b3);			
			p1.add(image2);

			
			
			JTextArea txt3 = new JTextArea("""
                                                       
                                                       
                                                       \t                                                                                  Parshuram Mandir
                                                                                                    At a distance of 7 km from Chiplun Bus Station, Parshuram Temple is an ancient Hindu temple
                                                                                                    situated at Parshuram village near the town of Chiplun in the Ratnagiri district of Maharashtra, India. 
                                                                                                    Also known as Shree Kshetra Parshuram, it is one of the popular places of pilgrimage in the Konkan region,
                                                                                                    and among the must include places in Chiplun tour packages.
                                                                                                    
                                                                                                    Parshuram Temple is dedicated to Lord Parshuram, the sixth avatar of Lord Vishnu. It is one of the
                                                                                                    important Chiplun places to visit. Since Parashuram created Konkan land, he is considered the presiding 
                                                                                                    deity of the Konkan region. The temple was constructed by the Portuguese and the funds for its construction 
                                                                                                    were provided by Janjirekar & Siddi. The temple was rebuilt by Swami Paramhansa Brahmendra. He was the Guru of
                                                                                                    Siddi Yakut khan of Janjira, Kanhoji Angre of Kolaba, Peshwa of Pune, Chhatrapati Sahu Maharaj, 
                                                                                                    Tararani of Kolhapur.
                                                                                                    
                                                                                                    According to the legend, Parashurama is an immortal incarnation of Lord Vishnu. Parashuram had twenty-one 
                                                                                                    battles to get rid of brutal Kshatriya Kings who had given up principles of dharma. Kshatriya kings Janak or
                                                                                                    Ikshwaku who ruled by principles were not harmed. Later, Parshurama donated the entire earth to Maharshi
                                                                                                    Kashyap, thus he could not reside on that land. Hence, Parshurama shot an arrow in the Arabian sea to push
                                                                                                    it back and reclaim the land of Konkan. Parshurama chose the Mahendragiri peak as his permanent abode. 
                                                                                                    This is the spot where the temple is located. It is believed that at sunrise Lord Parshurama leaves for 
                                                                                                    the Himalayas to perform penance and return to the temple at sunset.
                                                                                                    
                                                                                                    The temple has a splendid architectural beauty, which incorporates both the Hindu and Muslim styles 
                                                                                                    of architecture. The steps from the Ghat lead to the temple premises. The main temple is surrounded by
                                                                                                    stone walls. The main sanctum has three elaborate idols namely Kal, Kam, and Parshuram. These three
                                                                                                    idols were brought here 300 years ago by Brahmendra Swami. Shri Parshuram's bed has been kept inside
                                                                                                    the temple and his traditional footwear 'Paduka' is known to be kept on his bed. There is also a temple
                                                                                                    of Goddess Renuka behind the Parashuram Temple. The legend goes that the Bandganga lake at this site was
                                                                                                    created after Parashuram shot five arrows into the land.
                                                                                                    
                                                                                                    There is a huge ceremony to be held on the day of Parshuram Jayanti (i.e. Akshaytrutiya). 
                                                                                                    Thousands of devotees gather for the occasion.
                                                                                                    
                                                                                                    Timings: 6 AM - 8 PM
                                                                                                    
                                                                                                    Entry: Free
                                                                                                       
                                                                                                 
                                                         
                                                                                                            """);
			
			
				txt3.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt3.setEditable(false);
		
			p1.add(txt3);
			
				

			
			ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("image/marleshwar.jpg"));			
			Image c2 = c1.getImage().getScaledInstance(800,420,Image.SCALE_DEFAULT );
			ImageIcon c3 = new ImageIcon(c2);		
			JLabel image3 = new JLabel(c3);			
			p1.add(image3);

			
			
			JTextArea txt4 = new JTextArea("""
                                                       
                                                       
                                                       \t                                                                                   Marleshwar Mandir
                                                                                                                           
                                                                                                     Marleshwar Temple, the Temple of Lord Shiva, is located in the lap of the cascading waters of 
                                                                                                     the Dhareshwar waterfall in Marleshwar, Maharashtra, India. It is an ancient temple dedicated to 
                                                                                                     Lord Shiva in Chiplun and is built in a cave. If you are up for some physical effort, it requires 
                                                                                                     climbing 520 steps to reach the sacred shrine. The climb is accompanied with beautiful scenery around.
                                                                                                     The lush green River Bav Valley, the massive mountains and the view of the ghats are sure to mesmerize 
                                                                                                     you with its simplicity and beauty. 
                                                                                                                     
                                                                                                     The breathtaking Dhareshwar Waterfall can be seen from the serene temple courtyard. If you happen 
                                                                                                     to visit the divine temple during seasons other than monsoon, you may get a chance to bathe in the 
                                                                                                     clear waters under the waterfall after offering your prayers to Lord Shiva in the calming atmosphere 
                                                                                                     of the temple. Marleshwar is located in the Konkan region of Maharashtra and lies along a 50-kilometre
                                                                                                     diversion from NH17, followed by a 20-minute hike. The Marleshwar Cave Temple is located overlooking the
                                                                                                     mighty Sahyadri mountain ranges and makes up for picturesque scenery. 
                                                                                                                     
                                                                                                     This sacred shrine is visited by believers from all over India especially during Mahashivratri and Makar
                                                                                                     Sankranti as these are considered the main festivals of the shrine. It is believed that the foundation of
                                                                                                     the temple was laid down by Lord Parshuram and the innumerable grooves and cuts within the bounds of the 
                                                                                                     cave are considered to be sacred. The site of Marleshwar Temple is also a great trekking destination and 
                                                                                                     finds many admirers among adventure seekers as well. A visit to this temple is a fulfilling and serene 
                                                                                                     encounter with God and nature. """);
			
				txt4.setFont(new Font("SAN SERIF",Font.BOLD,22));
				txt4.setEditable(false);
		
			p1.add(txt4);
		


			ImageIcon d1 = new ImageIcon(ClassLoader.getSystemResource("image/rameshwaram.jpg"));			
			Image d2 = d1.getImage().getScaledInstance(900,667,Image.SCALE_DEFAULT );
			ImageIcon d3 = new ImageIcon(d2);		
			JLabel image4 = new JLabel(d3);			
			p1.add(image4);

			
			
			JTextArea txt5 = new JTextArea("""
                                                       
                                                       
                                                       \t                                                                                    Shri Dev Rameshwar Temple
                                                       
                                                                                                       Shri Dev Rameshwar Temple is located in village Rameshwar Wadi in Devgad taluka of Sindhudurg 
                                                                                                       District, Maharashtra, India. This temple is dedicated to the Hindu deity Shiva.[1] It is a historic 
                                                                                                       temple built in 16th century. Its chief interest is the approach about 250 yards long, cut through 
                                                                                                       rock fifty feet deep. The idol, a four-armed figure seated on a bull, is of solid silver said to weigh
                                                                                                       a hundred kilograms and is in good condition at present.
                                  
                                                                                                       The architectural patterns of the temple building shows that it has been expanded at least three times
                                                                                                       from its establishment until now. In the early 18th century, Sarkhel Kanhoji Angre built a quadrangular 
                                                                                                       inner shrine made up of finely hewn stones, also called as the Gabhara around the original place of 
                                                                                                       Shiva's pindi. This is the main room of the temple which contains a shivling or pindi at its centre. 
                                                                                                       Later, in the mid-18th century, Sardar Sambhaji Angre and Sankhoji Angre built a Mandap in front of the 
                                                                                                       gabhara. This mandap consisted of four huge wooden pillars bearing beautiful carvings all over them. 
                                                                                                       They also built a Pradakshina Marg around the gabhara. The entire area was enclosed with walls to form 
                                                                                                       a small temple consisting of the gabhara, the mandap and pradakshina Marg. The entire temple building 
                                                                                                       covers an area of 4,025 sq ft. Stone tiles were placed in the area outside the main temple building 
                                                                                                       covering an area of about 15,000 sq ft. It was in this era that the temple was provided with two new
                                                                                                       gates on the western and southern side.
                                                                                                       
                                                                                                       In 1763, Shrimant Madhavrao Peshwe appointed Sarkhel Anandrao Rudrajirao Dhulap as the chief of 
                                                                                                       the Maratha Navy. Anandrao was also appointed as the governor of Vijaydurg Fort. In 1775, Madhavrao 
                                                                                                       Peshwe appointed Gangadhar Bhanu as the Subhedar of Vijaydurg region. In 1780, Subhedar Gangadhar 
                                                                                                       Bhanu built a huge Sabha Mandap with 20 carved wooden pillars.[2] In the early 18th century, there 
                                                                                                       were many changes and developments in the structures, architecture and the surroundings of the temple.
                                                                                                       The most notable change was made by Sarkhel Anandrao Dhulap. He built two additional gates on the 
                                                                                                       northern and eastern side of the temple. The eastern gate was built by making a way or Ghati by cutting
                                                                                                       a small hill adjoining the temple on the eastern side. He also built the main entrance or the Mukhya 
                                                                                                       Pravesh Dwar for the temple. A huge bell hangs on the eastern gate which has year 1791 engraved on it. 
                                                                                                       This bell was the one that was brought from the Portuguese Ship which was captured by the Maratha Navy.
                                                                                                       The main wooden mast of this ship has been installed in front of the Main entrance of the temple at
                                                                                                       the beginning of the Temple Ghati.""");
			
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
		
		new Temples();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()== bt) {
			
			setVisible(false);
			new Dashboard(username);
			
		}
		
	}

}
