
package medicalstoremanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class medinfo extends JFrame implements ActionListener {
       JTextField ba,ab,ac,ad,ae;
       JButton back;
	medinfo(){
		setLayout(null);
		
		getContentPane().setBackground(Color.white);
		
		JLabel m =new JLabel("Id     :- ");
		m.setFont(new Font("serif",Font.BOLD,25) );
		  m.setForeground(Color.black);
		  m.setBounds(100,50,200,100);
		  add(m);
		  
		
		// label 1
		
		JLabel a =new JLabel("Medicine Name :- ");
		a.setFont(new Font("serif",Font.BOLD,25) );
		  a.setForeground(Color.black);
		  a.setBounds(100,100,200,100);
		  add(a);
		  
	
		  
		// label 2
		  
		  JLabel b = new JLabel("Category  :- ");
		  b.setFont(new Font("serif",Font.BOLD,25));
		  b.setForeground(Color.black);
		  b.setBounds(100, 150, 200, 100);
		  add(b);
		  
		 // label 3
		
		  JLabel c = new JLabel("Expiry date   :- ");
		  c.setFont(new Font("serif",Font.BOLD,25));
		  c.setForeground(Color.black);
		  c.setBounds(100, 200, 200, 100);
		  add(c);
		 
		 // label 4
		  
		  JLabel d = new JLabel("Price    :- ");
		  d.setFont(new Font("serif",Font.BOLD,25));
		  d.setForeground(Color.black);
		  d.setBounds(100, 250, 200, 100);
		  add(d);
		  
		// feild 1
		 ab = new JTextField ();
		  ab.setBounds(300, 140, 200, 20);
		  add(ab);
		  
		 ba = new JTextField ();
		  ba.setBounds(300, 100, 200, 20);
		  add(ba);
		  
		// field 2
		  
		   ac = new JTextField();
		  ac.setBounds(300, 190, 200, 20);
		  add(ac);
		  
		// field 3  
		  
		   ad = new JTextField();
		  ad.setBounds(300, 240, 200, 20);
		  add(ad);
		
		// field 4
		  
		   ae = new JTextField();
		  ae.setBounds(300, 290, 200, 20);
		  add(ae);
		  
		// button 1
		  
		  JButton z = new JButton ("ADD");
		  z.setFont(new Font("serif",Font.BOLD,20));
		  z.setBounds(350, 340, 100, 50);
		  z.setForeground(Color.white);
		  z.setBackground(Color.black);
		  add(z);
		  z.addActionListener(this);
		  
		    back = new JButton (" BACK");
			 back.setBounds(600, 400, 100, 25);
		    back.setBackground(Color.black);
		    back.setForeground(Color.white);
		    back.addActionListener(this);
		    add(back);
		  
		  // label 5
		  
			JLabel e =new JLabel("Add Medicines");
			e.setFont(new Font("serif",Font.BOLD,25) );
			  e.setForeground(Color.black);
			  e.setBounds(300,10,200,100);
			  add(e);
		
		  // image 1
			  
	   	  ImageIcon abc =new ImageIcon(ClassLoader.getSystemResource("New folder/background.jpg"));
		    Image  i4= abc.getImage().getScaledInstance(800,800,Image.SCALE_AREA_AVERAGING);
			ImageIcon i5= new ImageIcon(i4);
			JLabel image1 = new JLabel(i5);
			image1.setBounds(0,0,800,600);
			add(image1);
		
		 
			
			 
		
		 setBounds(350,200,850,540);
			setVisible(true);
	}
	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		try {
			
			String Med_id = ba.getText();
			String med_Name=ab.getText();
			String category=ac.getText();
			String expiry_date=ad.getText();
			String price=ae.getText();
			
			String query="insert into Medicines values('"+Med_id+"','"+med_Name+"','"+category+"','"+expiry_date+"','"+price+"');";
			
			DB conn = new DB();

			boolean rs = conn.s.execute(query);
			
		  
			
			if(rs==false)
			
		{
			setVisible(false);
			JOptionPane.showMessageDialog(null,"Congrats details entered sucessfully");
			new mainpage();
			}
		
			
		}catch(Exception e1){
			e1.printStackTrace();
		}
		
		if(e.getSource()==back)
		{
			setVisible(false);
			 new  mainpage();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   new medinfo();
	}

}
