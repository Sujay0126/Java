package tour;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

public class Dashboard extends JFrame implements ActionListener   {
     Thread thread;
	static String username;
	JButton addPersonalDetails,updatePersonalDetails, viewPersonalDetails , deletePersonalDetails,checkPackages, bookPackage,viewpackage,viewhotels, bookhotel,viewBookedHotel,destinations, payments,calculators,notepad,about,beaches,f,adv,t,mp,img,but,img1,img2,img3,img4,img5,img6,img7,img8;
	JMenuItem s1,s2,s3;
     public Dashboard(String username){
		this.username =username;
		//setBounds(0,0,1620,1000);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		
		
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBackground(new Color(0,0,102));
		p1.setBounds(0,0,1900,75);
		add(p1);
                
                 JLabel label = new JLabel("                                                                     **Welcome To Konkan Tourism WebPage!!! We will be Happy To Help You!!!                                                                                                                                                         ");
                 label.setForeground(Color.WHITE);
                 label.setBounds(0,25,1900,60);
                 p1.add(label);

        // Create a Timer to scroll the text
        int scrollSpeed = 80; // Adjust the speed (milliseconds per scroll)
        Timer timer = new Timer(scrollSpeed, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Scroll the text by moving the last character to the front
                String labelText = label.getText();
                label.setFont(new Font("Arial",Font.BOLD,22));
                labelText = labelText.charAt(labelText.length() - 1) + labelText.substring(0, labelText.length() - 1);
                label.setText(labelText);
            }
        });
        timer.start();


		JPanel p2 = new JPanel();
		p2.setLayout(null);
		p2.setBackground(new Color(0,0,102));
		p2.setBounds(0,65,1550,800);
		add(p2);
                
                f= new JButton("fort");
		f.setBounds(0,42,310,38);
		f.setBackground(new Color(0,0,102));
		f.setForeground(Color.WHITE);
		f.setFont(new Font("Tahoma",Font.PLAIN,20));
		f.setMargin(new Insets(0,0,0,175));
		f.addActionListener(this);
		p2.add(f);

                adv= new JButton("Adventures");
		adv.setBounds(0,80,310,40);
		adv.setBackground(new Color(0,0,102));
		adv.setForeground(Color.WHITE);
		adv.setFont(new Font("Tahoma",Font.PLAIN,20));
		adv.setMargin(new Insets(0,0,0,175));
		adv.addActionListener(this);
		p2.add(adv);

                t= new JButton("Temple");
		t.setBounds(0,120,310,40);
		t.setBackground(new Color(0,0,102));
		t.setForeground(Color.WHITE);
		t.setFont(new Font("Tahoma",Font.PLAIN,20));
		t.setMargin(new Insets(0,0,0,175));
		t.addActionListener(this);
		p2.add(t);

                
                beaches= new JButton("Beaches");
		beaches.setBounds(0,10,310,40);
		beaches.setBackground(new Color(0,0,102));
		beaches.setForeground(Color.WHITE);
		beaches.setFont(new Font("Tahoma",Font.PLAIN,20));
		beaches.setMargin(new Insets(0,0,0,175));
		beaches.addActionListener(this);
		p2.add(beaches);

		
		addPersonalDetails = new JButton("Add Personal Details");
		addPersonalDetails.setBounds(0,160,310,40);
		addPersonalDetails.setBackground(new Color(0,0,102));
		addPersonalDetails.setForeground(Color.WHITE);
		addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		addPersonalDetails.setMargin(new Insets(0,0,0,60));
		addPersonalDetails.addActionListener(this);
		p2.add(addPersonalDetails);
		
		

		updatePersonalDetails = new JButton("Update Personal Details");
		updatePersonalDetails.setBounds(0,200,310,40);
		updatePersonalDetails.setBackground(new Color(0,0,102));
		updatePersonalDetails.setForeground(Color.WHITE);
		updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		updatePersonalDetails.setMargin(new Insets(0,0,0,30));
		updatePersonalDetails.addActionListener(this);
		p2.add(updatePersonalDetails);
		
		
	    
		viewPersonalDetails = new JButton("View Details");
		viewPersonalDetails.setBounds(0,240,310,40);
		viewPersonalDetails.setBackground(new Color(0,0,102));
		viewPersonalDetails.setForeground(Color.WHITE);
		viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewPersonalDetails.setMargin(new Insets(0,0,0,130));
		viewPersonalDetails.addActionListener(this);
		p2.add(viewPersonalDetails);
		
	
	    deletePersonalDetails = new JButton("Delete Personal Details");
		deletePersonalDetails.setBounds(0,280,310,40);
		deletePersonalDetails.setBackground(new Color(0,0,102));
		deletePersonalDetails.setForeground(Color.WHITE);
		deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		deletePersonalDetails.setMargin(new Insets(0,0,0,40));
		deletePersonalDetails.addActionListener(this);
		p2.add(deletePersonalDetails);
		
		
	
	    checkPackages = new JButton("View Packages");
		checkPackages.setBounds(0,320,310,40);
		checkPackages.setBackground(new Color(0,0,102));
		checkPackages.setForeground(Color.WHITE);
		checkPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
		checkPackages.setMargin(new Insets(0,0,0,110));
		checkPackages.addActionListener(this);
		p2.add(checkPackages);
		
		
	    bookPackage = new JButton("Book Package");
		bookPackage.setBounds(0,360,310,40);
		bookPackage.setBackground(new Color(0,0,102));
		bookPackage.setForeground(Color.WHITE);
		bookPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
		bookPackage.setMargin(new Insets(0,0,0,120));
		bookPackage.addActionListener(this);
		p2.add(bookPackage);
		
	
		viewpackage = new JButton("View Booked Package");
		viewpackage.setBounds(0,400,310,40);
		viewpackage.setBackground(new Color(0,0,102));
		viewpackage.setForeground(Color.WHITE);
		viewpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewpackage.setMargin(new Insets(0,0,0,60));
		viewpackage.addActionListener(this);
		p2.add(viewpackage);
		
	
	    viewhotels = new JButton("View Hotels");
		viewhotels.setBounds(0,440,310,40);
		viewhotels.setBackground(new Color(0,0,102));
		viewhotels.setForeground(Color.WHITE);
		viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewhotels.setMargin(new Insets(0,0,0,135));
		viewhotels.addActionListener(this);
		p2.add(viewhotels);
	
	    bookhotel = new JButton("Book Hotel");
		bookhotel.setBounds(0,480,310,40);
		bookhotel.setBackground(new Color(0,0,102));
		bookhotel.setForeground(Color.WHITE);
		bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
		bookhotel.setMargin(new Insets(0,0,0,140));
		bookhotel.addActionListener(this);
		p2.add(bookhotel);
	
		
		viewBookedHotel = new JButton("View Booked Hotel");
		viewBookedHotel.setBounds(0,520,310,40);
		viewBookedHotel.setBackground(new Color(0,0,102));
		viewBookedHotel.setForeground(Color.WHITE);
		viewBookedHotel.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewBookedHotel.setMargin(new Insets(0,0,0,70));
		viewBookedHotel.addActionListener(this);
		p2.add(viewBookedHotel);
	
		
		destinations = new JButton("Destinations");
		destinations.setBounds(0,560,310,40);
		destinations.setBackground(new Color(0,0,102));
		destinations.setForeground(Color.WHITE);
		destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
		destinations.setMargin(new Insets(0,0,0,125));
		destinations.addActionListener(this);
		p2.add(destinations);
	
                mp = new JButton(" View Map");
		mp.setBounds(0,600,310,40);
		mp.setBackground(new Color(0,0,102));
		mp.setForeground(Color.WHITE);
		mp.setFont(new Font("Tahoma",Font.PLAIN,20));
		mp.setMargin(new Insets(0,0,0,125));
		mp.addActionListener(this);
		p2.add(mp);

	    payments = new JButton("Payments");
		payments.setBounds(0,640,310,40);
		payments.setBackground(new Color(0,0,102));
		payments.setForeground(Color.WHITE);
		payments.setFont(new Font("Tahoma",Font.PLAIN,20));
		payments.setMargin(new Insets(0,0,0,155));
		payments.addActionListener(this);
		p2.add(payments);
		
	    calculators = new JButton("Calculators");
		calculators.setBounds(0,640,310,40);
		calculators.setBackground(new Color(0,0,102));
		calculators.setForeground(Color.WHITE);
		calculators.setFont(new Font("Tahoma",Font.PLAIN,20));
		calculators.setMargin(new Insets(0,0,0,145));
		calculators.addActionListener(this);
		p2.add(calculators);
	
	    notepad= new JButton("Notepad");
		notepad.setBounds(0,680,310,50);
		notepad.setBackground(new Color(0,0,102));
		notepad.setForeground(Color.WHITE);
	    notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
		notepad.setMargin(new Insets(0,0,0,155));
		notepad.addActionListener(this);
		p2.add(notepad);
		
		about = new JButton("About");
		about.setBounds(0,720,300,32);
		about.setBackground(new Color(0,0,102));
		about.setForeground(Color.WHITE);
		about.setFont(new Font("Tahoma",Font.PLAIN,20));
		about.setMargin(new Insets(0,0,0,175));
		about.addActionListener(this);
		p2.add(about);
                          
             img8 = new JButton();
	     img8.setBounds(300,10,1550,715);
	     img8.setBackground(Color.cyan);
             img8.addActionListener(this);
             p2.add(img8);
               
             ImageIcon ic24 = new ImageIcon(ClassLoader.getSystemResource("image/kONKANCOLLAGE.jpg"));
	     Image ic22 = ic24.getImage().getScaledInstance(1580,715,Image.SCALE_DEFAULT);
	     ImageIcon ic23 = new ImageIcon(ic22);
	     JLabel image8 = new JLabel(ic23);
	     image8.setBounds(240,10,1580, 715);
	     img8.add(image8);
             
             
             
