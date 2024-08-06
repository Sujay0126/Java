/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tour;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CheckPackage extends JFrame{
    public static void main(String[] args) {
      new CheckPackage().setVisible(true);
    }

    CheckPackage() {    
      setBounds(350,100, 900, 565);  
      setVisible(true);
      String[] dg1 = new String[]{"pkg1.jpg","Konkan GOLD PACKAGE","8 days and 7 Nights", "Best Tour plan", "Raigad-Alibg-Ganpatipule-Malvan-RanganaTrek", "Private Travels with AC", "Water sports at Malvan", "Special Sea Food", "English Speaking Guide",  "Summer Special", "Rs. 35000 only"};
      String[] dg2 = new String[]{"pkg2.jpg","SILVER PACKAGE","6 days and 5 Nights", "Toll Free and Entrance Free Tickets", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "Winter Special", "Rs. 25000 only"};
      String[] dg3 = new String[]{"pkg3.jpg","BRONZE PACKAGE","5 days and 4 Nights", "Return Airfare", "Free Clubbing, Horse Riding & other Games", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "BBQ Dinner", "Winter Special", "Rs. 15000 only"};
      
     /* String[] m1 = new String[]{"package1.jpg","GOLD PACKAGE","6 days and 7 Nights", "Airport Assistance at Aiport", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet", "Special Sea Food", "English Speaking Guide", "BOOK NOW", "Summer Special", "Rs 12000 only"};
      String[] m2 = new String[]{"package2.jpg","SILVER PACKAGE","4 days and 3 Nights", "Toll Free and Entrance Free Tickets", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "BOOK NOW", "Winter Special", "Rs 25000 only"};
      String[] m3 = new String[]{"package3.jpg","BRONZE PACKAGE","6 days and 5 Nights", "Return Airfare", "Free Clubbing, Horse Riding & other Games", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "BBQ Dinner", "BOOK NOW", "Winter Special", "Rs 32000 only"};
      

      String[] a1 = new String[]{"package1.jpg","GOLD PACKAGE","6 days and 7 Nights", "Airport Assistance at Aiport", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet", "Special Sea Food", "English Speaking Guide", "BOOK NOW", "Summer Special", "Rs 12000 only"};
      String[] a2 = new String[]{"package2.jpg","SILVER PACKAGE","4 days and 3 Nights", "Toll Free and Entrance Free Tickets", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "BOOK NOW", "Winter Special", "Rs 25000 only"};
      String[] a3 = new String[]{"package3.jpg","BRONZE PACKAGE","6 days and 5 Nights", "Return Airfare", "Free Clubbing, Horse Riding & other Games", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "BBQ Dinner", "BOOK NOW", "Winter Special", "Rs 32000 only"};
      */

      JTabbedPane tabbedPane = new JTabbedPane();
      JPanel p1 = createPackage(dg1);
      tabbedPane.addTab("Konkan golden", null, p1);

      JPanel p2 = createPackage(dg2);
        tabbedPane.addTab("Konkan silver", null, p2);

        JPanel p3 = createPackage(dg3);
        tabbedPane.addTab("Konkan bronze", null, p3);

      /*JPanel p4 = createPackage(m1);
      tabbedPane.addTab("Malvan golden", null, p4);
      JPanel p5 = createPackage(m2);
      tabbedPane.addTab("Malvan silver", null, p5);
      JPanel p6 = createPackage(m3);
      tabbedPane.addTab("Malvan bronze", null, p6);
      


      JPanel p7 = createPackage(a1);
      tabbedPane.addTab("Alibag golden", null, p7);
      JPanel p8 = createPackage(a2);
      tabbedPane.addTab("Alibag silver", null, p8);
        JPanel p9 = createPackage(a3);
      tabbedPane.addTab("Alibag bronze", null, p9);*/

      add(tabbedPane, BorderLayout.CENTER);    
   }
    
    public JPanel createPackage(String[] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.cyan);
      
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("image/"+pack[0]));
        Image i3 = i1.getImage().getScaledInstance(550, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(400,0,450,420);
        p1.add(l1);

        JLabel lblName = new JLabel(pack[1]);
        lblName.setFont(new Font("Arial Black", Font.PLAIN, 25));
        lblName.setBounds(40, 5, 450, 53);
        p1.add(lblName);

        JLabel l3 = new JLabel(pack[2]);
        l3.setForeground(Color.RED);
        l3.setBounds(35, 70, 200, 14);
        p1.add(l3);

        JLabel lblId = new JLabel(pack[3]);
        lblId.setForeground(Color.BLUE);
        lblId.setBounds(35, 110, 250, 14);
        p1.add(lblId);

        JLabel l2 = new JLabel(pack[4]);
        l2.setForeground(Color.RED);
        l2.setBounds(35, 150, 300, 14);
        p1.add(l2);

        JLabel lblName_1 = new JLabel(pack[5]);
        lblName_1.setForeground(Color.BLUE);
        lblName_1.setBounds(35, 190,200, 14);
        p1.add(lblName_1);

        JLabel lblGender = new JLabel(pack[6]);
        lblGender.setForeground(Color.RED);
        lblGender.setBounds(35, 230, 200, 14);
        p1.add(lblGender);

        JLabel lblCountry = new JLabel(pack[7]);
        lblCountry.setForeground(Color.BLUE);
        lblCountry.setBounds(35, 270, 200, 14);
        p1.add(lblCountry);

        JLabel lblCheckInStatus = new JLabel(pack[8]);
        lblCheckInStatus.setForeground(Color.BLUE);
        lblCheckInStatus.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblCheckInStatus.setBounds(35, 400, 250, 30);
        p1.add(lblCheckInStatus);

        JLabel lblDeposite = new JLabel(pack[9]);
        lblDeposite.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        lblDeposite.setBounds(35, 460, 400, 40);
        p1.add(lblDeposite);
        
        JLabel la1 = new JLabel(pack[10]);
        la1.setForeground(Color.RED);
        la1.setFont(new Font("", Font.PLAIN, 30));
        la1.setBounds(600, 400, 400, 40);
        p1.add(la1);
        
        return p1;
    }
}
