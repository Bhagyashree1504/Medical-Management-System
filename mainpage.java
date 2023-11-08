package medicalstoremanagement;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Image;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mainpage extends JFrame implements ActionListener{
	
		
	JLabel rj;
	JButton b,c,d,m,f,g,back;
		
	
		mainpage()
		{
			 setLayout(null);
				
				getContentPane().setBackground(Color.white);
				
			
				
				 rj = new JLabel("ADD DATA ");
				rj.setFont(new Font("serif",Font.BOLD,30) );
				  rj.setForeground(Color.black);
				rj.setBounds(270,15, 1000, 100);
				add(rj);
				
				
				
				//   1 button
				
				 b =new JButton (" ADD Available Medicines");
				b.setBounds(60, 100, 200, 25);
				b.setBackground(Color.black);
				b.setForeground(Color.WHITE);
				b.addActionListener(this);
				add(b);
				
				
				//    2 button
				
			     c=new JButton(" ADD Payment Details");  
			     
			    c.setBounds(60, 150, 200, 25);
			    c.setBackground(Color.black);
			    c.setForeground(Color.WHITE);
			    c.addActionListener(this);
			    add(c);
			    
			    //    3 button
				
				 d = new JButton("ADD Inventory Details");
			    d.setBounds(60,200,200,25);
				d.setBackground(Color.black);
				d.setForeground(Color.WHITE);
				d.addActionListener(this);
				add(d);
				
				//    4 button
				
				 m= new JButton (" ADD Purchase Details");
				m.setBounds(60,250,200,25);
				m.setBackground(Color.black);
				m.setForeground(Color.WHITE);
				m.addActionListener(this);
				add(m);
				
//			        5 button
				
				 f =new JButton("ADD Sales Details");
			    f.setBounds(60, 300, 200, 25);
				f.setBackground(Color.black);
				f.setForeground(Color.WHITE);
				f.addActionListener(this);
				add(f);
				
//			        6 button
				 g = new JButton (" ADD Employees Details");
				 g.setBounds(60, 350, 200, 25);
			    g.setBackground(Color.black);
			    g.setForeground(Color.WHITE);
			    g.addActionListener(this);
			    add(g);
			    
			    back = new JButton (" BACK");
				 back.setBounds(600, 400, 100, 25);
			    back.setBackground(Color.black);
			    back.setForeground(Color.WHITE);
			    back.addActionListener(this);
			    add(back);
			    
			    
			    
			    
			    //     insert image
			    
			    ImageIcon prj =new ImageIcon(ClassLoader.getSystemResource("New folder/background.jpg"));
			    Image  i2= prj.getImage().getScaledInstance(800,800,Image.SCALE_AREA_AVERAGING);
				ImageIcon i3= new ImageIcon(i2);
				JLabel image = new JLabel(i3);
				image.setBounds(0,0,800,600);
				add(image);
		    
			    
			    setBounds(350,200,850,540);
				setVisible(true);
				
			}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new mainpage();
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		if(e.getSource()==b)
		{
			setVisible(false);
			new medinfo();
		}
		if(e.getSource()==c)
		{
			setVisible(false);
			new bill();
		}
		if(e.getSource()==d)
		{
			setVisible(false);
			new inventory();
		}
		if(e.getSource()==m)
		{
			setVisible(false);
			new purchases();
		}
		if(e.getSource()==f)
		{
			setVisible(false);
			new saless();
		}
		if(e.getSource()==g)
		{
			setVisible(false);
			new empdetails();
		}
		if(e.getSource()==back)
		{
			setVisible(false);
			new commanpage();
		}
		
	}

}