//             
			
                
        JMenuBar m = new JMenuBar();
        m.setBounds(0,0,1600,30);
        p1.add(m);
        
        JMenu supply = new JMenu("Konkan Tourism ");
        supply.setFont(new Font("ARIAL BLACK",Font .PLAIN, 22));
        supply.setForeground(Color.red);
        m.add(supply);
        
         
        
        JMenu a1 = new JMenu("  Account");
        a1.setFont(new Font("ARIAL BLACK",Font .PLAIN, 22));
        a1.setForeground(Color.blue);
        m.add(a1);
        
        JMenuItem am1 = new JMenuItem("Add Info");
        am1.addActionListener(this);
        a1.add(am1);
        
        JMenuItem am2 = new JMenuItem("Fogot password");
        am2.addActionListener(this);
        a1.add(am2);
	
        JMenuItem am3 = new JMenuItem("Login");
        am3.addActionListener(this);
        a1.add(am3);
        
        JMenuItem am4 = new JMenuItem("Signup New Account");
        am4.addActionListener(this);
        a1.add(am4);
       		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== addPersonalDetails) {
			new AddCustomers(username);
                        
                        
		}else if(ae.getSource() == bookhotel){
                            setVisible(false);
                            new BookHots();
                        
                }else if(ae.getSource()== viewPersonalDetails) {
			new ViewCustomer(username);
		}else  if(ae.getSource()== deletePersonalDetails) {
				
				try {
					new DeleteCustomer().setVisible(true);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
		}else if(ae.getSource()== updatePersonalDetails) {
			new UpdateCustomer(username);
		}else if(ae.getSource()==  checkPackages) {
			new CheckPackage();
		}else if(ae.getSource()== bookPackage) {
			new BookPackage(username);
		}else if(ae.getSource()== viewpackage) {
			new ViewPackage(username).setVisible(true);
		}else if(ae.getSource()== viewhotels){
			new CheckHotels().setVisible(true);
		}else if(ae.getSource()== destinations){
			new Destination().setVisible(true);
                }else if(ae.getSource()== viewBookedHotel){
			new ViewBookedHotel(username).setVisible(true);
		}else if(ae.getSource()== payments){
			new Payment();
		}else if(ae.getSource()== calculators){
			try {
				Runtime.getRuntime().exec("calc.exe");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(ae.getSource()== notepad){
			try {
				Runtime.getRuntime().exec("notepad.exe");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(ae.getSource()== about) {
			new About();
		}
			else if(ae.getSource()== beaches) {
			new Beaches();
		}else if(ae.getSource()== mp) {
                     new Maps();

			
		}else if(ae.getSource()== f) {
                     new KonkanForts();

			
		}else if(ae.getSource()== adv) {
                     new Adventure1();

			
		}else if(ae.getSource()== t) {
                     new Temples();


			
                }
                else if(ae.getSource()== img8) {
                    
                    new KonkanDivision();
                    
                    
                    
                    
                }else {
                    
                }

                if(ae.getSource()==but){
            new About();
            
            
        }


        }
      
	public static void main(String[] args) throws Exception {
		
          new Dashboard(username); 
         
//        try{
//            Thread.sleep(5000);
//            
//            new Login();
//            
//        }catch(Exception e){
//            e.printStackTrace();
//        }
    }
}
         
	


