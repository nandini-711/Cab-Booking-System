
package Cab_Booking;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Add_Customer extends JFrame implements ActionListener
{
   JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id13;
   JFrame f;
   JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
   JButton b,b1;
   
   public Add_Customer()
   {
       f=new JFrame("Add Employee Details");
       f.setBackground(Color.WHITE);
       f.setLayout(null);
       
       id=new JLabel();
       id.setBounds(0,0,900,600);
       id.setLayout(null);
       
       ImageIcon ic=new ImageIcon(getClass().getResource("C:\\Users\\KIIT\\OneDrive\\Documents\\NetBeansProjects\\cab booking\\src\\Cab_Booking\\icons\\addcust.jpeg"));
        Image img=ic.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon ic1=new ImageIcon(img);
        id=new JLabel(ic1);
        
        id1=new JLabel("New Customer Details");
        id1.setBounds(280,30,500,50);
        id1.setFont(new Font("Airal",Font.BOLD,30));
        id1.setForeground(Color.black);
        f.setVisible(true);
        f.setSize(900,600);
        f.setLocation(300,100);
   }
}
