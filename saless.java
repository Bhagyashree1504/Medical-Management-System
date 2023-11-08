package medicalstoremanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class saless extends JFrame implements ActionListener{
	JLabel a,c,d,e2,f;
	JButton z,back;
	JTextField ab,ad,ae,af;
	saless()
	{
		setLayout(null);
		
		 getContentPane().setBackground(Color.white);
		 
	        
			// label 1
			
			 a =new JLabel("Sales Id  :- ");
			a.setFont(new Font("serif",Font.BOLD,25) );
			  a.setForeground(Color.black);
			  a.setBounds(100,150,200,100);
			  add(a);
			  
				 	  
			 // label 3
			  
			
			
			   c = new JLabel("Quantity :- ");
			  c.setFont(new Font("serif",Font.BOLD,25));
			  c.setForeground(Color.black);
			  c.setBounds(100, 200, 200, 100);
			  add(c);
			 
			 // label 4
			  
			   d = new JLabel("Sale date :- ");
			  d.setFont(new Font("serif",Font.BOLD,25));
			  d.setForeground(Color.black);
			  d.setBounds(100, 250, 200, 100);
			  add(d);
			 
			   e2= new JLabel("Sale price  :- ");
			  e2.setFont(new Font("serif",Font.BOLD,25));
			  e2.setForeground(Color.black);
			  e2.setBounds(100, 300, 200, 100);
			  add(e2);
			  
			   f =new JLabel("Add Sale Details");
			  f.setFont(new Font ("serif",Font.BOLD,25));
			  f.setForeground(Color.black);
			  f.setBounds(300,10,300,100);
			  add(f);
			  
			   z = new JButton ("ADD");
			  z.setFont(new Font("serif",Font.BOLD,20));
			  z.setBounds(350, 380, 100, 40);
			  z.setForeground(Color.white);
			  z.setBackground(Color.black);
			  add(z);
			  z.addActionListener(this);
			 
			 //field 1 
			  
			   ab =new JTextField();
			  ab.setBounds(300, 190, 140, 20);
	         add(ab);	 
	        
			// field 3  
			  
			  
			   ad = new JTextField();
			  ad.setBounds(300, 240, 140, 20);
			  add(ad);
			
			// field 4
			  
			   ae = new JTextField();
			  ae.setBounds(300, 290, 140, 20);
			  add(ae);
		 
			  
			   af = new JTextField();
			  af.setBounds(300, 340, 140, 20);
			  add(af);
			  
			  back = new JButton (" BACK");
				 back.setBounds(600, 400, 100, 25);
			    back.setBackground(Color.black);
			    back.setForeground(Color.white);
			    back.addActionListener(this);
			    add(back);

			
		 
			  ImageIcon abc =new ImageIcon(ClassLoader.getSystemResource("New folder/background.jpg"));
			    Image  i4= abc.getImage().getScaledInstance(800,800,Image.SCALE_AREA_AVERAGING);
				ImageIcon i5= new ImageIcon(i4);
				JLabel image1 = new JLabel(i5);
				image1.setBounds(0,0,800,540);
				add(image1);
		 
		 

		 setBounds(350,200,850,540);
			setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		try {
			
			String sale_id = ab.getText();
			String quantity = ad.getText();
			String sales_date = ae.getText();
			String sales_price = af.getText();
			//String EMA = email.getText();
			
			String query="insert into sales values('"+sale_id+"','"+quantity+"','"+sales_date+"','"+sales_price+"');";
			
			DB conn = new DB();

			boolean rs = conn.s.execute(query);
			
			System.out.print(rs);
			
			if(rs==false) {
				setVisible(false);
				JOptionPane.showMessageDialog(null, "Congrats 💐 Registered Successfully");
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
new saless();
	}



}