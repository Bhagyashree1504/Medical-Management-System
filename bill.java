package medicalstoremanagement;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class bill extends JFrame implements ActionListener {
	JLabel a,b,c,d,e,f,g,h;
	JButton z,back;
	 JTextField ab,ac,ad,ah,ae,af;
	 JComboBox ag;
 bill() {
		// TODO Auto-generated constructor stub
	
	 	setLayout(null);
	 	
	 	 getContentPane().setBackground(Color.white);
	 	 
	        
	 		// label 1
	 		
	 		 a =new JLabel("Bill_id  :- ");
	 		a.setFont(new Font("serif",Font.BOLD,20) );
	 		  a.setForeground(Color.black);
	 		  a.setBounds(100,50,200,100);
	 		  add(a);
	 		  
	 		// label 2
	 		  
	 		   b = new JLabel("Customer_name :- ");
	 		  b.setFont(new Font("serif",Font.BOLD,20));
	 		  b.setForeground(Color.black);
	 		  b.setBounds(100, 90, 200, 100);
	 		  add(b);
	 		  
	 		 // label 3
	 		  
	 		
	 		
	 		   c = new JLabel("Medicine_name :- ");
	 		  c.setFont(new Font("serif",Font.BOLD,20));
	 		  c.setForeground(Color.black);
	 		  c.setBounds(100, 130, 200, 100);
	 		  add(c);
	 		 
	 		 // label 4
	 		  
	 		   d = new JLabel("Medicine_details :- ");
	 		  d.setFont(new Font("serif",Font.BOLD,20));
	 		  d.setForeground(Color.black);
	 		  d.setBounds(100, 170, 200, 100);
	 		  add(d);
	 		 
	 		   e = new JLabel("amount   :- ");
	 		  e.setFont(new Font("serif",Font.BOLD,20));
	 		  e.setForeground(Color.black);
	 		  e.setBounds(100, 210, 200, 100);
	 		  add(e);
	 		  
	 		 
	 		  
	 		   f =new JLabel("Add Bill Details");
	 		  f.setFont(new Font ("serif",Font.BOLD,25));
	 		  f.setForeground(Color.black);
	 		  f.setBounds(300,10,300,100);
	 		  add(f);
	 		  
	 		  
	 		  
	 		   g = new JLabel("Payment type :- ");
	 		  g.setFont(new Font("serif",Font.BOLD,20));
	 		  g.setForeground(Color.black);
	 		  g.setBounds(100, 250, 200, 100);
	 		  add(g);
	 		 
	 		   h = new JLabel("Quantity   :- ");
	 		  h.setFont(new Font("serif",Font.BOLD,20));
	 		  h.setForeground(Color.black);
	 		  h.setBounds(100, 290, 200, 100);
	 		  add(h);
	 		  
	 		  
	 		  
	 		  JButton z = new JButton ("ADD");
	 		  z.setFont(new Font("serif",Font.BOLD,20));
	 		  z.setBounds(350, 380, 100, 40);
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
	 		 
	 		  
	 		  
	 		 
	 		 //field 1 
	 		  
	 		  ab =new JTextField();
	 		  ab.setBounds(300, 90, 140, 20);
	         add(ab);	 
	         
	      // field 2
	 		  
	 		   ac = new JTextField();
	 		  ac.setBounds(300, 130, 140, 20);
	 		  add(ac);
	 		  
	 		// field 3  
	 		  
	 		  
	 		   ad = new JTextField();
	 		  ad.setBounds(300, 170, 140, 20);
	 		  add(ad);
	 		
	 		// field 4
	 		  
	 		   ae = new JTextField();
	 		  ae.setBounds(300, 210, 140, 20);
	 		  add(ae);
	 	 
	 		  
	 		   af = new JTextField();
	 		  af.setBounds(300, 250, 140, 20);
	 		  add(af);
	 		  
	 		  
	 		  String str[]= {"UPI","Cash","Card"};
	 		   ag = new JComboBox(str);
	 		  ag.setBounds(300, 290, 140, 20);
	 		  add(ag);
	          
	 		   ah = new JTextField();
	 		  ah.setBounds(300, 330, 140, 20);
	 		  add(ah);
	 		
	 	 
	 		  ImageIcon abc =new ImageIcon(ClassLoader.getSystemResource("New folder/background.jpg"));
	 		    Image  i4= abc.getImage().getScaledInstance(800,800,Image.SCALE_AREA_AVERAGING);
	 			ImageIcon i5= new ImageIcon(i4);
	 			JLabel image1 = new JLabel(i5);
	 			image1.setBounds(0,0,800,540);
	 			add(image1);
	 	 
	 	 

	 			 setBounds(350,200,850,540);
	 				setVisible(true);
	 		
	 }
	 	public static void main(String[] Args) {
	 		// TODO Auto-generated method stub
	       new bill ();
	 	}
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
try {
			
			String bill_id = ab.getText();
			String cust_name = ac.getText();
			String medicin_name = ad.getText();
		String medicin_details = ae.getText();
			String amount = af.getText();
			String pay_type = (String)ag.getSelectedItem();
			String Quantity = ah.getText();

			
			String query="insert into bill values('"+bill_id+"','"+cust_name+"','"+medicin_name+"','"+medicin_details+"','"+amount+"','"+pay_type+"','"+Quantity+"');";
			
			DB conn = new DB();

			boolean rs = conn.s.execute(query);
			
			
			if(rs==false) {
				setVisible(false);
				JOptionPane.showMessageDialog(null, "Congrats 💐 details entered Successfully");
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

}
