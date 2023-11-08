package medicalstoremanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class inventory extends JFrame implements ActionListener {
	JTextField ab,ac,ad,ae;
	JButton z,back ;
	JLabel a,b,c,d,e;
	inventory()
	{
	//setLayout(null);
		
		
			// label 1
			
			 a =new JLabel("Medicine id :- ");
			a.setFont(new Font("serif",Font.BOLD,25) );
			  a.setForeground(Color.black);
			  a.setBounds(100,100,200,100);
			  add(a);
			  
			// label 2
			  
			   b = new JLabel("Quantity  :- ");
			  b.setFont(new Font("serif",Font.BOLD,25));
			  b.setForeground(Color.black);
			  b.setBounds(100, 150, 200, 100);
			  add(b);
			  
			 // label 3
			
			   c = new JLabel("Purchase price  :- ");
			  c.setFont(new Font("serif",Font.BOLD,25));
			  c.setForeground(Color.black);
			  c.setBounds(100, 200, 200, 100);
			  add(c);
			 
			 // label 4
			  
			   d = new JLabel("Sell price   :- ");
			  d.setFont(new Font("serif",Font.BOLD,25));
			  d.setForeground(Color.black);
			  d.setBounds(100, 250, 200, 100);
			  add(d);
		 
			  
			// feild 1
			  
			   ab = new JTextField();
			  ab.setBounds(300, 140, 100, 20);
			  add(ab);
			  
			// field 2
			  
			   ac = new JTextField();
			  ac.setBounds(300, 190, 100, 20);
			  add(ac);
			  
			// field 3  
			  
			   ad = new JTextField();
			  ad.setBounds(300, 240, 100, 20);
			  add(ad);
			
			// field 4
			  
			   ae = new JTextField();
			  ae.setBounds(300, 290, 100, 20);
			  add(ae);
			  
				// button 1
				  
				   z = new JButton ("ADD");
				  z.setFont(new Font("serif",Font.BOLD,20));
				  z.setBounds(350, 340, 100, 40);
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
				  
					 e =new JLabel(" Add Medicine Details  ");
					e.setFont(new Font("serif",Font.BOLD,25) );
					  e.setForeground(Color.black);
					  e.setBounds(300,10,300,100);
					  add(e);
					  
					  // image 1
		 
					  ImageIcon abc =new ImageIcon(ClassLoader.getSystemResource("New folder/background.jpg"));
					    Image  i4= abc.getImage().getScaledInstance(800,800,Image.SCALE_AREA_AVERAGING);
						ImageIcon i5= new ImageIcon(i4);
						JLabel image1 = new JLabel(i5);
						image1.setBounds(0,0,800,540);
						add(image1);
					
						getContentPane().setBackground(Color.white);
						setLayout(null);
						setBounds(350,250,850,540);
		 				setVisible(true);
		 				setLocation(350,200);

		 

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		try {
			
		String medi_id=ab.getText();
		String quant=ac.getText();
		String purchase_price=ac.getText();
		String sell_price=ac.getText();
		
		String query="insert into inventory values('"+medi_id+"','"+quant+"','"+purchase_price+"','"+sell_price+"');";
		
		DB conn=new DB();
		
		boolean rs = conn.s.execute(query);
		
		
		if(rs==false)
		{
			setVisible(false);
			JOptionPane.showMessageDialog(null, "Congrats 💐 details entered Successfully");
			// new mainpage();
		}
			
		}catch(Exception e1)
		{
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
       new inventory();
	
	}
	
}
