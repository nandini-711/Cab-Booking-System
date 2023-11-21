
package Cab_Booking;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class HomePage extends JFrame implements ActionListener
{
    JLabel l1;
    Font f,f1,f2;
    JPanel p1,p2;
    HomePage()
    {
      super  ("Cab Booking");
      setLocation(0,0);
      setSize(1400,600);
      
      ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("Cab_Booking/icons/.png"));
      Image i1=ic.getImage().getScaledInstance(1400,600,Image.SCALE_DEFAULT);
      ImageIcon ic1=new ImageIcon(i1);
      l1=new JLabel(ic1);
      
      f=new Font("Lucida Fax",Font.BOLD,20);
      f2=new Font("Lucida Fax",Font.BOLD,35);
      f=new Font("Lucida Fax",Font.BOLD,18);
      JMenuBar m1=new JMenuBar();
      JMenu men1=new JMenu("Customer");
      JMenuItem ment1=new JMenuItem("View Existing Customer Details");
      JMenuItem ment2=new JMenuItem("Update Customer Details");
      JMenuItem ment3=new JMenu("Delete Customer");
      
      JMenu men2=new JMenu("Book cab");
      JMenuItem ment5=new JMenuItem("Book Cab");
      JMenuItem ment6=new JMenuItem("View Booking history for customer");
      JMenuItem ment7=new JMenuItem("View Booking history for Driver");
      
      
      JMenu men3=new JMenu("Bill");
      JMenuItem ment8=new JMenuItem("View Bill");
      
      JMenu men4=new JMenu("Driver");
      JMenuItem ment9=new JMenuItem("Add new Driver");
      JMenuItem ment10=new JMenuItem("Update Driver Details");
      JMenuItem ment11=new JMenuItem("Delete Driver");
      
      men1.add(ment1);
      men1.add(ment2);
      men1.add(ment3);
      
      men2.add(ment5);
      men2.add(ment6);
      men2.add(ment7);
      men3.add(ment8);
      men4.add(ment9);
      men4.add(ment10);
      men4.add(ment11);
      
      m1.add(men1);
      m1.add(men2);
      m1.add(men3);
      m1.add(men4);
      
      m1.setBackground(Color.BLACK);
      men1.setForeground(Color.GRAY);
      men2.setForeground(Color.GRAY);
      men3.setForeground(Color.GRAY);
      men4.setForeground(Color.GRAY);
      
      ment1.setBackground(Color.BLACK);
      ment2.setBackground(Color.BLACK);
      ment3.setBackground(Color.BLACK);
      
      ment5.setBackground(Color.BLACK);
      ment6.setBackground(Color.BLACK);
      ment7.setBackground(Color.BLACK);
      ment8.setBackground(Color.BLACK);
      ment9.setBackground(Color.BLACK);
      ment10.setBackground(Color.BLACK);
      ment11.setBackground(Color.BLACK);
      
      
      ment1.setForeground(Color.GREEN);
      ment2.setForeground(Color.GREEN);
      ment3.setForeground(Color.GREEN);
      
      ment5.setForeground(Color.GREEN);
      ment6.setForeground(Color.GREEN);
      ment7.setForeground(Color.GREEN);
      ment8.setForeground(Color.GREEN);
      ment9.setForeground(Color.GREEN);
      ment10.setForeground(Color.GREEN);
      ment11.setForeground(Color.GREEN);
      
      setJMenuBar(m1);
      add(m1);   
      
    } 
    public void actionPerformed(ActionEvent e)
    {
        String cmd=e.getActionCommand();
        if(cmd.equals("View Existing Customer Details"))
        {
            new View_Customer();
        
        }
        
        else if(cmd.equals("Update Customer Details"))
        {
            new Update_Customer().setVisible(true);
        }
        else if(cmd.equals("Delete Customer"))
        {
            new Delete_Customer().setVisible(true);
        }
        else if(cmd.equals("Book Cab"))
        {
            new Book_Cab().setVisible(true);
        }
        else if(cmd.equals("View Booking history for customer"))
        {
            new Customer_History().setVisible(true);
        }
        else if(cmd.equals("View Booking history for Driver"))
        {
            new Driver_History().setVisible(true);
        }
        else if(cmd.equals("View Bill"))
        {
            new View_Bill().setVisible(true);
        }
        else if(cmd.equals("Add new Driver"))
        {
            new Add_Driver().setVisible(true);
        }
        else if(cmd.equals("Update Driver Details"))
        {
            new Update_Driverr().setVisible(true);
        }
        else if(cmd.equals("Delete Driver"))
        {
            new Delete_Driver().setVisible(true);
        }
    }
    
    
    public static void main (String[] args)
    {
        new HomePage().setVisible(true);
    }
 
    
}
